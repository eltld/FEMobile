<?php 

$arr=array(

 array(
  "noticia_id"=>"1",
  "noticia_titulo"=>"titulo_1",
  "noticia_bajada"=>"titulo_bajada_1",
  "noticia_fecha"=>"14-4-2014",
  "noticia_url_image"=>"http://javatechig.com/wp-content/uploads/2013/06/Async_ListView.png"
 ),

 array(
 "noticia_id"=>"2",
 "noticia_titulo"=>"titulo_2",
  "noticia_bajada"=>"titulo_bajada_2",
 "noticia_fecha"=>"14-04-1985",
 "noticia_url_image"=>"http://i.stack.imgur.com/pMhDh.png"
 ),
 array(
       "noticia_id"=>"3",
       "noticia_titulo"=>"titulo_3",
       "noticia_bajada"=>"titulo_bajada_3",
       "noticia_fecha"=>"14-04-2015",
       "noticia_url_image"=>"http://i.stack.imgur.com/pMhDh.png"
 	)
);


echo json_encode($arr);

?>