<?php

function sumar(float $n1, float $n2) {
    return $n1 + $n2;
};

function restar(float $n1, float $n2) {
    return $n1 - $n2;
};

function multiplicar(float $n1, float $n2) {
    return $n1 * $n2;
};

function dividir(float $n1, float $n2) {
    if ($n2 == 0) {
        return 0;
    } else {
        return $n1 / $n2;
    }
};


function mostrarMenu(){
    echo "1. Sumar\n";
    echo "2. Restar\n";
    echo "3. Multiplicar\n";
    echo "4. Dividir\n";
}

function mostrarOpciones() {
    echo "Elija una opción: ";
}

function mostrarResultado(float $resultado) {
    echo "El resultado es: $resultado\n";
}

function mostrarError() {
    echo "Error. El tipo de dato de los valores no es el correcto\n";
}

function calcular($opcion, float $n1, float $n2) {
    switch ($opcion) {
        case 1:
            return sumar($n1, $n2);
            break;
        case 2:
            return restar($n1, $n2);
            break;
        case 3:
            return multiplicar($n1, $n2);
            break;
        case 4:
            return dividir($n1, $n2);
            break;
        default:
            return "Opcion no valida";
            break;
    }
}

function procesar() {
    $opcion = $_REQUEST['opcion'];
  
    $n1 = $_REQUEST['n1'];
  
    $n2 = $_REQUEST['n2'];
    $resultado = calcular($opcion, $n1, $n2);
    mostrarResultado($resultado);
}

procesar();
?>