<?php

namespace App\Http\Controllers;
use Illuminate\Support\Facades\DB;
use Illuminate\Http\Request;
use App\Models\Example;
class HomeController extends Controller
{
    public function index(Request $request)
    {
       $data = Example::where('name', 'LIKE', '%sy%')->get();
       return $data;
    }
    
    

}
