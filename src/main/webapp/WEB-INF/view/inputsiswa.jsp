<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
                <!-- Docs nav Kanan
                ================================================== -->

                <div class="span9">

                    <h3 style="text-align:center">FORM IDENTITAS PESERTA DIDIK</h3>

                     <form:form commandName="tambahsiswa" action="${pageContext.request.contextPath}/siswainput" method="POST"
                               class="bs-docs-example form-horizontal">

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">NIS :</label>
                            <div class="controls">
                                <form:input path="nis"/>
                            </div>
                        </div>

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Nama Peserta Didik :</label>
                            <div class="controls">
                                <form:input path="nama"/>
                                <span class="help-inline">(Lengkap)</span>
                            </div>
                        </div>

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Tempat :</label>
                            <div class="controls">
                                <form:input path="tempat_l"/>

                                <span class="help-inline">Tanggal Lahir : </span>
                                <form:input path="tanggal_l" type="date" />
                            </div>
                        </div>

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Jenis Kelamin :</label>
                            <div class="controls">
                                <label class="radio">
                                    <form:radiobutton path="jk_kelamin" value="Laki-laki" />Laki-laki
                                </label>
                                <label class="radio">
                                    <form:radiobutton path="jk_kelamin" value="Perempuan" />Perempuan
                                </label>
                            </div>
                        </div>

                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Alamat Peserta Didik :</label>
                            <div class="controls">
                                <form:textarea path="alamat" rows="3"/>
                            </div>
                        </div>


                        <div class="control-group info">
                            <label class="control-label" for="inputInfo">Penghasilan Orang Tua :</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">Rp.</span>
                                    <!--<input class="span2" id="appendedPrependedInput" type="text">-->
                                    <form:input path="gaji_ortu" class="span2"/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>


                        <div class="page-header">
                        </div>

                        <div class="controls">
                            <p><input type="submit" class="btn btn-primary" value="Simpan"/>
                                <a href="#" class="btn">Batal</a>
                            </p>
                        </div>

                    </form:form>

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

