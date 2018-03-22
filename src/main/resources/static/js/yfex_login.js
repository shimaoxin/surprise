$(function () {



    // 登录注册切换
    /*$(".hover_cc li").click(function () {
        $(".hover_cc li").removeClass("c_hover");
        $(".hover_cc li").removeClass("hc-after");
        $(this).addClass("c_hover");
        $(this).addClass("hc-after");

        var t = $(this).index();
        $(".login-cc").removeClass("dis_b");
        $(".login-cc").eq(t).addClass("dis_b");

    })*/

    $(".i_text").click(function () {
        $(".i_text").removeClass("acli");
        $(this).addClass("acli");
    })


    /*$(".l_cc1 .btn_1").click(function () {
        $(".tc-c").removeClass("dis_b");
        $(".tc_box").show().delay(3000).fadeOut(100);
        $(".tc-c1").addClass("dis_b");
    });*/

    $(".l_cc2 .btn_1").click(function () {
        $(".tc-c").removeClass("dis_b");
        $(".tc_box").show().delay(3000).fadeOut(100);
        $(".tc-c2").addClass("dis_b");
    })
});


$("#zc_tuxing1").bind("input propertychange",function () {
    var result = $(this).val().length;
    if(result > 0){
        $("#tux_img2").show();
        $(".l_cc1 .btn_1").addClass("btn_2");
    }else if(result <= 0){
        $("#tux_img2").hide();
    }
});


$("#phone_input").bind("input propertychange",function () {
    var result = $(this).val().length;

    if(result > 0){
        $("#phone_img").show();
        $(".l_cc1 .btn_1").addClass("btn_2");
    }else if(result <= 0){
        $("#phone_img").hide();
    }

});


$("#phone_input2").bind("input propertychange",function () {
    var result2 = $(this).val().length;

    if(result2 > 0){
        $("#phone_img2").show();
    }else if(result2 <= 0){
        $("#phone_img2").hide();
    }

});
$("#pw_input").bind("input propertychange",function () {
    var result3 = $(this).val().length;

    if (result3 > 0) {
        $("#tux_img").show();
        $(".l_cc1 .btn_1").addClass("btn_2");
    }
});


$("#zc_macc").bind("input propertychange",function () {
    var result3 = $(this).val().length;

    if (result3 > 0) {
        $("#tux_img").show();
        $(".l_cc2 .btn_1").addClass("btn_2");
    }
});


$("#zc_tuxing").bind("input propertychange",function () {
    var result3 = $(this).val().length;

    if(result3 > 0){
        $("#tux_img").show();
        $(".l_cc1 .btn_1").addClass("btn_2");
    }else if(result3 <= 0){
        $("#tux_img").hide();
    }

});

$("#zc_sjma").bind("input propertychange",function () {
    var result4 = $(this).val().length;

    if(result4 > 0){
        $("#sjma_img").show();
    }else if(result4 <= 0){
        $("#sjma_img").hide();
    }

});

// 清空号码
$("#phone_img").click(function () {
    $("#phone_input").val("").focus();
    $("#phone_img").hide();
});

$("#phone_img2").click(function () {
    $("#phone_input2").val("").focus();
    $("#phone_img2").hide();

});
$("#tux_img").click(function () {
    $("#zc_tuxing").val("").focus();
    $("#tux_img").hide();

});
$("#tux_img2").click(function () {
    $("#zc_tuxing1").val("").focus();
    $("#tux_img2").hide();

});
$("#sjma_img").click(function () {
    $("#zc_sjma").val("").focus();
    $("#sjma_img").hide();

});


//密码可见不可见切换
var pwImg = document.getElementById("pw_img");
var pwInput = document.getElementById("pw_input");

var pwImg2 = document.getElementById("zc_pw_img1");
var pwInput2 = document.getElementById("zc_pw");

var pwImg3 = document.getElementById("zc_pw_img2");
var pwInput3 = document.getElementById("zc_pw2");

//隐藏text block，显示password block
function hideShowPsw(){
    if (pwInput.type == "password") {
        pwInput.type = "text";
        pwImg.src = "images/icon/pw-show.png";
    }else {
        pwInput.type = "password";
        pwImg.src = "images/icon/pw-hide.png";
    }
}
function hideShowPsw2(){
    if (pwInput2.type == "password") {
        pwInput2.type = "text";
        pwImg2.src = "images/icon/pw-show.png";
    }else {
        pwInput2.type = "password";
        pwImg2.src = "images/icon/pw-hide.png";
    }
}
function hideShowPsw3(){
    if (pwInput3.type == "password") {
        pwInput3.type = "text";
        pwImg3.src = "images/icon/pw-show.png";
    }else {
        pwInput3.type = "password";
        pwImg3.src = "images/icon/pw-hide.png";
    }
}

