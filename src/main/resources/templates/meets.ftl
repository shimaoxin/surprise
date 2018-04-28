<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>见面日志</title>
    <#include "common.ftl">

    <style>
        body{
            background: #fafafa;
        }
        .ticket-cc{
            padding: 35px 10px 10px;
        }
        .quan_list li{
            position: relative;
            padding: 14px 18px;
            background: url("/images/coupon@2x.png")no-repeat;
            background-size: 100% 100%;
            line-height: 26px;
            margin-top: 15px;
            font-size: 17px;
            color: #ff9a57;
            cursor: pointer;
        }

        .tc-bg{
            position: fixed;
            width: 100%;
            height: 100%;
            max-width: 640px;
            background: rgba(0, 0, 0, 0.65);
            z-index: 999;
            display: none;
        }

        .gift-nav{
            padding-top: 46px;
            width: 100%;
            line-height: 40px;
            background: #f2d271;
            height: 40px;
        }
        .gift-nav ul{
            width:50%;
        }
        .gift-nav ul li{
            width: 50%;
            color: #fff;
            font-size: 13px;
            position: relative;
        }
        .hc-after:after {
            position: absolute;
            display: inline-block;
            top: 32px;
            width: 0;
            height: 0px;
            content: '';
            border-style: solid;
            border-width: 6px;
            border-color: #f2d271 #f2d271 transparent transparent;
            transform: rotate(135deg);
            box-shadow: 2px -2px 2px rgba(224, 224, 224, 0.4);
            margin-left: -6px;
            left:50%;
        }
        .act-gift{
            font-size: 16px!important;
            color: #202020!important;
        }
        .ticket-cc1{
            display: none;
        }

        .list-ttc{
            font-size: 20px!important;
            color: #333333;
        }

        @media (max-width: 330px) {
            .ratio {
                font-size: 18px;
            }
            .ratio2{
                font-size: 18px;
            }
            .quan_list li {
                font-size: 15px;
            }

            .list-ttc {
                font-size: 20px!important;
            }

        }
    </style>
</head>
<body>
<div class="m-page-all">

    <!--笼罩层-->
    <div class="tc-bg"></div>



    <!--顶部返回-->
    <div class="m-fex_manage-top">
        <div class="m_m-ccn">
            见面日志
        </div>
    </div>

    <#--<div class="gift-nav" align="center">
        <ul>
            <li class="fl hc-after act-gift">红包</li>
            <li class="fl">优惠券</li>
        </ul>
    </div>-->

    <div class="ticket-cc">
        <!--红包-->
        <div class="ticket-cc1 dis_b">
            <ul class="quan_list">
                <#list meets as meet>
                    <li>
                        <p class="list-ttc">${meet.meetdate?string('yyyy-MM-dd')} </p>
                        <p>${meet.content}</p>
                    </li>
                </#list>
            </ul>
        </div>
    </div>

    <#include "footer.ftl">

</div>
<script type="text/javascript">
    $(function () {
        // 礼包优惠券切换
        $(".gift-nav ul li").click(function () {
            $(".gift-nav ul li").removeClass("hc-after");
            $(".gift-nav ul li").removeClass("act-gift");
            $(this).addClass("hc-after");
            $(this).addClass("act-gift");

            var t = $(this).index();
            $(".ticket-cc .ticket-cc1").removeClass("dis_b");
            $(".ticket-cc1").eq(t).addClass("dis_b");

        })
    })
</script>
</body>
</html>