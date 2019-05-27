<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>快速记 记下明白生活</title>
<jsp:include page="common/link.jsp"></jsp:include>
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
<div class="layui-container">
<div class="layui-row">


    <div class="cntl">
			<span class="cntl-bar cntl-center">
				<span class="cntl-bar-fill"></span>
			</span>

        <div class="cntl-states">

            <div class="cntl-state">
                <div class="cntl-content">
                    <h2 style="color: #5F90D0;">还在为携带账本烦恼？</h2>
                    <h3 style="color: #949494;">现在只需要连接网络，打开浏览器，便可以随时随地进行记账</h3>
                    <h4 style="color: #949494;">当然，我们是<span style="font-size: 1.2em;color: #67b168;">免费</span>的</h4>
                </div>

                <div class="cntl-image"><img src="res/images/a4.png" alt="书本" class="img-responsive"
                                             draggable="false"></div>
                <div class="cntl-icon cntl-center">欢</div>
            </div>

            <div class="cntl-state">
                <div class="cntl-content">
                    <h2 style="color: #5F90D0;">大账目轻松计算！</h2>
                    <h3 style="color: #949494;">减轻你的计算压力。</h3>
                    <h4 style="color: #949494;">让记账更从容。</h4>
                </div>

                <div class="cntl-image"><img src="res/images/a1.png" class="img-responsive"
                                             draggable="false"></div>
                <div class="cntl-icon cntl-center">迎</div>
            </div>

            <div class="cntl-state">
                <div class="cntl-content">
                    <h2 style="color: #5F90D0;">担心查看？</h2>
                    <h3 style="color: #949494;">没问题，我们帮你准备了Excel导出。</h3>
                </div>

                <div class="cntl-image"><img src="res/images/a2.png" class="img-responsive"
                                             draggable="false"></div>
                <div class="cntl-icon cntl-center">您</div>
            </div>

            <div class="cntl-state">
                <div class="cntl-content">
                    <h2 style="color: #5f90d0;">还在担心安全？</h2>
                    <h3 style="color: #949494;">我们使用了特殊加密算法，进行数据传输</h3>
                    <h4 style="color: #949494;">我们，值得信赖！</h4>
                </div>

                <div class="cntl-image"><img src="res/images/a3.png" class="img-responsive"
                                             draggable="false"></div>
                <div class="cntl-icon cntl-center">·</div>
            </div>
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