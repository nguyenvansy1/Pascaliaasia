
<?php
$a = [3, 4, 1, 19, 20, 99];


$a[] = 5;


$a[0] = 10;


$max = max($a);
$min = min($a);

echo "Mảng sau khi thêm phần tử và sửa giá trị:\n";
print_r($a);
echo "Giá trị lớn nhất trong mảng là: $max\n";
echo "Giá trị nhỏ nhất trong mảng là: $min\n";



$a = [3, 4, 1, 19, 20, 99];
$sum = array_sum($a); 
$count = count($a); 
$average = $sum / $count; 
echo "Giá trị trung bình cộng của các số trong mảng là: " . $average;


$a = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
];

$sum = 0;

for ($i = 0; $i < count($a); $i++) {
    for ($j = 0; $j < count($a[$i]); $j++) {
        $sum += $a[$i][$j];
    }
}

echo $sum;


function isPrime($n) {
    if($n <= 1) return false;
    for($i = 2; $i <= sqrt($n); $i++) {
        if($n % $i == 0) return false;
    }
    return true;
}


$a = [1, 2, 3, 4, 5, 6, 7, 8, 9];


foreach($a as $num) {
    if(isPrime($num)) {
        echo $num . " là số nguyên tố<br>";
    }
}
?>