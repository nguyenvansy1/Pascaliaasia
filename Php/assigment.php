<?php
function xep_hang_diem($diem) {
    if ($diem >= 60) {
        return "Hạng Nhất";
    } elseif ($diem >= 45 && $diem <= 59) {
        return "Hạng Nhì";
    } elseif ($diem >= 33 && $diem <= 44) {
        return "Hạng Ba";
    } else {
        return "Loại";
    }
}

echo xep_hang_diem(66);


function findX1($a, $b) {
    // Kiểm tra điều kiện a khác 0
    if ($a == 0) {
        return "Phương trình không phải là phương trình đúng!";
    } else {
        // Tính giá trị của x và trả về
        $x = -$b / $a;
        return $x;
    }
}

echo findX1(2, 3); 
?>