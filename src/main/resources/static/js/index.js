$(function () {
    initWH();
})

window.onresize = initWH();
/**
 * 初始化页面布局
 */
function initWH() {
    var width = document.documentElement.clientWidth;
    var height = document.documentElement.clientHeight;
    var svgwidth = $("svg").width() ? $("svg").width():660;
    var svgheight = $("svg").height() ? $("svg").height():96;

    var left = (width - svgwidth) / 2;
    var top = (height - svgheight) / 2;
    $("svg").css("margin-left", left+"px");
    $("svg").css("margin-top",top+"px");
}