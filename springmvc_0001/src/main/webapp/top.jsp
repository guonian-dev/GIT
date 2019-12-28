<%@ page import="com.springmvc.pojo.BookType" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/8 0008
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <meta content="all" name="robots"/>
    <meta name="author" content="Fisher" />
    <meta name="Copyright" content="Copyright 2007-2008, 版权所有 www.reefdesign.cn" />
    <meta name="description" content="reefdesign" />
    <meta name="keywords" content="reefdesign" />
    <title>电子书城</title>
    <link rel="shortcut icon" href="favicon.ico" >
    <link rel="stylesheet" rev="stylesheet" href="css/style.css" type="text/css" media="all" />
</head>
<body class="main">

<div id="divhead">
    <table cellspacing="0" class="headtable">
        <tr>
            <td><a href="index.html"><img src="images/logo.gif" width="95" height="30" border="0" /></a></td>
            <td style="text-align:right"><img src="images/cart.gif" width="26" height="23" style="margin-bottom:-4px"/>&nbsp;<a href="cart.html">购物车</a>　|　<a href="#">帮助中心</a>　|　<a href="login.html">我的帐户</a>　|　<a href="register.html">新用户注册</a></td>
        </tr>
    </table>
</div>

<div id="divmenu">
    <%
        List<BookType> bookTypeList = (List<BookType>)session.getAttribute("BOOK_TYPE_LIST");
        for(BookType bookType : bookTypeList){
    %>
    <a href="bookinfospace/bookInfoManagerAction_searchBookInfoByBookTypeNo.action?bookTypeNo=<%=bookType.getBookTypeNo()%>"><%=bookType.getBookTypeName()%></a>
    <%
        }
    %>

    <a href="product_list.html" style="color:#FFFF00">全部商品目录</a></div>
<div id="divsearch"><table width="100%" border="0" cellspacing="0">
    <tr>
        <td style="text-align:right; padding-right:220px">Search
            <input type="text" name="textfield" class="inputtable"/>
            <!--<input name="searchbutton" type="image" src="images/serchbutton.gif" style=" margin-bottom:-4px"/>-->
            <a href="search.html"><img src="images/serchbutton.gif" border="0" style="margin-bottom:-4px"/></a></td>
    </tr>
</table>

</div>
</body>
</html>
