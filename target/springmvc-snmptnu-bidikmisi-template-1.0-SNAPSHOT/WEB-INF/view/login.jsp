<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Aplikasi Pengolahan Nilai untuk pengajuan SNMPTN UNDANGAN dan Bidikmisi</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/docs.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/prettify.css" rel="stylesheet">

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
                        <li><a href="login.html"><i class="icon-chevron-right"></i> Login </a></li>
                    </ul>
                </div>
                <div class="span9">
                    <form class="bs-docs-example form-horizontal">
                        <div class="page-header">
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="inputEmail">Username</label>
                            <div class="controls">
                                <input type="text" id="inputuser" placeholder="Username">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="inputPassword">Password</label>
                            <div class="controls">
                                <input type="password" id="inputPassword" placeholder="Password">
                            </div>
                        </div>
                        <div class="control-group">
                            <div class="controls">
                                <label class="checkbox">
                                    <input type="checkbox"> Remember me
                                </label>
                                <button type="submit" class="btn">Sign in</button>
                            </div>
                        </div>
                        <div class="page-header">
                        </div>
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



        <!-- javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->


    </body>
</html>

