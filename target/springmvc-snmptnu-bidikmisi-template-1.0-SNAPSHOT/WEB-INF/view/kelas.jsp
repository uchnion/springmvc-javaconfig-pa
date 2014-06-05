<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Home Aplikasi Pengolahan Nilai untuk pengajuan SNMPTN UNDANGAN dan Bidikmisi</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
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

                <div class="span9">

                    <h3 style="text-align:center">REKAM KELAS SMAN 3 SELUMA</h3>
                    <!--
                    
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
                    <option>X</option>
                    <option>XI IPA</option>
                    <option>XI IPS</option>
                    <option>XII IPA</option>
                    <option>XII IPS</option>
          </select>
          </div>
        </div> 
                    -->
                    <div class="pull-right">
                        <input type="text" class="input-medium search-query">
                        <button type="submit" class="btn">Search</button>
                    </div>
                    <table class="table table-striped">

                        <thead>
                            <tr>
                                <th>No</th>
                                <th>Kelas</th>
                                <th>Kode Kelas</th>
                                <th>Tahun Ajaran</th>
                                <th>Keterangan</th>
                            </tr>
                        </thead>

                        <c:forEach var="kelas" items="${BanyakKelas}">

                            <tbody>
                                <tr>

                                    <td></td>
                                    <td> ${kelas.namakelas} </td>
                                    <td> ${kelas.kodekelas} </td>
                                    <td> ${kelas.tahunajaran} </td>
                                    <td><a href="${pageContext.request.contextPath}/kelasedit/${kelas.kodekelas}" onclick="">Edit</a>&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;
                                        <a href="${pageContext.request.contextPath}/kelasdelete/${kelas.kodekelas}" onclick="return confirm('Apakah Anda yakin akan menghapus Kelas ${kelas.namakelas} pada tahun ajaran ${kelas.tahunajaran}? ')">Hapus</a></td>

                                </tr>
                            </tbody>

                        </c:forEach>
                    </table>
                    <div class="pull-right">
                        <p><a href="${pageContext.request.contextPath}/kelasinput" class="btn btn-primary">+ Mata Pelajaran</a></p>
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

