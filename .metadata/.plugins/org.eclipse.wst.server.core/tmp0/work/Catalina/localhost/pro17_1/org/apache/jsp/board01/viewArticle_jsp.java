/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-30 07:43:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1687320779637L));
    _jspx_dependants.put("jar:file:/C:/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro17_1/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("					function readURL(input) {\r\n");
      out.write("						//console.log(input);  // input이란 <input type=\"file\" name=\"imageFileName\" onchange=\"readURL(this)\"> \r\n");
      out.write("						//console.log(input.files); //input.files란 FileList {0: File, length: 1}\r\n");
      out.write("						//console.log(typeof(input.files));\r\n");
      out.write("						//console.log(input.files);  //\r\n");
      out.write("						//console.log(input.files[0]); //File {name: 'dog.jpg', lastModified: 1687154048942, lastModifiedDate: Mon Jun 19 2023 14:54:08 GMT+0900 (한국 표준시), webkitRelativePath: '', size: 89834, …}\r\n");
      out.write("\r\n");
      out.write("						if (input.files && input.files[0]) {\r\n");
      out.write("\r\n");
      out.write("							let reader = new FileReader();\r\n");
      out.write("							//console.log(reader);\r\n");
      out.write("							// console.log($(\"#preview\"));  //m.fn.init [img#preview, context: document, selector: '#preview']\r\n");
      out.write("							reader.onload = function (event) {\r\n");
      out.write("								console.log(\"이벤트 : \", event);  //ProgressEvent \r\n");
      out.write("								console.log(\"이벤트 대상 : \", event.target); //FileReader\r\n");
      out.write("								console.log(\"이벤트 대상 결과 : \", event.target.result); // data:image/jpeg\r\n");
      out.write("								console.log($(\"#i_imageFileName\").attr('src', event.target.result));\r\n");
      out.write("								$(\"#preview\").attr('src', event.target.result);\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							reader.readAsDataURL(input.files[0]);\r\n");
      out.write("						}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					function backToList(obj) {\r\n");
      out.write("						obj.action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/listArticles.do\";\r\n");
      out.write("						obj.submit();\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					function fn_enable(obj) {\r\n");
      out.write("						// console.log(obj);  //form 테그\r\n");
      out.write("						// console.log(document.getElementById('i_title')); //<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"title\" id=\"i_title\" disabled />\r\n");
      out.write("\r\n");
      out.write("						// console.log(document.getElementById('i_title').disabled); //true\r\n");
      out.write("						document.getElementById('i_title').disabled = false;\r\n");
      out.write("						document.getElementById(\"i_content\").disabled = false;\r\n");
      out.write("						\r\n");
      out.write("						var imgFile=document.getElementById(\"i_imageFileName\");\r\n");
      out.write("						if(imgFile != null){\r\n");
      out.write("							document.getElementById(\"i_imageFileName\").disabled = false;\r\n");
      out.write("						}\r\n");
      out.write("																							\r\n");
      out.write("						// console.log(document.getElementById(\"tr_btn_modify\").style.display);\r\n");
      out.write("						\r\n");
      out.write("						document.getElementById(\"tr_btn_modify\").style.display = 'block';\r\n");
      out.write("						document.getElementById(\"tr_btn\").style.display = \"none\";\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					function fn_modify_article(obj){\r\n");
      out.write("						console.log(obj);\r\n");
      out.write("						obj.action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/modArticle.do\";\r\n");
      out.write("						obj.submit();\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					function fn_remove_article(url,articleNO){\r\n");
      out.write("						console.log(url, articleNO);\r\n");
      out.write("						var form = document.createElement(\"form\");\r\n");
      out.write("						form.setAttribute(\"method\", \"post\");\r\n");
      out.write("						form.setAttribute(\"action\", url);\r\n");
      out.write("						var articleNOInput = document.createElement(\"input\");\r\n");
      out.write("						articleNOInput.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("						articleNOInput.setAttribute(\"name\",\"articleNO\");\r\n");
      out.write("						articleNOInput.setAttribute(\"value\", articleNO);\r\n");
      out.write("						form.appendChild(articleNOInput);\r\n");
      out.write("						document.body.appendChild(form);\r\n");
      out.write("						console.log(form);\r\n");
      out.write("						form.submit();\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					function fn_reply_form(url, parentNO){\r\n");
      out.write("						console.log(url,parentNO); //pro17_1/board/replyForm.do, 부모글 7\r\n");
      out.write("						var form = document.createElement(\"form\");\r\n");
      out.write("						form.setAttribute(\"method\", \"post\");\r\n");
      out.write("						 form.setAttribute(\"action\", url);\r\n");
      out.write("						 var parentNOInput = document.createElement(\"input\");\r\n");
      out.write("						 parentNOInput.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("					     parentNOInput.setAttribute(\"name\",\"parentNO\");\r\n");
      out.write("					     parentNOInput.setAttribute(\"value\", parentNO);\r\n");
      out.write("					     console.log(form);\r\n");
      out.write("					     console.log(parentNOInput);\r\n");
      out.write("					     form.appendChild(parentNOInput);\r\n");
      out.write("					     console.log(form);\r\n");
      out.write("					     document.body.appendChild(form);\r\n");
      out.write("					     console.log(document);\r\n");
      out.write("					     form.submit();\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("				</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<form name=\"frmArticle\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("		<table border=\"0\" align=\"center\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"150\" align=\"center\" bgcolor=\"#FF9933\">글번호</td>\r\n");
      out.write("				<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.articleNO }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("					<input type=\"hidden\" name=\"articleNO\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.articleNO}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("					<!-- 추후 글 수정시 글 번호 필요함 --></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"150\" align=\"center\" bgcolor=\"#FF9933\">작성자 아이디</td>\r\n");
      out.write("				<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\"\r\n");
      out.write("					disabled /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"150\" align=\"center\" bgcolor=\"#FF9933\">제목</td>\r\n");
      out.write("				<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"title\"\r\n");
      out.write("					id=\"i_title\" disabled /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"150\" align=\"center\" bgcolor=\"#FF9933\">내용</td>\r\n");
      out.write("				<td><textarea rows=\"10\" cols=\"60\" name=\"content\" id=\"i_content\"\r\n");
      out.write("						disabled />");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		 ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"20%\" align=\"center\" bgcolor=\"#FF9933\">등록일자</td>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<td><input type=text value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.writeDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr id=\"tr_btn_modify\" style=\"display: none\">\r\n");
      out.write("				<td colspan=\"2\" align=\"center\"><input type=button\r\n");
      out.write("					value=\"수정반영하기\" onClick=\"fn_modify_article(frmArticle)\"> <input\r\n");
      out.write("					type=button value=\"취소\" onClick=\"backToList(frmArticle)\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<tr id=\"tr_btn\">\r\n");
      out.write("				<td colspan=2 align=\"center\"><input type=button value=\"수정하기\" onClick=\"fn_enable(this.form)\"> \r\n");
      out.write("				<input type=button value=\"삭제하기\" onClick=\"fn_remove_article('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/removeArticle.do', ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.articleNO}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")\">\r\n");
      out.write("				<input type=button value=\"리스트로 돌아가기\" onClick=\"backToList(this.form)\">\r\n");
      out.write("				<input type=button value=\"답글쓰기\" onClick=\"fn_reply_form('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/replyForm.do', ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.articleNO}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /board01/viewArticle.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /board01/viewArticle.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/board01/viewArticle.jsp(6,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /board01/viewArticle.jsp(168,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty article.imageFileName && article.imageFileName != 'null' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("				<tr id=\"imgrow\">\r\n");
          out.write("\r\n");
          out.write("					<td width=\"20%\" align=\"center\" bgcolor=\"#FF9933\" rowspan=\"2\">\r\n");
          out.write("						이미지</td>\r\n");
          out.write("\r\n");
          out.write("					<td><input type=\"hidden\" name=\"originalFileName\"\r\n");
          out.write("						value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.imageFileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /> <!--수정 시 원래 이미지 파일명 필요  -->\r\n");
          out.write("\r\n");
          out.write("						<img\r\n");
          out.write("						src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/download.do?imageFileName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.imageFileName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("&articleNO=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.articleNO }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("						id=\"preview\" /><br></td>\r\n");
          out.write("\r\n");
          out.write("				</tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("				<tr>\r\n");
          out.write("					<td><input type=\"file\" name=\"imageFileName \"\r\n");
          out.write("						id=\"i_imageFileName\" disabled onchange=\"readURL(this);\" /></td>\r\n");
          out.write("				</tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("			 ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
