<?php
for ($i = 1; $i <= 5; $i++) {
    echo $i * 10 . "<br>";
  }

$i = 10;
do {
   echo $i . "<br>";
   $i += 10;
} while($i <= 50);

for ($i = 0; $i < 10; $i += 2) {
    echo $i . " ";
  }


for ($i = 1; $i <= 11; $i++) {
 for ($j = 1; $j <= $i; $j++) {
   echo "*";
 }
 echo "<br/>";
}  
?>