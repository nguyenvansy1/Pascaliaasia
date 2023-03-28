<?php
$age = 25; 

if ($age < 30) {
    echo "Tôi còn trẻ";
} else {
    echo "Tôi không còn quá trẻ";
}


$num = 6; 
if ($num % 2 == 0) {
    echo $num . " là số chẵn";
} else {
    echo $num . " là số lẻ";
}

$week = 3;

switch ($week) {
    case 1:
        echo "Thứ hai";
        break;
    case 2:
        echo "Thứ ba";
        break;
    case 3:
        echo "Thứ tư";
        break;
    case 4:
        echo "Thứ năm";
        break;
    case 5:
        echo "Thứ sáu";
        break;
    case 6:
        echo "Thứ bảy";
        break;
    case 7:
        echo "Chủ nhật";
        break;
    default:
        echo "Không hợp lệ";
        break;
}
?>