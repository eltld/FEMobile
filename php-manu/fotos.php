<?php 

$arr=array(

 array(
  "GALERIA_ID"=>"1",
  "GALERIA_URL"=>"http://10.2.2.113/imagesnotis/noti1.jpg"
 ),

 array(
 "GALERIA_ID"=>"2",
 "GALERIA_URL"=>"http://10.2.2.113/imagesnotis/noti2.jpg"
 ),
 
 array(
       "GALERIA_ID"=>"3",
       "GALERIA_URL"=>"http://10.2.2.113/imagesnotis/noti3.jpg"
 	)
);

echo json_encode($arr);

?>