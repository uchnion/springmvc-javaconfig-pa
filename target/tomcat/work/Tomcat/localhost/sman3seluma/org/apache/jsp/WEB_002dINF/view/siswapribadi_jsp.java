/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2014-06-21 10:48:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class siswapribadi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Input Nilai Siswa</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- styles -->\n");
      out.write("\n");
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
      out.write("            <!-- Docs nav kiri\n");
      out.write("            ================================================== -->\n");
      out.write("            <!-- Docs nav\n");
      out.write("            ================================================== -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"span3 bs-docs-sidebar\">\n");
      out.write("                    <ul class=\"nav nav-list bs-docs-sidenav\">\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/home\"><i class=\"dropdown-submenu\"></i> Beranda </a></li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Data Siswa</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Input Data Siswa</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Lihat Data Siswa</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Nilai</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Input Nilai</a></li>\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Lihat Nilai</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"dropdown-submenu\"></i> Mata Pelajaran </a></li>\n");
      out.write("                        <li class=\"dropdown-submenu\">\n");
      out.write("                            <a href=\"#\">Kelas</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><i class=\"dropdown-submenu\"></i><a href=\"#\">Ubah Kelas</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"dropdown-submenu\"></i> SNMPTN Undangan </a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"dropdown-submenu\"></i>  Bidikmisi</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"dropdown-submenu\"></i>  Akun</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- Docs nav Kanan\n");
      out.write("                ================================================== -->\n");
      out.write("\n");
      out.write("                <div class=\"span9\">\n");
      out.write("                    <h3 style=\"text-align:center\">IDENTITAS PESERTA DIDIK</h3>\n");
      out.write("                    <form class=\"bs-docs-example form-horizontal\">\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer\n");
      out.write("    ================================================== -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p>Copyright &copy; 2014 &nbsp;Universitas Telkom</p>\n");
      out.write("            <p>Jl. Raya Bengkulu-Tais Km 37 Air Periukan 38881 </p>\n");
      out.write("            <p>Seluma, Bengkulu</p>\n");
      out.write("            <p>Phone. +62 251 8622642, +62 251 8622708 || e-Mail : <a href=\"\">sman3seluma.humas@gmail.com</a>.</p>\n");
      out.write("            <p>All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/siswapribadi.jsp(89,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("pribadi");
    // /WEB-INF/view/siswapribadi.jsp(89,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/siswapribadi.jsp(89,24) '${tampilpribadi}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${tampilpribadi}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Nama Peserta Didik :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.nama}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">NIS :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.nis}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Tempat, Tanggal Lahir :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.tempat_l}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(",</span>\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.tanggal_l}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Jenis Kelamin :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.jenisKelamin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Agama :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.agama}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Anak Ke- :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.anak_ke}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span><span class=\"help-inline\">(Satu)</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Status dalam Keluarga :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.statinKeluarga}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Alamat Peserta Didik :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.alamat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Telepon :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.telepon}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Diterima di Dekolah ini</label>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Di Kelas :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.dikelas}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Pada Tanggal :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.padatgl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Pada Tanggal :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.semester}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Nama Sekolah Asal :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.skol_asal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Nama Orang Tua</label>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Ayah :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.namaayah}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Ibu :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.namaibu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Alamat Orang Tua :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.alamatortu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Telepon Orang Tua :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.telepon_ortu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Pekerjaan Orang Tua</label>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Ayah :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.kerjaayah}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Ibu :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.kerjaibu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Penghasilan Orang Tua :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">Rp.</span>\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.gaji_ortu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/Bulan</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"page-header\">\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Nama Wali :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.namawali}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Alamat Wali :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.alamatWali}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Telepon Wali :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.teleponWali}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Pekerjaan Wali :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.kerjaWali}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"control-group info\">\n");
          out.write("                                <label class=\"control-label\" for=\"inputInfo\">Penghasilan Wali :</label>\n");
          out.write("                                <div class=\"controls\">\n");
          out.write("                                    <span class=\"help-inline\">Rp.</span>\n");
          out.write("                                    <span class=\"help-inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pribadi.gajiWali}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/Bulan</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                                \n");
          out.write("                            <div class=\"controls\">\n");
          out.write("                                <p><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/siswatampil\" class=\"btn btn-primary\" onclick=\"\"><- Kembali</a> \n");
          out.write("                                </p>\n");
          out.write("                            </div>\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("                    <div class=\"page-header\">\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
