<?php
/**
 * Autor: Cristóbal Martínez del Vals
 * Fecha: 22/02/14
 * Hora: 12:29
 */

class conexionDB {

	private static $servidor = 'localhost';
	private static $user = '';
	private static $pass = '';
	private static $db = '';
	private static $conexionClass;
	private static $conexion;

	/** Constructor, crea la sesión */
	function __construct() {
		//$this->abreConexion();

		//if(!self::$conexion){
		//	echo '<p>Error al conectar con la base de datos</p>';
		//	exit;
		//}
	}

	public static function singleton(){
		if( self::$conexionClass == null ) {
			self::$conexionClass = new self();
		}
		return self::$conexionClass;
	}

	private function abreConexion(){
		self::$conexion = mysqli_connect(self::$servidor,self::$user,self::$pass,self::$db);
	}

	private function cierraConexion(){
		self::$conexion->close();
	}

}