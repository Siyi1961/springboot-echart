$(function () {
    var res= getTree();
    init();
    // 设置树的相关属性并构造树
    $('#treeview').treeview({
        backColor: "#FFFFFF",
        color: "#428bca",
        // enableLinks: true,
        expandIcon: 'glyphicon glyphicon-chevron-right',
        collapseIcon: 'glyphicon glyphicon-chevron-down',
        showIcon:false,
        data: res
        // onNodeSelected:
    });

    // $("#treeview").treeview('selectNode',[1]);
    $("#treeview").on("nodeSelected", function(event,data) {   //插件中的方法
        showchart(data.name);
    })
    $("#treeview").treeview("selectNode",[1]);

})
function init() {
    $("body").css("height",document.documentElement.clientHeight+"px");
    $("#chart").css("height",(document.documentElement.clientHeight - 30)+"px");
}
window.onresize = init();
function getTree() {
    var data = [];
    $.ajax({
        url:"json/menu.json",
        dataType:"json",
        async:false,
        success:function (res) {
            data = res;
        }
    })
    return data;
};
function showchart(chartname) {
    var echart = echarts.init(document.getElementById('chart'));
    echart.clear();
    echart.showLoading();
    var option = {};
    $.ajax({
        url:"json/ChartOptions/"+chartname+".json",
        dataType:"json",
        async:false,
        success:function (res) {
            console.log(res);
            option = res;
        }
    })
    echart.setOption(option);
    echart.hideLoading();
}

