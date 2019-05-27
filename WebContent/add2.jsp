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
<title>记一笔</title>
<jsp:include page="common/link.jsp"></jsp:include>
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>

<div class="layui-container fly-marginTop">
  <div class="fly-panel" pad20 style="padding-top: 5px;">
    <!--<div class="fly-none">没有权限</div>-->
    <div class="layui-form layui-form-pane">
      <div class="layui-tab layui-tab-brief" lay-filter="user">
        <ul class="layui-tab-title">
          <li class="layui-this">支出</li>
          <li><a href="add.jsp">收入</a></li>
        </ul>
        <div class="layui-form layui-tab-content" id="zhichu" style="padding: 20px 0;">
          <div class="layui-tab-item layui-show">
            <form action="add" method="post">
              <input type="hidden" name="type" value="2"> 
              <div class="layui-row layui-col-space15 layui-form-item">
              	 <div class="layui-col-md6">
                  <label class="layui-form-label">支出金额</label>
                  <div class="layui-input-block">
                   <input type="text" id="L_title" name="money" required lay-verify="required" autocomplete="off" class="layui-input">
                  </div>
                </div>
                <div class="layui-col-md3">
                  <label class="layui-form-label">支出类别</label>
                  <div class="layui-input-block">
                    <select lay-verify="required" name="cid" lay-filter="column"> 
                      <option></option> 
                      <c:forEach items="${clist}" var="c">
                      	<c:if test="${c.type == 2 }">
                      		<option value="${c.cid}">${c.name }</option> 
                      	</c:if>
                      </c:forEach>
                    </select>
                  </div>
                </div>
                <div class="layui-col-md3">
                  <label for="L_title" class="layui-form-label">发生日期</label>
                  <div class="layui-input-block">
                    <input  type="text" class="layui-input" id="test5" name="addTime" placeholder="yyyy-MM-dd HH:mm:ss">
                  </div>
                </div>
              </div>
          
              <div class="layui-form-item layui-form-text">
                <div class="layui-input-block">
                  <textarea id="L_content" name="details" required lay-verify="required"  placeholder="详细描述" class="layui-textarea fly-editor" style="height: 260px;"></textarea>
                </div>
              </div>
          
              <div class="layui-form-item">
                <button class="layui-btn" lay-filter="*" lay-submit>记一笔</button>
              </div>
            </form>
          </div>
          
           
        </div>
      </div>
    </div>
  </div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>
<script>
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
layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  laydate.render({
		   elem: '#test5'
		   ,type: 'datetime'
	  });
	 
});
</script>
</body>
</html>