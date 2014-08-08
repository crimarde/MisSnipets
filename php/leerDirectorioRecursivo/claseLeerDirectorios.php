<?php
$ruta = '';
$lista = new ListaDirectorios($ruta,true,false,false,true);

class ListaDirectorios{
	
	/** Introducir la ruta a analizar */
	private $ruta;
	private $mostrarArchivos;
	private $mostrarDirectorios;
	private $salidaHtml;
	private $mostrarRutaComleta;
	
	/**
	 * Muestra el arbol de directorios y archivos a partir de una ruta dada
	 * 
	 * @param string $ruta Es la ruta a analizar
	 * @param boolean $mostrarDirectorios -> true para imprimir los directorios
	 * @param boolean $mostrarArchivos -> true para mostrar los archivos
	 * @param boolean $mostarRutaCompleta -> true para mostrar la ruta completa del archivo
	 * @param boolean $salidaHtml -> true para producir una salida html
	 */
	public function __construct($ruta = 'C:/', $mostrarDirectorios=true, $mostrarArchivos=true, $mostarRutaCompleta=true, $salidaHtml = true){
		$this->ruta = ($this->endsWith($ruta, '/'))? $ruta : $ruta.'/';
		$this->mostrarArchivos = $mostrarArchivos;
		$this->mostrarDirectorios = $mostrarDirectorios;
		$this->mostrarRutaComleta = $mostarRutaCompleta;
		
		if ($salidaHtml){
			$this->cabecera();
		}
		
		if ($mostrarArchivos === true || $mostrarDirectorios === true){
			$this->listar_directorios_ruta($this->ruta);
		}
		
		if ($salidaHtml){
			$this->pie();
		}
	}
	
	/** Metodo que lista los archivos del directorio y subdirectorios (recursivo) de una ruta dada */
	private function listar_directorios_ruta($ruta) {
		// abrir un directorio y listarlo recursivo
		if (is_dir ( $ruta )) {
			if ($directorio = opendir ( $ruta )) {
				while ( ($file = readdir ( $directorio )) !== false ) {
					if($this->mostrarArchivos){
						if($this->endsWith($file, '.xml')){
							//echo "<li>";
							echo ($this->mostrarRutaComleta)? $ruta.$file."<br>": $file."<br>";		//echo "<br>Nombre de archivo: $file : Es un: " . filetype($ruta . $file);
							//echo "</li>";
						}	
					}
					
					if (is_dir ( $ruta . $file ) && $file != "." && $file != "..") {
						// Descomentar para mostrar los directorios
						if($this->mostrarDirectorios){
							//echo "<ul>";
							echo $ruta.$file."<br>";	
						}
						
						$this->listar_directorios_ruta ( $ruta . $file . "/" );  //Si es un directorio se hace una llamada recursiva
						
						if($this->mostrarDirectorios){
							//echo "</ul>";
						}
					}
				}
				closedir ( $directorio );
			}
		} else {
			echo "<h2>La ruta no es valida</h2>";
		}		
	}

	private function startsWith($pajar, $aguja){
		return $aguja === "" || strpos($pajar, $aguja) === 0;
	}
	
	private function endsWith($pajar, $aguja){
		return $aguja === "" || substr($pajar, -strlen($aguja)) === $aguja;
	}
	
	private function cabecera(){
		echo "<!Doctype html><html><head></head><body>";
	}
	
	private function pie(){
		echo "</body></html>";
	}
	
}
