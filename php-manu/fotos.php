<?php 

$arr=array(

 array(
  "GALERIA_ID"=>"1",
  "GALERIA_URL"=>"http://170.210.240.251/imagesnotis/noti1.jpg"
 ),

 array(
 "GALERIA_ID"=>"2",
 "GALERIA_URL"=>"http://170.210.240.251/imagesnotis/noti2.jpg"
 ),
 
 array(
       "GALERIA_ID"=>"3",
       "GALERIA_URL"=>"http://170.210.240.251/imagesnotis/noti3.jpg"
 	)
);

echo json_encode($arr);

?>