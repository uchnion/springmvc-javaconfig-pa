<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Nilai Siswa</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- styles -->

        <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/assets/css/docs.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/assets/css/prettify.css" rel="stylesheet">

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

            <!-- Docs nav kiri
            ================================================== -->
            <!-- Docs nav
            ================================================== -->
            <div class="row">
                <div class="span3 bs-docs-sidebar">
                    <ul class="nav nav-list bs-docs-sidenav">
                        <li><a href="${pageContext.request.contextPath}/home"><i class="dropdown-submenu"></i> Beranda </a></li>
                        <li class="dropdown-submenu">
                            <a href="#">Data Siswa</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/siswainput">Input Data Siswa</a></li>
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/siswatampil">Lihat Data Siswa</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="#">Nilai</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="#">Input Nilai</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Lihat Nilai</a></li>
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/mapeltampil"><i class="dropdown-submenu"></i> Mata Pelajaran </a></li>
                        <li class="dropdown-submenu">
                            <a href="#">Kelas</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/kelastampil">Lihat Kelas</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Perubahan Kelas Siswa</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="#">Ekskul</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/ekskultampil">Lihat Ekskul</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Ekskul Siswa</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><i class="dropdown-submenu"></i> SNMPTN Undangan </a></li>
                        <li><a href="#"><i class="dropdown-submenu"></i>  Bidikmisi</a></li>
                        <li><a href="${pageContext.request.contextPath}/akuntampil"><i class="dropdown-submenu"></i>  Akun</a></li>
                    </ul>
                </div>
                <!-- Docs nav Kanan
                ================================================== -->

                <div class="span9">
                    <h3 style="text-align:center">SISWA SMAN 3 SELUMA</h3>
                    <form class="bs-docs-example form-horizontal">
                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Tahun Ajaran :</label>
                            <div class="controls">
                                <select class="span3">
                                    <option>2001/2002</option>
                                    <option>2002/2003</option>
                                    <option>2003/2004</option>
                                    <option>2004/2005</option>
                                    <option>2005/2006</option>
                                </select>
                            </div>
                        </div>

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Kelas :</label>
                            <div class="controls">
                                <select class="span3">
                                    <option>XA</option>
                                    <option>XI IPA1</option>
                                    <option>XI IPS1</option>
                                    <option>XII IPA1</option>
                                    <option>XII IPS1</option>
                                </select>
                            </div>
                        </div>

                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Nama Peserta Didik</th>
                                    <th>Nomor Induk Siswa</th>
                                    <th>Data Lengkap</th>
                                    <th>Keterangan</th>
                                </tr>
                            </thead>

                            <c:forEach var="siswa" items="${BanyakSiswa}">
                                <tbody>
                                    <tr>
                                        <td>${siswa.siswaId}</td>
                                        <td>${siswa.nama}</td>
                                        <td>${siswa.nis}</td>
                                        <td><a href="${pageContext.request.contextPath}/siswatampil/pribadi/${siswa.siswaId}">Lihat</a></td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/siswaedit/${siswa.siswaId}" onclick="">Edit</a>&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;
                                            <a href="${pageContext.request.contextPath}/siswadelete/${siswa.siswaId}" onclick="return confirm('Apakah Anda yakin akan menghapus ${siswa.nama} dari daftar siswa SMAN 3 Seluma ? ')">Hapus</a>
                                        </td>
                                    </tr>
                                </tbody>
                            </c:forEach>

                        </table>
                    </form>
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


    </body>
</html>

