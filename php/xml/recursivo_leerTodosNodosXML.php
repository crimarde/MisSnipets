<?php
	$xml = simplexml_load_file ( 'Dades.xml' );
	if (! $xml) {
		exit ('No se ha encontrado el XMl especificado');
	}
	
	echo "<b>Saber cuantos anexos tiene el xml dado:</b><br>";
	$resultado = $xml->xpath ( "//Annex" );
	echo "El documento tiene " . sizeof($resultado) . " anexos (contados con sizeOf)<br>";
	
	echo "<b>Obtencion de todas las variables de un anexo:</b><br>";
	$resultado = $xml->xpath ( "//Annex" );
	
	echo "Llamo a la recursiva:<br>";
	for($i=0;$i<=sizeof($resultado);$i++){
		echo "<h1>ANEXO " .$i . "</h1>";
		recursiva2($resultado[$i],"DadesTramesa/DadesEns/Annex");
		echo "<br><br><br><br><br><br>";
	}
	
	function recursiva2($nodo, $xpath){
		foreach ($nodo as $variable=>$valor){	
			//Si el nodo no tiene hijos lo muestro por pantalla
			if($valor->count() == 0){  //sizeof($valor->children()) == 0
				$padre = $nodo->getName();
				if($valor != ''){
					//echo "Nodo padre: ".$padre ." Nodo:   ". $variable. "  Valor:  ". utf8_decode($valor)."<br>";  //$valor->__toString()
					echo "Nodo: " .$xpath. "/" . $variable. "  Valor:  ". utf8_decode($valor)."<br>";  //$valor->__toString()
				}
			}else{		//Si el nodo tiene hijos recursiva
				$xpath = $xpath ."/". $variable;
				echo "<b>El xpath es ".$xpath."</b><br>";
				recursiva2($valor,$xpath);
			}
		}
	}