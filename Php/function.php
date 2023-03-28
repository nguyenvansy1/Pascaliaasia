<?php
function printOddNumbers() {
    for ($i = 1; $i <= 10; $i++) {
        if ($i % 2 != 0) {
            echo $i . " ";
        }
    }
}
printOddNumbers();

function isPrime($number){
    if ($number < 2) {
        return false;
    }

    for ($i = 2; $i <= sqrt($number); $i++) {
        if ($number % $i == 0) {
            return false;
        }
    }

    return true;
}

isPrime(4);


function fibonacci($n) {
    $fib = array();
    $fib[0] = 0;
    $fib[1] = 1;
 
    for ($i = 2; $i < $n; $i++) {
       $fib[$i] = $fib[$i-1] + $fib[$i-2];
    }
 
    return $fib;
 }
 

 $result = fibonacci(10);

 foreach ($result as $value) {
    echo $value . " ";
 }
?>