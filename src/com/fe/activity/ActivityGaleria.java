package com.fe.activity;

import com.fe.R;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;


/**
 * 
 * @author : David Garcia
 * @dathe  : 27-08-2014
 *
 */
public class ActivityGaleria extends Activity{

	DisplayImageOptions options;
	protected ImageLoader imageLoader;
	String[] imageUrls={"http://i.stack.imgur.com/pMhDh.png",
			            "http://javatechig.com/wp-content/uploads/2013/06/Async_ListView.png",
			            "http://i.stack.imgur.com/pMhDh.png",
			            "http://img4.wikia.nocookie.net/__cb20120718024112/fantendo/images/thumb/6/6e/Small-mario.png/381px-Small-mario.png",
			            "http://2.bp.blogspot.com/-t-BKJl51VlM/UM8quCWcoYI/AAAAAAAAA8M/hs9lWDSf0fQ/s400/base_faixa+(1)gerteerewrwsdsasdsd.png",
			            "http://1.bp.blogspot.com/-prQSKUayZtw/T8HrQ5H_LWI/AAAAAAAASzs/4znOQs2kXto/s1600/rosas%252Bpng%252B(0).png"};

	private GridView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.gallery_image);
	

	
	options = new DisplayImageOptions.Builder()
	.showImageOnLoading(R.drawable.ic_stub)
	.showImageForEmptyUri(R.drawable.ic_empty)
	.showImageOnFail(R.drawable.ic_error)
	.cacheInMemory(true)
	.cacheOnDisk(true)
	.considerExifParams(true)
	.bitmapConfig(Bitmap.Config.RGB_565)
	.build();
	
	ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
	.threadPriority(Thread.NORM_PRIORITY - 2)
	.denyCacheImageMultipleSizesInMemory()
	.diskCacheFileNameGenerator(new Md5FileNameGenerator())
	.diskCacheSize(50 * 1024 * 1024) // 50 Mb
	.tasksProcessingOrder(QueueProcessingType.LIFO)
	.writeDebugLogs() // Remove for release app
	.build();
    // Initialize ImageLoader with configuration.
    ImageLoader.getInstance().init(config);
	imageLoader=ImageLoader.getInstance();
	
	listView = (GridView) findViewById(R.id.grid_gallery_image);
	((GridView) listView).setAdapter(new ImageAdapter());
	
	}
	
 protected class FotoAsyncTask extends AsyncTask<String,Void, String>{

	@Override
	protected String doInBackground(String... arg0) {
		// TODO Auto-generated method stub
		return null;
	}
 
  
 
 }
 
	static class ViewHolder {
		ImageView imageView;
		ProgressBar progressBar;
	}

 
 public class ImageAdapter extends BaseAdapter {
		@Override
		public int getCount() {
			return imageUrls.length;
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			final ViewHolder holder;
			View view = convertView;
			if (view == null) {
				view = getLayoutInflater().inflate(R.layout.gallery_image_single, parent, false);
				holder = new ViewHolder();
				assert view != null;
				holder.imageView = (ImageView) view.findViewById(R.id.image);
				holder.progressBar = (ProgressBar) view.findViewById(R.id.progress);
				view.setTag(holder);
			} else {
				holder = (ViewHolder) view.getTag();
			}

			imageLoader.displayImage(imageUrls[position], holder.imageView, options, new SimpleImageLoadingListener() {
										 @Override
										 public void onLoadingStarted(String imageUri, View view) {
											 holder.progressBar.setProgress(0);
											 holder.progressBar.setVisibility(View.VISIBLE);
										 }

										 @Override
										 public void onLoadingFailed(String imageUri, View view,
												 FailReason failReason) {
											 holder.progressBar.setVisibility(View.GONE);
										 }

										 @Override
										 public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
											 holder.progressBar.setVisibility(View.GONE);
										 }
									 }, new ImageLoadingProgressListener() {
										 @Override
										 public void onProgressUpdate(String imageUri, View view, int current,
												 int total) {
											 holder.progressBar.setProgress(Math.round(100.0f * current / total));
										 }
									 }
			);

			return view;
		}
 
 }
 
}
