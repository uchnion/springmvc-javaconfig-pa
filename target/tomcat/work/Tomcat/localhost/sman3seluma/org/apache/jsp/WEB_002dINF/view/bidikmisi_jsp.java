/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2014-06-26 02:55:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bidikmisi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Aplikasi Pengolahan Nilai untuk pengajuan SNMPTN UNDANGAN dan Bidikmisi</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Le styles -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/docs.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/prettify.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar\n");
      out.write("        ================================================== -->\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"navbar-inner\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"brand\" href=\"login.html\">SMAN 3 SELUMA</a>\n");
      out.write("                    <div class=\"nav-collapse collapse\">\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Subhead\n");
      out.write("        ================================================== -->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Docs nav\n");
      out.write("            ================================================== -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"span3 bs-docs-sidebar\">\n");
      out.write("                    <ul class=\"nav nav-list bs-docs-sidenav\">\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/home\"><i class=\"dropdown-submenu\"></i> Beranda </a></li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Data Siswa</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/siswainput\">Input Data Siswa</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/siswatampil\">Lihat Data Siswa</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Nilai</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/mplsis/input\">Input Nilai</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Lihat Nilai</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/mapeltampil\"><i class=\"dropdown-submenu\"></i> Mata Pelajaran </a></li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Kelas</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/kelastampil\">Lihat Kelas</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/klssis/input\">Perubahan Kelas Siswa</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Ekskul</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ekskultampil\">Lihat Ekskul</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ekssis/input\">Ekskul Siswa</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/snmptnu\"><i class=\"dropdown-submenu\"></i> SNMPTN Undangan </a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bidikmisi\"><i class=\"dropdown-submenu\"></i>  Bidikmisi</a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/akuntampil\"><i class=\"dropdown-submenu\"></i>  Akun</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--Docs nav Kanan=======================================================-->\n");
      out.write("\n");
      out.write("                <div class=\"span9\">\n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hero-unit\">\n");
      out.write("                        <h1>Selamat Datang,</h1>\n");
      out.write("                        <p>Bidikmisi</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer\n");
      out.write("        ================================================== -->\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>Copyright &copy; 2014 &nbsp;Universitas Telkom</p>\n");
      out.write("                <p>Jl. Raya Bengkulu-Tais Km 37 Air Periukan 38881 </p>\n");
      out.write("                <p>Seluma, Bengkulu</p>\n");
      out.write("                <p>Phone. +62 251 8622642, +62 251 8622708 || e-Mail : <a href=\"\">sman3seluma.humas@gmail.com</a>.</p>\n");
      out.write("                <p>All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- javascript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}