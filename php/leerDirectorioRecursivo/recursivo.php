<?php
	$path = 'C:/pdf/';
	
	recursivo ();
	//primerNivel();
	//enDosPasos();
	exit ();
	
	// Obtiene el primer nivel de carpetas
	$dir_nivel_1 = new RecursiveDirectoryIterator ( $path, RecursiveDirectoryIterator::SKIP_DOTS );
	// $files = new RecursiveIteratorIterator($dir, RecursiveIteratorIterator::SELF_FIRST);
	
	
	
	echo "<br><----------------------------><br>";
	function recursivo() {
		/* Funcionando */
		// Obtiene el primer nivel de carpetas
		$path = 'C:/a/';
		$dir = new RecursiveDirectoryIterator ( $path, RecursiveDirectoryIterator::SKIP_DOTS );
		$files = new RecursiveIteratorIterator ( $dir, RecursiveIteratorIterator::SELF_FIRST );
		
		echo "[$path]\n<br>";
		foreach ( $files as $file ) {
			if ($file->isDir ()) {
				echo $file . "\n<br>";
			}
			if ($file->getExtension () == 'xml') {
				$indent = str_repeat ( '   ', $files->getDepth () );
				echo $indent . " |- $file\n<br>";
			}
		}
		echo "<br><----------------------------><br>";
	}
	
	function primerNivel() {
		/* Funcionando */
		// Obtiene el primer nivel de carpetas
		$path = 'C:/pdf/';
		$dir = new RecursiveDirectoryIterator ( $path, RecursiveDirectoryIterator::SKIP_DOTS );
		// Solo hay que eliminar le segundo recursivo
		
		echo "[$path]\n<br>";
		foreach ( $dir as $file ) {
			if ($file->isDir ()) {
				echo $file . "\n<br>";
			}
			if ($file->getExtension () == 'xml') {
				$indent = str_repeat ( '   ', $files->getDepth () );
				echo $indent . " |- $file\n<br>";
			}
		}
		echo "<br><----------------------------><br>";
	}
	
	function enDosPasos() {
		$path = 'C:/pdf/';
		$dir = new RecursiveDirectoryIterator ( $path, RecursiveDirectoryIterator::SKIP_DOTS );
		echo "[$path]\n<br>";
		foreach ( $dir as $dir_nivel_1 ) {
			$dir_recursivo = new RecursiveIteratorIterator ( $dir, RecursiveIteratorIterator::SELF_FIRST );
			foreach ( $dir_recursivo as $files ) {
				if ($files->isDir ()) {
					echo $files . "\n<br>";
				}
				if ($files->getExtension () == 'xml') {
					// $indent = str_repeat(' ', $files->getDepth());
					echo " |- $files\n<br>";
				}
				;
			}
		}
	}
	