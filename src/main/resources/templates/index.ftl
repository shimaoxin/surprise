<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>首页</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link type="text/css" rel="stylesheet" href="/css/button.css">
    <#include "common.ftl">
    <style>
        #slide {
            margin: 0 auto;
            position: relative;
            overflow: hidden;
        }
        #slide .hd{
            width: 100%;
            height: 11px;
            position: absolute;
            z-index: 1;
            bottom: 10px;
            text-align: center;
        }
        #slide .hd ul li {
            font-size: 0;
            display: inline-block;
            width: 9px;
            height: 9px;
            -webkit-border-radius: 9px;
            -moz-border-radius: 9px;
            border-radius: 10px;
            background: #fff;
            margin: 0 3px;
            vertical-align: top;
            overflow: hidden;
            border: 1px solid #ebecec;
        }
        #slide .hd ul .on {
            background: #777777;
        }
        #slide .bd {
            position: relative;
            z-index: 0;
        }
        #slide .bd li img {
            display: block;
            width: 100%;
        }
        #slide .bd li a {
            -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
        }
        body{
            background: #f9f9f9;
        }
        .f-hot-all{
            margin-top: 12px;
            padding: 25px 0;
            position: relative;
            text-align: center;
        }
        .img-hot{
            width: 65%;
            margin: 0 auto;
        }
        .img-hot img{
            width: 100%;
        }
        .r-color{
            color: #ec6b69;
            font-size: 22px;
        }
        .hot-con li:first-child{
            width: 40%;
            border-right: 1px solid #d9d9d9;
            text-align: center;
            line-height: 30px;
        }
        .hot-con li:last-child{
            width: 59%;
            line-height: 30px;
            color: #424242;
        }
        .hot-con li:last-child i{
            font-style: normal;
            margin-left: 5px;
            color: #424242!important;
        }
        .li2-cc{
            width: 170px;
            margin: 0 auto;
        }
        .hot-con{
            margin-top: 25px;
        }
        .li2-cc span{
            font-size: 13px;
            color: #aaa9a9!important;
        }
        .sy-tt{
            color: #aaa9a9;
            font-size: 14px;
        }
        .h-rate{
            clear: both;
            padding-top: 15px;
            margin: 0 auto;
        }
        .experience-box{
            height: 6px;
            background: #f2f2f2;
            border-radius: 5px;
            width: 50%;
            border: none;
            margin: 0 10px;
            position: relative;
            margin-top: 9px;
        }
        .experience-cc{
            height: 6px;
            background: #ff4e41;
            border-radius: 5px;
            border: none;
        }
        .rate-cc{
            width: 80%;
            margin: 0 auto;
            color: #aaa9a9;
        }
        .a_nun{
            color: #ec6b69;
            font-size: 13px;
            margin-top: 2px;
            margin-right: 18px;
        }
        .grab-ipt{
            width: 100%;
            text-align: center;
            margin-top: 65px;
        }
        .grab-ipt input{
            width: 68%;
            background: #ec6b69;
            color: #fff;
            height: 42px;
            font-size: 16px;
            border: none;
            border-radius: 25px;
        }
        .img-jx{
            position: absolute;
            top: 0;
            right: 0;
        }

        @media (max-width: 330px) {
            .rate-cc{
                width: 86%;
            }
            .a_nun{
                margin-right: 8px;
            }
        }
        @media (max-width: 370px) {
            .a_nun{
                margin-right: 8px;
            }
        }
    </style>

</head>
<body ontouchstart>
<div class="m-page-all">

    <!--banner开始-->
    <div class="banner row">
        <div id="slide">
            <div class="hd">
                <ul><li class="on">1</li><li class="on">2</li><li class="on">3</li></ul>
            </div>
            <div class="bd">
                <div class="tempWrap" style="overflow:hidden; position:relative;">
                    <ul style="width: 3840px; position: relative; overflow: hidden; padding: 0px; margin: 0px; transition-duration: 200ms; transform: translateX(-768px);">
                        <li style="display: table-cell; vertical-align: top; width: 768px;">
                            <a href="#" target="_blank">
                                <img src="/picture/imageResource.jpg" alt="渝金所">
                            </a>
                        </li>
                        <li style="display: table-cell; vertical-align: top; width: 768px;">
                            <a href="#" target="_blank">
                                <img src="/picture/imageResource2.jpg" alt="渝金所">
                            </a>
                        </li>
                        <li style="display: table-cell; vertical-align: top; width: 768px;">
                            <a href="#" target="_blank">
                                <img src="/picture/imageResource3.jpg" alt="渝金所">
                            </a>
                        </li>
                        <li style="display: table-cell; vertical-align: top; width: 768px;">
                            <a href="#" target="_blank">
                                <img src="/picture/imageResource4.jpg" alt="渝金所">
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!--banner结束-->

    <div class="f-hot-all">
        <button class="bubbly-button" onclick="clickSurprise()">Surprise!</button>
    </div>

</div>

<#include "footer.ftl">

<script charset="utf-8" src="/js/touchslide.js"></script>
<script type="text/javascript">

    TouchSlide({
        slideCell:"#slide",
        titCell:".hd ul", //开启自动分页 autoPage:true ，此时设置 titCell 为导航元素包裹层
        mainCell:".bd ul",
        effect:"left",
        autoPlay:true,//自动播放
        autoPage:true, //自动分页
        delayTime:300,
        interTime:5000,
        switchLoad:"_src" //切换加载，真实图片路径为"_src"

    });

    //点击惊喜
     var getSurprise = function() {
        $.ajax({
            url : '${contextPath}/user/getSurprise',
            dataType : 'json',
            cache : false,
            success : function(res) {
                if (!res) {
                    $tips(1, "臭狗屎，积分不够了哟！");
                } else {
                    $tips(3, "得到了新的日志，赶快去查看吧");
                }
            },

        });
    }

    function clickSurprise() {
        setTimeout(getSurprise, 1000);
    }
</script>

<script type="text/javascript">
    $(function () {
        var t = $(".a_nun").text();

        $(".experience-cc").css("width",t);

    })
</script>
<script type="text/javascript" src="/js/button.js"></script>
<#include "tips.ftl">
</body>
</html>