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
	private static $connect;

	/** Constructor, crea la sesión */
	function __construct() {
		//$this->abreConexion();

		//if(!self::$conexion){
		//	echo '<p>Error al conectar con la base de datos</p>';
		//	exit;
		//}
	}

	public static function singleton(){
		if( self::$connect == null ) {
			self::$connect = new self();
			//self::$connect = mysqli_connect(self::$servidor,self::$user,self::$pass,self::$db);
			if((self::$connect = odbc_connect(self::$dns,self::$user,self::$pass)) === false) {
				throw new ErrorExcpetion(odbc_errormsg());
			}
		}
		return self::$connect;
	}

	private function abreConexion(){
		self::$conexion = mysqli_connect(self::$servidor,self::$user,self::$pass,self::$db);
	}

	private function cierraConexion(){
		self::$conexion->close();
	}

}
