/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-13 12:05:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/PRJ/ASM3/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Project_3_trungvqfx14135/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1657542904148L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<link\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<link\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style>\n");
      out.write(".gallery-wrap .img-big-wrap img {\n");
      out.write("	height: 450px;\n");
      out.write("	width: auto;\n");
      out.write("	display: inline-block;\n");
      out.write("	cursor: zoom-in;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".gallery-wrap .img-small-wrap .item-gallery {\n");
      out.write("	width: 60px;\n");
      out.write("	height: 60px;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("	margin: 7px 2px;\n");
      out.write("	display: inline-block;\n");
      out.write("	overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".gallery-wrap .img-small-wrap {\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".gallery-wrap .img-small-wrap img {\n");
      out.write("	max-width: 100%;\n");
      out.write("	max-height: 100%;\n");
      out.write("	object-fit: cover;\n");
      out.write("	border-radius: 4px;\n");
      out.write("	cursor: zoom-in;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img-big-wrap img {\n");
      out.write("	width: 100% !important;\n");
      out.write("	height: auto !important;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"row\">\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Left.jsp", out, false);
      out.write("\n");
      out.write("			<div class=\"col-sm-9\">\n");
      out.write("				<div class=\"container\">\n");
      out.write("					<div class=\"card\">\n");
      out.write("						<div class=\"row\">\n");
      out.write("							<aside class=\"col-sm-5 border-right\">\n");
      out.write("								<article class=\"gallery-wrap\">\n");
      out.write("									<div class=\"img-big-wrap\">\n");
      out.write("										<div>\n");
      out.write("											<a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.src}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></a>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("									<!-- slider-nav.// -->\n");
      out.write("								</article>\n");
      out.write("								<!-- gallery-wrap .end// -->\n");
      out.write("							</aside>\n");
      out.write("							<aside class=\"col-sm-7\">\n");
      out.write("								<article class=\"card-body p-5\">\n");
      out.write("									<h3 class=\"title mb-3 text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("									<p class=\"price-detail-wrap\">\n");
      out.write("										<span class=\"price h3 text-warning\"> <span\n");
      out.write("											class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("										</span>\n");
      out.write("										<!--<span>/per kg</span>-->\n");
      out.write("									</p>\n");
      out.write("									<!-- price-detail-wrap .// -->\n");
      out.write("									<dl class=\"item-property\">\n");
      out.write("										<dt>Description</dt>\n");
      out.write("										<dd>\n");
      out.write("											<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("										</dd>\n");
      out.write("									</dl>\n");
      out.write("									<dl class=\"item-property\">\n");
      out.write("										<dt>Type</dt>\n");
      out.write("										<dd>\n");
      out.write("											<p class=\"text-uppercase\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("										</dd>\n");
      out.write("									</dl>\n");
      out.write("									<dl class=\"item-property\">\n");
      out.write("										<dt>Brand</dt>\n");
      out.write("										<dd>\n");
      out.write("											<p class=\"text-uppercase\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.brand}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("										</dd>\n");
      out.write("									</dl>\n");
      out.write("									<!--                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Model#</dt>\n");
      out.write("                                            <dd>12345611</dd>\n");
      out.write("                                        </dl>   item-property-hor .// \n");
      out.write("                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Color</dt>\n");
      out.write("                                            <dd>Black and white</dd>\n");
      out.write("                                        </dl>   item-property-hor .// \n");
      out.write("                                        <dl class=\"param param-feature\">\n");
      out.write("                                            <dt>Delivery</dt>\n");
      out.write("                                            <dd>Russia, USA, and Europe</dd>\n");
      out.write("                                        </dl>   item-property-hor .// -->\n");
      out.write("\n");
      out.write("									<hr>\n");
      out.write("									<div class=\"row\">\n");
      out.write("										<div class=\"col-sm-5\">\n");
      out.write("											<dl class=\"param param-inline\">\n");
      out.write("												<dt>Quantity:</dt>\n");
      out.write("												<dd>\n");
      out.write("													<select class=\"form-control form-control-sm\"\n");
      out.write("														style=\"width: 70px;\">\n");
      out.write("														<option>1</option>\n");
      out.write("														<option>2</option>\n");
      out.write("														<option>3</option>\n");
      out.write("													</select>\n");
      out.write("												</dd>\n");
      out.write("											</dl>\n");
      out.write("											<!-- item-property .// -->\n");
      out.write("										</div>\n");
      out.write("										<!-- col.// -->\n");
      out.write("\n");
      out.write("									</div>\n");
      out.write("									<!-- row.// -->\n");
      out.write("									<hr>\n");
      out.write("									<a href=\"cart?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&action=add\" class=\"btn btn-lg btn-danger text-uppercase\">\n");
      out.write("										Buy now </a> \n");
      out.write("								</article>\n");
      out.write("								<!-- card-body.// -->\n");
      out.write("							</aside>\n");
      out.write("							<!-- col.// -->\n");
      out.write("						</div>\n");
      out.write("						<!-- row.// -->\n");
      out.write("					</div>\n");
      out.write("					<!-- card.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
