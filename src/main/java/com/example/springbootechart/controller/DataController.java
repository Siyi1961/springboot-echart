package com.example.springbootechart.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DataController {

    @GetMapping(value = "/line-simple")
    public Map<String, Object> getLineSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [820, 932, 901, 934, 1290, 1330, 1320],\n" +
                "        type: 'line'\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/area-basic")
    public Map<String, Object> getBasicAreaOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        boundaryGap: false,\n" +
                "        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [820, 932, 901, 934, 1290, 1330, 1320],\n" +
                "        type: 'line',\n" +
                "        areaStyle: {" +
                "           normal: {}" +
                "        }\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/line-smooth")
    public Map<String, Object> getLineSmoothOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [820, 932, 901, 934, 1290, 1330, 1320],\n" +
                "        type: 'line',\n" +
                "        smooth: true\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/line-stack")
    public Map<String, Object> getLineStackOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    title: {\n" +
                "        text: '折线图堆叠'\n" +
                "    },\n" +
                "    tooltip: {\n" +
                "        trigger: 'axis'\n" +
                "    },\n" +
                "    legend: {\n" +
                "        data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']\n" +
                "    },\n" +
                "    grid: {\n" +
                "        left: '3%',\n" +
                "        right: '4%',\n" +
                "        bottom: '3%',\n" +
                "        containLabel: true\n" +
                "    },\n" +
                "    toolbox: {\n" +
                "        feature: {\n" +
                "            saveAsImage: {}\n" +
                "        }\n" +
                "    },\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        boundaryGap: false,\n" +
                "        data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [\n" +
                "        {\n" +
                "            name: '邮件营销',\n" +
                "            type: 'line',\n" +
                "            stack: '总量',\n" +
                "            data: [120, 132, 101, 134, 90, 230, 210]\n" +
                "        },\n" +
                "        {\n" +
                "            name: '联盟广告',\n" +
                "            type: 'line',\n" +
                "            stack: '总量',\n" +
                "            data: [220, 182, 191, 234, 290, 330, 310]\n" +
                "        },\n" +
                "        {\n" +
                "            name: '视频广告',\n" +
                "            type: 'line',\n" +
                "            stack: '总量',\n" +
                "            data: [150, 232, 201, 154, 190, 330, 410]\n" +
                "        },\n" +
                "        {\n" +
                "            name: '直接访问',\n" +
                "            type: 'line',\n" +
                "            stack: '总量',\n" +
                "            data: [320, 332, 301, 334, 390, 330, 320]\n" +
                "        },\n" +
                "        {\n" +
                "            name: '搜索引擎',\n" +
                "            type: 'line',\n" +
                "            stack: '总量',\n" +
                "            data: [820, 932, 901, 934, 1290, 1330, 1320]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/bar-simple")
    public Map<String, Object> getBarSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [120, 200, 150, 80, 70, 110, 130],\n" +
                "        type: 'bar'\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/bar-background")
    public Map<String, Object> getBarWithBackgroudOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    xAxis: {\n" +
                "        type: 'category',\n" +
                "        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']\n" +
                "    },\n" +
                "    yAxis: {\n" +
                "        type: 'value'\n" +
                "    },\n" +
                "    series: [{\n" +
                "        data: [120, 200, 150, 80, 70, 110, 130],\n" +
                "        type: 'bar',\n" +
                "        showBackground: true,\n" +
                "        backgroundStyle: {\n" +
                "            normal: {\n" +
                "                color: 'rgba(220, 220, 220, 0.8)'\n" +
                "            }" +
                "        }\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping("pie-simple")
    public Map<String,Object> getPieSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "        tooltip: {\n" +
                "            trigger: 'item',\n" +
                "            formatter: '{a} <br/>{b} : {c} ({d}%)'\n" +
                "        },\n" +
                "        series: [{\n" +
                "          type: 'pie',\n" +
                "          data: [{\n" +
                "                    value: 100,\n" +
                "                    name: 'A'\n" +
                "                }, {\n" +
                "                    value: 200,\n" +
                "                    name: 'B'\n" +
                "                }, {\n" +
                "                    value: 300,\n" +
                "                    name: 'C'\n" +
                "                }, {\n" +
                "                    value: 400,\n" +
                "                    name: 'D'\n" +
                "                }]\n" +
                "        }]\n" +
                "      }";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping("pie-custom")
    public Map<String,Object> getPieCustomOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    backgroundColor: '#2c343c',\n" +
                "\n" +
                "    title: {\n" +
                "        text: 'Customized Pie',\n" +
                "        left: 'center',\n" +
                "        top: 20,\n" +
                "        textStyle: {\n" +
                "            color: '#ccc'\n" +
                "        }\n" +
                "    },\n" +
                "\n" +
                "    tooltip: {\n" +
                "        trigger: 'item',\n" +
                "        formatter: '{a} <br/>{b} : {c} ({d}%)'\n" +
                "    },\n" +
                "\n" +
                "    visualMap: {\n" +
                "        show: false,\n" +
                "        min: 80,\n" +
                "        max: 600,\n" +
                "        inRange: {\n" +
                "            colorLightness: [0, 1]\n" +
                "        }\n" +
                "    },\n" +
                "    series: [\n" +
                "        {\n" +
                "            name: '访问来源',\n" +
                "            type: 'pie',\n" +
                "            radius: '55%',\n" +
                "            center: ['50%', '50%'],\n" +
                "            data: [\n" +
                "                {value: 335, name: '直接访问'},\n" +
                "                {value: 310, name: '邮件营销'},\n" +
                "                {value: 274, name: '联盟广告'},\n" +
                "                {value: 235, name: '视频广告'},\n" +
                "                {value: 400, name: '搜索引擎'}\n" +
                "            ],\n" +
                "            roseType: 'radius',\n" +
                "            label: {\n" +
                "                color: 'rgba(255, 255, 255, 0.3)'\n" +
                "            },\n" +
                "            labelLine: {\n" +
                "                lineStyle: {\n" +
                "                    color: 'rgba(255, 255, 255, 0.3)'\n" +
                "                },\n" +
                "                smooth: 0.2,\n" +
                "                length: 10,\n" +
                "                length2: 20\n" +
                "            },\n" +
                "            itemStyle: {\n" +
                "                color: '#c23531',\n" +
                "                shadowBlur: 200,\n" +
                "                shadowColor: 'rgba(0, 0, 0, 0.5)'\n" +
                "            },\n" +
                "            animationType: 'scale',\n" +
                "            animationEasing: 'elasticOut',\n" +
                "            animationDelay: 200\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/scatter-simple")
    public Map<String, Object> getScatterSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "        xAxis: {},\n" +
                "        yAxis: {},\n" +
                "        series: [{\n" +
                "            symbolSize: 20,\n" +
                "            data: [\n" +
                "                [10.0, 8.04],\n" +
                "                [8.0, 6.95],\n" +
                "                [13.0, 7.58],\n" +
                "                [9.0, 8.81],\n" +
                "                [11.0, 8.33],\n" +
                "                [14.0, 9.96],\n" +
                "                [6.0, 7.24],\n" +
                "                [4.0, 4.26],\n" +
                "                [12.0, 10.84],\n" +
                "                [7.0, 4.82],\n" +
                "                [5.0, 5.68]\n" +
                "            ],\n" +
                "            type: 'scatter'\n" +
                "        }]\n" +
                "      }";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/map-simple")
    public Map<String, Object> getMapSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "        series : [\n" +
                "            {\n" +
                "                name: 'Map',\n" +
                "                type: 'map',\n" +
                "                map: 'china',\n" +
                "                selectedMode : 'single',\n"+
                "                data:[{name: '江苏',value: 120, selected:true},\n" +
                "                      {name: '天津',value: 240}]\n" +
                "            }\n" +
                "        ]\n" +
                "      }";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/radar-simple")
    public Map<String, Object> getRadarSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "    title: {\n" +
                "        text: '基础雷达图'\n" +
                "    },\n" +
                "    tooltip: {},\n" +
                "    legend: {\n" +
                "        data: ['预算分配（Allocated Budget）', '实际开销（Actual Spending）']\n" +
                "    },\n" +
                "    radar: {\n" +
                "        // shape: 'circle',\n" +
                "        name: {\n" +
                "            textStyle: {\n" +
                "                color: '#fff',\n" +
                "                backgroundColor: '#999',\n" +
                "                borderRadius: 3,\n" +
                "                padding: [3, 5]\n" +
                "            }\n" +
                "        },\n" +
                "        indicator: [\n" +
                "            { name: '销售（sales）', max: 6500},\n" +
                "            { name: '管理（Administration）', max: 16000},\n" +
                "            { name: '信息技术（Information Techology）', max: 30000},\n" +
                "            { name: '客服（Customer Support）', max: 38000},\n" +
                "            { name: '研发（Development）', max: 52000},\n" +
                "            { name: '市场（Marketing）', max: 25000}\n" +
                "        ]\n" +
                "    },\n" +
                "    series: [{\n" +
                "        name: '预算 vs 开销（Budget vs spending）',\n" +
                "        type: 'radar',\n" +
                "        // areaStyle: {normal: {}},\n" +
                "        data: [\n" +
                "            {\n" +
                "                value: [4300, 10000, 28000, 35000, 50000, 19000],\n" +
                "                name: '预算分配（Allocated Budget）'\n" +
                "            },\n" +
                "            {\n" +
                "                value: [5000, 14000, 28000, 31000, 42000, 21000],\n" +
                "                name: '实际开销（Actual Spending）'\n" +
                "            }\n" +
                "        ]\n" +
                "    }]\n" +
                "}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }

    @GetMapping(value = "/funnel-simple")
    public Map<String, Object> getFunnelSimpleOption() {
        Map map = new HashMap();
        String option = "{\n" +
                "        title: {\n" +
                "            text: '漏斗图',\n" +
                "            subtext: '纯属虚构'\n" +
                "        },\n" +
                "        tooltip: {\n" +
                "            trigger: 'item',\n" +
                "            formatter: \"{a} <br/>{b} : {c}%\"\n" +
                "        },\n" +
                "        toolbox: {\n" +
                "            feature: {\n" +
                "                dataView: {readOnly: false},\n" +
                "                restore: {},\n" +
                "                saveAsImage: {}\n" +
                "            }\n" +
                "        },\n" +
                "        legend: {\n" +
                "            data: ['展现','点击','访问','咨询','订单']\n" +
                "        },\n" +
                "\n" +
                "        series: [\n" +
                "            {\n" +
                "                name:'漏斗图',\n" +
                "                type:'funnel',\n" +
                "                left: '10%',\n" +
                "                top: 60,\n" +
                "                //x2: 80,\n" +
                "                bottom: 60,\n" +
                "                width: '80%',\n" +
                "                // height: {totalHeight} - y - y2,\n" +
                "                min: 0,\n" +
                "                max: 100,\n" +
                "                minSize: '0%',\n" +
                "                maxSize: '100%',\n" +
                "                sort: 'descending',\n" +
                "                gap: 2,\n" +
                "                label: {\n" +
                "                    show: true,\n" +
                "                    position: 'inside'\n" +
                "                },\n" +
                "                labelLine: {\n" +
                "                    length: 10,\n" +
                "                    lineStyle: {\n" +
                "                        width: 1,\n" +
                "                        type: 'solid'\n" +
                "                    }\n" +
                "                },\n" +
                "                itemStyle: {\n" +
                "                    borderColor: '#fff',\n" +
                "                    borderWidth: 1\n" +
                "                },\n" +
                "                emphasis: {\n" +
                "                    label: {\n" +
                "                        fontSize: 20\n" +
                "                    }\n" +
                "                },\n" +
                "                data: [\n" +
                "                    {value: 60, name: '访问'},\n" +
                "                    {value: 40, name: '咨询'},\n" +
                "                    {value: 20, name: '订单'},\n" +
                "                    {value: 80, name: '点击'},\n" +
                "                    {value: 100, name: '展现'}\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "      }";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(option);
        map.put("option", jsonObject);
        return map;
    }


}
