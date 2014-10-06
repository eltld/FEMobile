<?php 

$arr=array(

 array(
  "evento_id"=>"1",
  "evento_titulo"=>"titulo_1",
  "evento_fecha"=>"14-4-2014",
  "evento_horario"=>"todo el dia",
  "evento_cuerpo"=>"cuerpo del evento",
  "evento_url_web"=>"http://javatechig.com/wp-content/uploads/2013/06/"
 ),
  array(
  "evento_id"=>"2",
  "evento_titulo"=>"titulo_2",
  "evento_fecha"=>"15-04-2014",
  "evento_horario"=>"desde 18:30 a 20:30",
  "evento_cuerpo"=>"cuerpo del evento",
  "evento_url_web"=>"http://javatechig.com/wp-content/uploads/2013/06/"
 ),


);


echo json_encode($arr);

?>