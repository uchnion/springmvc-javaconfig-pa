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
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/mplsis/input">Input Nilai</a></li>
                                <li><i class="dropdown-submenu"></i><a href="#">Lihat Nilai</a></li>
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/mapeltampil"><i class="dropdown-submenu"></i> Mata Pelajaran </a></li>
                        <li class="dropdown-submenu">
                            <a href="#">Kelas</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/kelastampil">Lihat Kelas</a></li>
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/klssis/input">Perubahan Kelas Siswa</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="#">Ekskul</a>
                            <ul class="dropdown-menu">
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/ekskultampil">Lihat Ekskul</a></li>
                                <li><i class="dropdown-submenu"></i><a href="${pageContext.request.contextPath}/ekssis/input">Ekskul Siswa</a></li>
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/snmptnu"><i class="dropdown-submenu"></i> SNMPTN Undangan </a></li>
                        <li><a href="${pageContext.request.contextPath}/bidikmisi"><i class="dropdown-submenu"></i>  Bidikmisi</a></li>
                        <li><a href="${pageContext.request.contextPath}/akuntampil"><i class="dropdown-submenu"></i>  Akun</a></li>
                    </ul>
                </div>
                <!-- Docs nav Kanan
                ================================================== -->

                <div class="span9">
                    <h3 style="text-align:center">IDENTITAS PESERTA DIDIK</h3>
                    <form class="bs-docs-example form-horizontal">

                        <c:forEach var="pribadi" items="${TampilPribadi}">

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Nama Peserta Didik :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.nama}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">NIS :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.nis}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Tempat, Tanggal Lahir :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.tempat_l},</span>
                                    <span class="help-inline">${pribadi.tanggal_l}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Jenis Kelamin :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.jenisKelamin}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Agama :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.agama}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Anak Ke- :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.anak_ke}</span><span class="help-inline">(Satu)</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Status dalam Keluarga :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.statinKeluarga}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Alamat Peserta Didik :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.alamat}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Telepon :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.telepon}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Diterima di Dekolah ini</label>
                            </div>
                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Di Kelas :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.dikelas}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Pada Tanggal :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.padatgl}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Pada Tanggal :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.semester}</span>
                                </div>
                            </div>
                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Nama Sekolah Asal :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.skol_asal}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Nama Orang Tua</label>
                            </div>
                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Ayah :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.namaayah}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Ibu :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.namaibu}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Alamat Orang Tua :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.alamatortu}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Telepon Orang Tua :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.telepon_ortu}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Pekerjaan Orang Tua</label>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Ayah :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.kerjaayah}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Ibu :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.kerjaibu}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Penghasilan Orang Tua :</label>
                                <div class="controls">
                                    <span class="help-inline">Rp.</span>
                                    <span class="help-inline">${pribadi.gaji_ortu}/Bulan</span>
                                </div>
                            </div>

                            <div class="page-header">
                            </div>


                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Nama Wali :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.namawali}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Alamat Wali :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.alamatWali}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Telepon Wali :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.teleponWali}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Pekerjaan Wali :</label>
                                <div class="controls">
                                    <span class="help-inline">${pribadi.kerjaWali}</span>
                                </div>
                            </div>

                            <div class="control-group info">
                                <label class="control-label" for="inputInfo">Penghasilan Wali :</label>
                                <div class="controls">
                                    <span class="help-inline">Rp.</span>
                                    <span class="help-inline">${pribadi.gajiWali}/Bulan</span>
                                </div>
                            </div>
                                
                            <div class="controls">
                                <p><a href="${pageContext.request.contextPath}/siswatampil" class="btn btn-primary" onclick=""><- Kembali</a> 
                                </p>
                            </div>
                    </div>

                    <div class="page-header">
                    </div>



                </c:forEach>

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

