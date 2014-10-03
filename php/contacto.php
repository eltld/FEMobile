<?php



$nombre=$_POST["nombre"];
$apellido=$_POST["apellido"];
$facultad=$_POST["facultad"];
$email=$_POST["email"];
$message=$_POST["message"];




$enlace =  mysql_connect('localhost', 'root', 'd3zinf04m');
if (!$enlace) {
    die('No pudo conectarse: ' . mysql_error());
}
else
	{ 
	// Hacer que foo sea la base de datos actual
      $bd_seleccionada = mysql_select_db('base02', $enlace);
      if (!$bd_seleccionada) {
         die ('No se puede usar foo : ' . mysql_error());
      }else
      {
         
         $consulta =  "insert into t_contacto(nombre_cont,apellido_cont,email_cont,facultad_cont,mensaje_cont)values('".$nombre."','".$apellido."','".$email."','".$facultad."','".$mensaje."')";
          
           echo "consulta".$consulta;

          // Ejecutar la consulta
           $resultado = mysql_query($consulta);

         // Comprobar el resultado
          // Lo siguiente muestra la consulta real enviada a MySQL, y el error ocurrido. Útil para depuración.
         if (!$resultado) {
            $mensaje  = 'Consulta no válida: ' . mysql_error() . "\n";
            $mensaje .= 'Consulta completa: ' . $consulta;
           die($mensaje);
          }else
          {
          	echo "Se ejecuto la consulta"

          }
            
         */

      }
  }

mysql_close($enlace);



?>