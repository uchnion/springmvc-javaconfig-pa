<%-- 
    Document   : home
    Created on : May 13, 2014, 10:38:59 AM
    Author     : Marojahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Aplikasi Pengolahan Nilai untuk pengajuan SNMPTN UNDANGAN dan Bidikmisi</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
        <link href="assets/css/docs.css" rel="stylesheet">
        <link href="assets/js/google-code-prettify/prettify.css" rel="stylesheet">

    </head>
    <body>
        <!-- Navbar
        ================================================== -->
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="login.html">SMAN 3 SELUMA</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- Subhead
        ================================================== -->

        <div class="container">
            <div class="page-header">

            </div>

            <!-- Docs nav
            ================================================== -->
            <div class="row">
                <div class="span3 bs-docs-sidebar">
                    <ul class="nav nav-list bs-docs-sidenav">
                        <li><a href="${pageContext.request.contextPath}/home"><i class="dropdown-submenu"></i> Beranda </a></li>
                        <li class="dropdown-submenu">
                            <a href="#">Data Siswa</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="#">Input Data Siswa</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Lihat Data Siswa</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="#">Nilai</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="#">Input Nilai</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Lihat Nilai</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><i class="dropdown-submenu"></i> Mata Pelajaran </a></li>
                        <li class="dropdown-submenu">
                            <a href="#">Kelas</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="#">Ubah Kelas</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><i class="dropdown-submenu"></i> SNMPTN Undangan </a></li>
                        <li><a href="#"><i class="dropdown-submenu"></i>  Bidikmisi</a></li>
                        <li><a href="#"><i class="dropdown-submenu"></i>  Akun</a></li>
                    </ul>
                </div>


                <!--Docs nav Kanan=======================================================-->

                <div class="span9">
                    <div class="page-header">
                    </div>
                    <div class="hero-unit">
                        <h1>Selamat Datang,</h1>
                        <p>Di Apliasi Pengolahan Nilai Raport untuk Pengajuan SNMPTN Undangan dan Bidikmisi</p>
                    </div>
                    <div class="page-header">
                    </div>
                </div>
            </div>

        </div>

        <!-- Footer
        ================================================== -->
        <footer class="footer">
            <div class="container">
                <p>Copyright &copy; 2014 &nbsp;Universitas Telkom</p>
                <p>Jl. Raya Bengkulu-Tais Km 37 Air Periukan 38881 </p>
                <p>Seluma, Bengkulu</p>
                <p>Phone. +62 251 8622642, +62 251 8622708 || e-Mail : <a href="">sman3seluma.humas@gmail.com</a>.</p>
                <p>All rights reserved.</p>
            </div>
        </footer>



        <!-- javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->


    </body>
</html>