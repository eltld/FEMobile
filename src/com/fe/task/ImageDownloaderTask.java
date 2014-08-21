package com.fe.task;

import java.io.InputStream;
import java.lang.ref.WeakReference;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fe.activity.ActivityComedor;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.widget.ImageView;


/**
 * Clase ImageDownloaderTask , la cual permite 
 * descargar la imagen en background
 * @author David Garcia
 * @Dathe :  20-08-2014
 *
 */

public class ImageDownloaderTask extends AsyncTask<String, Void, Bitmap> {

	
	private final WeakReference imageViewReference;
	private static final Logger logger = (Logger) LoggerFactory.getLogger(ImageDownloaderTask.class);
	
	public ImageDownloaderTask(ImageView imageView)
	{
		imageViewReference= new WeakReference(imageView);
	}
	
	@Override
	protected Bitmap doInBackground(String... arg0) {
		// TODO Auto-generated method stub
		return downloadBitmap(arg0[0]);
	}

	@Override
	// Once the image is downloaded, associates it to the imageView
	protected void onPostExecute(Bitmap bitmap) {
		if (isCancelled()) {
			bitmap = null;
		}
 
		if (imageViewReference != null) {
			ImageView imageView = (ImageView) imageViewReference.get();
			if (imageView != null) {
 
				if (bitmap != null) {
					imageView.setImageBitmap(bitmap);
				} else {
					//MY Default Image
					imageView.setImageDrawable(imageView.getContext().getResources()
							.getDrawable(R.drawable.alert_light_frame));
				}
			}
 
		}
	}  
	
	static Bitmap downloadBitmap(String arg0) {
		final AndroidHttpClient client = AndroidHttpClient.newInstance("Android");
		final HttpGet getRequest = new HttpGet(arg0);
		try {
			HttpResponse response = client.execute(getRequest);
			final int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_OK) {
				logger.debug("ImageDownloader", "Error " + statusCode
						+ " while retrieving bitmap from " + arg0);
				return null;
			}
 
			final HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream inputStream = null;
				try {
					inputStream = entity.getContent();
					final Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
					return bitmap;
				} finally {
					if (inputStream != null) {
						inputStream.close();
					}
					entity.consumeContent();
				}
			}
		} catch (Exception e) {
			// Could provide a more explicit error message for IOException or
			// IllegalStateException
			getRequest.abort();
			logger.debug("ImageDownloader", "Error while retrieving bitmap from " + arg0);
		} finally {
			if (client != null) {
				client.close();
			}
		}
		return null;
	}
	
	
}
