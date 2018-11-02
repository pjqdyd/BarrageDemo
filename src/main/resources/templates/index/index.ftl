<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>


<div class="bigbox">
    <div class="head-box"></div>
    <div class="content-box">
        <div class="vid-box">
            <video class="pause" poster="/img/timg.jpg" width="100%" height="auto">
                <source src="/video/Pigv3.mp4" type="video/mp4">
                您的浏览器不支持html5！
            </video>
            <div class="barrage-box">
            </div>
            <div class="play-button"><img class="play-img" src="/img/play.png"/></div>
        </div>

        <div class="inpu-box" contenteditable=true><p>这里输入弹幕</p></div>
        <div id="button" class="button"><img class="send-img" src="/img/send.png" alt="发送"/></div>
    </div>

</div>


<script src="/js/vid.js"></script>
<script src="/js/main.js"></script>
<script src="/js/webs.js"></script>
</body>
</html>