

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Myriad_Pro_300.font.js" type="text/javascript"></script>


					<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
					<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
					<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
					
<!--[if lt IE 7]>
<script type="text/javascript" src="js/ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2 ul li a, #content, .list li');</script>
<![endif]-->
<link rel="stylesheet" href="css/styleG.css">
</head>


<body id="page1">
<div class="tail-top">
  <div class="tail-bottom">
    <div class="body-bg">
      <!-- HEADER -->
      <div id="header">
        <div class="extra"><img src="images/header-img.jpg" alt="" /></div>
        <div class="row-1">
          <div class="fleft"><a href="#"><img src="images/logo.gif" alt="" /></a></div>
          <div class="fright"><img src="images/phone.gif" alt="" /></div>
        </div>
        <div class="row-2">
          <ul>
            <li class="m1"><a href="index.html" class="active">Home</a></li>
            <li class="m2"><a href="about-us.html">About</a></li>
            <li class="m3"><a href="services.html">Services</a></li>
            <li class="m4"><a href="support.html">Support</a></li>
            <li class="m5"><a href="contact-us.html">contacts</a></li>
            <li class="m6"><a href="sitemap.html">Sitemap</a></li>
          </ul>
        </div>
        <div class="row-3"><img src="images/slogan.gif" alt="" />
          <form action="#" method="post" id="search-form">
            <fieldset>
              <div><span>
                <input type="text" value="Enter keyword here" onfocus="if(this.value=='Enter keyword here'){this.value=''}" onblur="if(this.value==''){this.value='Enter keyword here'}" />
                </span><a href="#"><img src="images/button.gif" alt="" /></a></div>
            </fieldset>
          </form>
        </div>
      </div>
      <!-- CONTENT -->
      <div id="content">
        <div class="inner_copy">More <a href="#">Website Templates</a> @ Templates.com!</div>
        <div class="tail-right">
          <div class="wrapper">
            <div class="col-1">
              <div class="indent">
                <div class="indent1">
                
                <form method="POST" data-ajax="false" action="<%=request.getContextPath()%>/showAll">
               		 <button name = "showAll" type="submit" >Afficher tous les articles</button>
                </form>
                </br>
                  
                 
             
                </div>
                <h4>Résultats de votre recherche</h4>
                <ul class="list">
                  <c:forEach items="${articles}" var="un_article">
               <li><strong><a href="#"><c:out value="${un_article.nom}" /> - <c:out value="${un_article.prix}" /> DH </a></strong><c:out value="${un_article.composition}" /></li>
			
				</c:forEach>
                </ul>
              </div>
            </div>
            <div class="col-2">
              <ul>
                <li><strong><a href="#">February 15, 2010</a></strong>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium.</li>
                <li><strong><a href="#">January 31, 2010</a></strong>Totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae.</li>
                <li><strong><a href="#">January 22, 2010</a></strong>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugitd quia.</li>
                <li><strong><a href="#">January 14, 2010</a></strong>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia.</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <!-- FOOTER -->
      <div id="footer">
        <div class="indent">
          <div class="fleft">Designed by: <a href="http://www.templates.com"><img alt="" src="images/templates-logo.gif" /></a>&nbsp; Your <a href="http://russian.templates.com/product/3d-models/">3D Models</a> Marketplace</div>
          <div class="fright">Copyright - Type in your name here</div>
        </div>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>

</html>




















































<h1>
	<c:forEach items="${articles}" var="un_article">
	Nom :
		<c:out value="${un_article.nom}" /> 
	Prix :
		<c:out value="${un_article.prix}" />
	Type :
		<c:out value="${un_article.type}" />
	Composition :
		<c:out value="${un_article.composition}" />
	<br>
	</c:forEach>
</h1>
</body>
</html>