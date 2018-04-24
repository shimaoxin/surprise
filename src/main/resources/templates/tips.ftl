
<!--验证、弹窗、警告-->
<div class="tc_box" align="center">
    <div class="tc-c tc-c1">
        <p><img src="/images/icon/l_close2.png" width="45"></p>
        <p class="words">错误信息</p>
    </div>
    <div class="tc-c tc-c2">
        <p><img src="/images/icon/l_warn.png" width="45"></p>
        <p class="words">提示信息</p>
    </div>
    <div class="tc-c tc-c3">
        <p><img src="/images/icon/l_succ.png" width="45"></p>
        <p class="words">成功信息</p>
    </div>
</div>

<script>
    function $tips(type, text) {
        var $tipObj = $(".tc-c" + type);
        $(".tc-c").removeClass("dis_b");
        $(".tc_box").show().delay(3000).fadeOut(100);
        $tipObj.find(".words").text(text);
        $tipObj.addClass("dis_b");
    }
</script>
