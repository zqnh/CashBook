<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="fly-panel fly-column">
  <div class="layui-container">
    <ul class="layui-clear">
      <li class="layui-hide-xs layui-this"><a href="main">首页</a></li> 
      <c:forEach items="${clist }" var="c">
      	 <li><a href="main?cid="${c.cid}">${c.name }</a></li> 
      </c:forEach>
    </ul> 
    
    <div class="fly-column-right layui-hide-xs"> 
      <span class="fly-search"><i class="layui-icon"></i></span> 
      <a href="add2.jsp" class="layui-btn">记一笔</a> 
    </div> 
  
  </div>
</div>