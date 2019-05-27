<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="fly-header layui-bg-black">
  <div class="layui-container">
    <a class="fly-logo" href="/">
      <img src="res/images/logo.png" alt="layui">
    </a>
    
    <ul class="layui-nav fly-nav-user">
      <c:choose>
      	<c:when test="${empty loginUser }">
      	  <!-- 未登入的状态 -->
	      <li class="layui-nav-item">
	        <a class="iconfont icon-touxiang layui-hide-xs" href="login.jsp"></a>
	      </li>
	      <li class="layui-nav-item">
	        <a href="login.jsp">登入</a>
	      </li>
	      <li class="layui-nav-item">
	        <a href="reg.jsp">注册</a>
	      </li>
	      <li class="layui-nav-item layui-hide-xs">
	        <a href="" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
	      </li>
	      <li class="layui-nav-item layui-hide-xs">
	        <a href="" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
	      </li>
      	</c:when>
      	<c:otherwise>
      	  <!-- 登入后的状态 -->
	      
	      <li class="layui-nav-item">
	        <a class="fly-nav-avatar" href="javascript:;">
	          <cite class="layui-hide-xs">${loginUser.nikeName }</cite>
	          <i class="iconfont icon-renzheng layui-hide-xs" title=""></i>
	          <i class="layui-badge fly-badge-vip layui-hide-xs">VIP1</i>
	        </a>
	        <dl class="layui-nav-child">
	          <dd><a href="user/set.html"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
	          <dd><a href="user/message.html"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
	          <dd><a href="main"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
	          <hr style="margin: 5px 0;">
	          <dd><a href="logout" style="text-align: center;">退出</a></dd>
	        </dl>
	      </li>
	    
      	</c:otherwise>
      </c:choose>
      
    </ul>
  </div>
</div>