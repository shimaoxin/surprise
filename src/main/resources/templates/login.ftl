<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title></title>
    <link type="text/css" rel="stylesheet" href="/css/style-all.css">

    <style>
        html{
            height: 100%;
            background-image: url("/picture/bg.jpeg");
            background-repeat:no-repeat;
            background-size:100%;
        }
        .fcon--top{
            width: 100%;
        }
        .fcon--top img{
            width: 100%;
        }
        .hover_cc{
            width: 100%;
            height: 50px;
            border-bottom:1px solid #ececec;
            box-shadow: 0 2px 4px rgba(240, 240, 240, 0.82);
            margin-bottom: 25px;
        }
        .hover_cc li{
            width: 50%;
            position: relative;
            text-align: center;
            font-size: 15px;
            color: #f2d271;
            height: 50px;
            line-height: 50px;
            font-family: "Times New Roman";
        }
        .c_hover{
            color: #000!important;
            font-size: 17px!important;
        }
        .hc-after:after {
            position: absolute;
            display: inline-block;
            top: 42px;
            width: 0;
            height: 0px;
            content: '';
            border-style: solid;
            border-width: 6px;
            border-color: #fff #fff transparent transparent;
            transform: rotate(135deg);
            box-shadow: 2px -2px 2px rgba(224, 224, 224, 0.4);
            margin-left: -6px;
            left:50%;
        }
        .l_cc1 ul{
            width: 65%;
        }
        .l_cc1 ul li{
            margin-top: 8px;
        }
        .l_cc1 ul .i_text input{
            border: none;
            font-size: 15px;
            width: 68%;
            height:42px;
            padding-left: 15%;
            margin-bottom: 10px;
            border-radius:15px;
        }
        .forget{
            text-align: right;
            border:none!important;

        }
        .i_text_p input{
            background: url("/images/icon/l_phone.png")no-repeat;
            background-size:25px;
            background-position:2px 8px;
        }
        .i_text_w input{
            background: url("/images/icon/l_lock.png")no-repeat;
            background-size:25px;
            background-position:2px 8px;
        }
        .forget a{
            color: #71abf2;
            font-size: 14px;
        }
        .btn_1{
            background: #FF4351;
            border: none;
            width: 100%;
            margin-top: 5px;
            height: 45px;
            font-size: 16px;
            color: #fff;
            border-radius: 28px;
            letter-spacing: 2px;
        }
        #pw_img{
            margin-top: 10px;
            margin-right: 5px;
        }
        #phone_img{
            display: none;
        }
        .l_cc1 .p_close{
            width: 24px;
            height: 24px;
            margin-right: 5px;
            margin-top: 10px;
        }
        .l_cc2 .p_close{
            width: 24px;
            height: 24px;
            margin-right: 5px;
            margin-top: 8px;
        }
        .l_cc2 .ma_close{
            width: 24px;
            height: 24px;
            margin-left: 8px;
        }
        .login-cc{
            display: none;
        }
        .l_cc2 ul{
            width: 78%;
            margin: 0 auto;
        }
        .zc_pw2,.zc_phone,.zc_pw{
            width: 80%;
        }
        .l_cc2 li{
            height: 50px;
            padding-top: 12px;
            border-bottom: 1px solid #f6f6f6;
        }
        .l_cc2 li:first-child{
            padding-top: 0px;
        }
        .l_cc2 li input{
            height: 40px;
            font-size: 15px;
            padding-left: 3%;
            margin-bottom: 8px;
            border: none;
        }
        .l_cc2 .btn_1{
            background: #cccccc;
            border: none;
            width: 80%;
            height: 45px;
            font-size: 16px;
            padding-left: 0px!important;
            color: #fff;
            border-radius: 28px;
            letter-spacing: 2px;
        }
        .l_cc2{
            margin-bottom: 100px;
        }
        .l_cc2 .pw_img2{
            margin-top: 10px;
            margin-right: 5px;

        }
        .i_text2 .zc_txma{
            height: 35px;
            line-height: 52px;
            margin-top: 2px;
            width: 32%;
            border: 1px solid #e9e9e9;
        }
        .zc_txma img{
            width: 100%;
        }
        .zc_tuxing,.zc_sjma{
            width: 50%;
        }
        #zc_macc{
            width: 82px!important;
            height: 30px;
            color: #f2d271;
            border: 1px solid #f2d271;
            border-radius: 4px;
            padding-left: 0px!important;
        }
        .zc_sjma_btn{
            margin-top: 4px;
            text-align: center;
            font-size: 14px!important;
        }
        #sjma_img,#tux_img,#phone_img2,#tux_img2{
            display: none;
        }
        .zc_tuxing2{
            width: 32% !important;
            padding-left: 10% !important;
            margin-right: 6px;
        }
        .ma_close1{
            vertical-align: middle;
        }
        .zc_txma1{
            height: 35px;
            line-height: 52px;
            margin-top: 2px;
            width: 38%;
            border: 1px solid #e9e9e9;
        }
        .zc_txma1 img{
            width: 100%;
        }
        .login-cc-all{
            margin-bottom: 60px;
        }
        @media (max-width: 330px) {
            .zc_tuxing, .zc_sjma {
                width: 45%;
                font-size: 13px;
            }
            .l_cc2 ul {
                width: 85%;
            }
            .i_text2 span {
                padding: 5px;
                border: 1px solid #f2d271;
                border-radius: 4px;
                font-size: 13px;
                color: #f2d271;
            }
            .zc_tuxing2{
                width: 28% !important;
            }
        }
        .tc-bg{
            position: fixed;
            width: 100%;
            height: 100%;
            max-width: 640px;
            margin: 0 auto;
            background: rgba(0, 0, 0, 0.65);
            z-index: 999;
            display: none;
        }
        .tc-box_xiyi{
            width: 100%;
            max-width: 500px;
            height: 350px;
            position: fixed;
            left:0;
            top: 15%;
            right: 0;
            margin: auto;
            display: none;
            z-index: 9999;
        }
        .xiyi-box{
            width: 90%;
            padding: 35px 0 22px;
            margin: 0 auto;
            position: relative;
            background: #fff;
            border-radius: 8px;
        }
        .xiyi_cc{
            padding: 15px;
            margin: 0 auto;
            height: 350px;
            font-size: 12px;
            background: #fff;
            color: #505050;
            overflow-y: auto;
            line-height: 18px;
        }
        .xiyi_cc p{
            font-size: 14px;
            font-weight: bold;
            color: #404040;
            margin: 15px 0 5px;
        }
        .xiyi_cc p:first-child{
            margin-top: -15px!important;
        }
        .close_xy{
             position: absolute;
             right: 10px;
             top: 2px;
        }
        .f_login-con{
            margin-top: 70%;
        }
    </style>
</head>
<body ontouchstart>
    <div class="m-page-all fex-login-all">

        <!--笼罩层-->
        <div class="tc-bg"></div>

        <!--验证、弹窗、警告-->
        <div class="tc_box" align="center">
            <div class="tc-c tc-c1">
                <p><img src="/images/icon/l_close2.png" width="45"></p>
                <p>用户名或者密码错误</p>
            </div>
            <div class="tc-c tc-c2">
                <p><img src="/images/icon/l_warn.png" width="45"></p>
                <p>图形验证码已经过期或不存在，刷新请重新输入</p>
            </div>
            <div class="tc-c tc-c3">
                <p><img src="/images/icon/l_succ.png" width="45"></p>
                <p>注册成功</p>
            </div>
        </div>

        <!--头部图片开始-->
        <div class="fcon--top">
            <#--<img src="/picture/login_img.jpg">-->
        </div>
        <!--头部图片结束-->

        <div class="f_login-con">

            <#--<ul class="hover_cc">-->
                <#--<li class="fl hc-after c_hover">登录</li>-->
                <#--<li class="fl">注册</li>-->
            <#--</ul>-->


            <div class="login-cc-all">
                <!--登录-->
                <div class="login-cc l_cc1 dis_b" align="center">
                    <form id="loginFrom">
                        <ul>
                            <li class="i_text i_text1 i_text_p">
                                <p class="fr p_close">
                                    <img class="fr" id="phone_img" src="/images/icon/p-close.png" width="24">
                                </p>
                                <input type="text" name="loginName" id="phone_input" placeholder="请输入用户名"/>
                            </li>
                            <li class="i_text i_text1 i_text_w">
                                <img class="fr" id="pw_img" onclick="hideShowPsw()" src="/images/icon/pw-hide.png" width="24">
                                <input id="pw_input" name="password" type="password" placeholder="请输入密码"/>
                            </li>
                            <li class="forget"><a href="forget-p.html">忘记密码？</a></li>
                            <li>
                                <input class="btn_1" type="button" value="登录" onclick="loginIn()">
                            </li>
                        </ul>
                    </form>
                </div>

                <!--注册-->
                <#--<div class="login-cc l_cc2">-->
                    <#--<ul>-->
                        <#--<li class="i_text i_text2 i_text_p2">-->
                            <#--<p class="fr p_close">-->
                                <#--<img class="fr" id="phone_img2" src="/static/images/icon/p-close.png" width="24">-->
                            <#--</p>-->
                            <#--<input class="zc_phone" type="text" id="phone_input2" placeholder="请输入手机号"/>-->
                        <#--</li>-->
                        <#--<li class="i_text i_text2">-->
                            <#--<input class="zc_tuxing fl" id="zc_tuxing"  type="text" placeholder="请输入图形验证码"/>-->
                            <#--<p class="fl p_close">-->
                            <#--<img class="ma_close" id="tux_img" src="/images/icon/p-close.png" width="24">-->
                            <#--</p>-->
                            <#--<p class="fr zc_txma"><img src="/images/captchaImage.jpg"></p>-->

                        <#--</li>-->
                        <#--<li class="i_text i_text2 ">-->
                            <#--<input class="zc_sjma fl" id="zc_sjma" type="text" placeholder="请输入手机验证码"/>-->
                            <#--<p class="fl p_close">-->
                            <#--<img class="ma_close" id="sjma_img" src="/images/icon/p-close.png" width="24">-->
                            <#--</p>-->
                            <#--<input class="fr zc_sjma_btn" id="zc_macc" onclick="sendCode(this)" value="获取验证码"/>-->

                        <#--</li>-->
                        <#--<li class="i_text i_text2 i_text_w2">-->
                            <#--<img class="fr pw_img2" id="zc_pw_img1" onclick="hideShowPsw2()" src="/images/icon/pw-hide.png" width="24">-->
                            <#--<input class="zc_pw" id="zc_pw" type="password" placeholder="请输入密码"/>-->
                        <#--</li>-->
                        <#--<li class="i_text i_text2 i_text_w2">-->
                            <#--<img class="fr pw_img2" id="zc_pw_img2" onclick="hideShowPsw3()"  src="/images/icon/pw-hide.png" width="24">-->
                            <#--<input class="zc_pw2" id="zc_pw2" type="password" placeholder="请再次输入密码"/>-->
                        <#--</li>-->
                        <#--<li style="height: 30px;border-bottom: none;padding-left: 15px">-->
                            <#--<input type="checkbox" class="fl" style="vertical-align: middle;margin-top: -7px;margin-right: 5px">-->
                            <#--<span class="xieyi" style="font-size: 13px;color:#f2d271;">我已阅读并同意渝金所注册协议</span>-->
                        <#--</li>-->
                        <#--<li  style="padding-top: 5px;border-bottom: none;">-->
                            <#--<input class="btn_1" type="button" value="提交">-->
                        <#--</li>-->
                    <#--</ul>-->
                <#--</div>-->

            </div>
        </div>
    </div>
    <script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="/js/yfex_login.js"></script>
    <script type="text/javascript">

    //登录
    function loginIn() {
        var data = $('#loginFrom').serialize();
        $.ajax({
            url : '${contextPath}/user/login',
            dataType : 'json',
            data : data,
            cache : false,
            success : function(res) {
                if (!res) {
                    $tips(1, "用户名或者密码错误");
                } else {
                   window.location.href="${contextPath}/user/toIndex";
                }
            },

        });
    }



    </script>
    <#include "tips.ftl">
</body>
</html>