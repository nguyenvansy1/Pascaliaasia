<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\UserController;
use Illuminate\Http\Request ;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

// Route::get('/', function () {
//     return view('welcome');
// });

 Route::get('/hello-world', function () {
     return 'Hello World';
 });

 Route::get('/example', [HomeController::class, 'index']);


 Route::get('/index', function (Request $request) {
     $view = $request->view;
     if ($view === 'welcome') {
         return view('welcome');
     } else {
         return view('index');
     }
 });
 Route::resource('users', UserController::class);