<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty loginUser }">
	<c:set var="msg" value="请登录" scope="session"></c:set>
	<c:redirect url="login.jsp"></c:redirect>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>快速记 记下明白生活</title>
<jsp:include page="common/link.jsp"></jsp:include>
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
<jsp:include page="common/column.jsp"></jsp:include>

<div class="layui-container">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md12">
      <div class="fly-panel" style="margin-bottom: 0;">
        
        <div class="fly-panel-title fly-filter">
          <a href="main?type=2">支出</a>
          <span class="fly-mid"></span>
          <a href="main?type=1">收入</a>
         
          <span class="fly-filter-right layui-hide-xs">
            <a href="main?order=time" class="layui-this">时间</a>
            <span class="fly-mid"></span>
            <a href="main?order=money">金额</a>
          </span>
        </div>

        <ul class="fly-list">  
         <c:forEach items="${flist}" var="f">
          <c:choose>
         	<c:when test="${f.type == 2 }">
         		<li>
		            <a href="#" class="fly-avatar">
		              <img src="res/images/cat/${f.logo }_1.png" alt="${f.name }">
		            </a>
		            <h2>
		              <a class="layui-badge">${f.name }</a>
		              <a href="jie/detail.html">${f.details }</a>
		            </h2>
		            <div class="fly-list-info">
		              <span>${f.addTime }</span>
		            </div>
		            <div class="fly-list-badge">
		              <span class="layui-badge layui-bg-red">${f.money }</span>
		            </div>
		          </li>
         	 </c:when>
         	 <c:otherwise>
         	 	<li>
		            <a href="#" class="fly-avatar">
		              <img src="res/images/cat/${f.logo }_1.png" alt="${f.name }">
		            </a>
		            <h2>
		              <a class="layui-badge">${f.name }</a>
		              <a href="jie/detail.html">${f.details }</a>
		            </h2>
		            <div class="fly-list-info">
		              <span>${f.addTime }</span>
		            </div>
		            <div class="fly-list-badge">
		              <span class="layui-badge fly-badge-accept">${f.money }</span>
		            </div>
		          </li>
         	 </c:otherwise>
         	</c:choose>
         </c:forEach>        
          
         
        </ul>
      <!--  <div style="text-align: center">
          <div class="laypage-main"><span class="laypage-curr">1</span><a href="/jie/page/2/">2</a><a href="/jie/page/3/">3</a><a href="/jie/page/4/">4</a><a href="/jie/page/5/">5</a><span>…</span><a href="/jie/page/148/" class="laypage-last" title="尾页">尾页</a><a href="/jie/page/2/" class="laypage-next">下一页</a></div>
        </div> -->

      </div>
    </div>

  </div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>
<script type="text/javascript">
layui.cache.page = 'jie';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: 'res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "3.0.0"
  ,base: 'res/mods/'
}).extend({
  fly: 'index'
}).use('fly');
</script>
</body>
</html>