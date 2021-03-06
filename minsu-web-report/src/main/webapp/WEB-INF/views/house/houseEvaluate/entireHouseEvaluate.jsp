<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="customtag" uri="http://minsu.ziroom.com" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <base href="${basePath }">
    <title>自如民宿后台管理系统</title>
    <meta name="keywords" content="自如民宿后台管理系统">
    <meta name="description" content="自如民宿后台管理系统">
    <link rel="${staticResourceUrl}/shortcut icon" href="favicon.ico">
    <link href="${staticResourceUrl}/css/bootstrap.min.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/font-awesome.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/plugins/bootstrap-table/bootstrap-table.min.css${VERSION}001" rel="stylesheet">
    <link href="${staticResourceUrl}/css/animate.css${VERSION}001" rel="stylesheet">
    <link href="${staticResourceUrl}/css/style.css${VERSION}" rel="stylesheet">

    <link href="${staticResourceUrl}/css/custom-z.css${VERSION}" rel="stylesheet">

</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row row-lg">
        <div class="tabs-container">
            <ul class="nav nav-tabs">
                <li class="active" id="entireLi">
                    <a href="javascript:entireHouseEvaluate();">整租列表</a>
                </li>
                <li id="subLi">
                    <a href="javascript:subHouseEvaluate();">合租列表</a>
                </li>

            </ul>
        </div>
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-sm-12">
                            <label class="col-sm-1 control-label mtop">国家:</label>
                            <div class="col-sm-2">
                                <select class="form-control m-b" id="nationCode" name="nationCode">
                                    <option value="">请选择</option>
                                    <c:forEach items="${nationList}" var="obj">
                                        <option value="${obj.code }">${obj.name }</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <label class="col-sm-1 control-label mtop">大区:</label>
                            <div class="col-sm-2">
                                <select class="form-control m-b" id="regionName" name="regionName">
                                    <option value="">请选择</option>
                                    <c:forEach items="${regionList}" var="obj">
                                        <option value="${obj.regionName }">${obj.regionName }</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <label class="col-sm-1 control-label mtop">城市:</label>
                            <div class="col-sm-2">
                                <select class="form-control m-b" id="cityCode" name="cityCode">
                                    <option value="">请选择</option>
                                    <c:forEach items="${cityList}" var="obj">
                                        <option value="${obj.code }">${obj.name }</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <label class="col-sm-1 control-label mtop">首次上架时间:</label>
                            <div class="col-sm-2 ">
                                <input id="putawayBeginTime" value="" name="putawayBeginTime"
                                       class="laydate-icon form-control layer-date">
                            </div>

                            <label class="col-sm-1 control-label mtop">到:</label>
                            <div class="col-sm-2">
                                <input id="putawayEndTime" value="" name="putawayEndTime"
                                       class="laydate-icon form-control layer-date">
                            </div>

                            <label class="col-sm-1 control-label mtop">房源状态:</label>
                            <div class="col-sm-2">
                                <select class="form-control m-b" id="houseStatus" name="houseStatus">
                                    <option value="">请选择</option>
                                    <c:forEach items="${houseStatusList}" var="obj">
                                        <option value="${obj.code }">${obj.name }</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <label class="col-sm-1 control-label mtop">数据查询期间:</label>
                            <div class="col-sm-2 ">
                                <input id="beginTime" value="" name="beginTime"
                                       class="laydate-icon form-control layer-date">
                            </div>

                            <label class="col-sm-1 control-label mtop">到:</label>
                            <div class="col-sm-2">
                                <input id="endTime" value="" name="endTime"
                                       class="laydate-icon form-control layer-date">
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6">
                            <div class="col-sm-1 left2 left3">
                                <customtag:authtag authUrl="houseEvaluate/dataList">
                                    <button class="btn btn-primary" type="button" onclick="query();">
                                        <i class="fa fa-search"></i>&nbsp;查询
                                    </button>
                                </customtag:authtag>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="col-sm-1 left2 left3">
                                <customtag:authtag authUrl="houseEvaluate/houseEvaluateExcelList">
                                    <button class="btn btn-primary" type="button" onclick="exportFile();">
                                        <i class="fa fa-search"></i>&nbsp;导出文件
                                    </button>
                                </customtag:authtag>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <!-- Panel Other -->
    <div class="ibox float-e-margins">
        <div class="ibox-content">
            <div class="row row-lg">
                <div class="col-sm-12">
                    <div class="example-wrap">
                        <div class="example">
                            <table id="listTable" class="table table-bordered table-hover"></table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 全局js -->
<script src="${staticResourceUrl}/js/jquery.min.js${VERSION}"></script>
<script src="${staticResourceUrl}/js/bootstrap.min.js${VERSION}001"></script>
<!-- Bootstrap table -->
<script src="${staticResourceUrl}/js/plugins/bootstrap-table/bootstrap-table.min.js${VERSION}002"></script>

<script src="${staticResourceUrl}/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js${VERSION}001"></script>
<script src="${staticResourceUrl}/js/minsu/common/commonUtils.js${VERSION}005" type="text/javascript"></script>
<!-- layer javascript -->
<script src="${staticResourceUrl}/js/plugins/layer/layer.min.js${VERSION}001"></script>
<!-- layerDate plugin javascript -->
<script src="${staticResourceUrl}/js/plugins/layer/laydate/laydate.js${VERSION}001"></script>


<script type="text/javascript">
    function query() {
        $('#listTable').bootstrapTable('selectPage', 1);
    }

    //整租查询
    function paginationParam(params) {
        return {
            limit: params.limit,
            page: $('#listTable').bootstrapTable('getOptions').pageNumber,
            rentWay: 0,
            nationCode: $('#nationCode').val(),
            regionName: $('#regionName').val(),
            cityCode: $('#cityCode').val(),
            putawayBeginTime: $('#putawayBeginTime').val(),
            putawayEndTime: $('#putawayEndTime').val(),
            houseStatus: $('#houseStatus').val(),
            beginTime: $('#beginTime').val(),
            endTime: $('#endTime').val()
        };
    }
    //合租查询
    function subPaginationParam(params) {
        return {
            limit: params.limit,
            page: $('#listTable').bootstrapTable('getOptions').pageNumber,
            rentWay: 1,
            nationCode: $('#nationCode').val(),
            regionName: $('#regionName').val(),
            cityCode: $('#cityCode').val(),
            putawayBeginTime: $('#putawayBeginTime').val(),
            putawayEndTime: $('#putawayEndTime').val(),
            houseStatus: $('#houseStatus').val(),
            beginTime: $('#beginTime').val(),
            endTime: $('#endTime').val()
        };
    }
    //导出地址
    var exportUrl = 'houseEvaluate/houseEvaluateExcelList?rentWay=0';
    function exportFile() {
        var nationCode = $('#nationCode').val();
        var regionName = $('#regionName').val();
        var cityCode = $('#cityCode').val();
        var houseStatus = $('#houseStatus').val();
        var putawayBeginTime = $('#putawayBeginTime').val();
        var putawayEndTime = $('#putAwayEndTime').val();
        var beginTime = $('#beginTime').val();
        var endTime = $('#endTime').val();

        var url = exportUrl +
            "&putawayBeginTime=" + putawayBeginTime +
            "&putawayEndTime=" + putawayEndTime +
            "&beginTime=" + beginTime +
            "&endTime=" + endTime +
            "&nationCode=" + nationCode +
            "&regionName=" + regionName +
            "&cityCode=" + cityCode +
            "&houseStatus=" + houseStatus
        ;
        window.location.href = url
    }


    function ajaxGetSubmit(url, data, callback) {
        $.ajax({
            type: "GET",
            url: url,
            dataType: "json",
            data: data,
            success: function (result) {
                callback(result);
            },
            error: function (result) {
                alert("error:" + result);
            }
        });
    }

    function moneyDataFormat(value, row, index) {
        return value / 100;
    }

    $(function () {
        //初始化日期
        CommonUtils.datePickerFormat('putawayBeginTime');
        CommonUtils.datePickerFormat('putawayEndTime');
        CommonUtils.datePickerFormat('beginTime');
        CommonUtils.datePickerFormat('endTime');
        entireHouseEvaluate();
    });

    //初始化列表列
    var columnsData = [

        {
            field: 'nationCode',
            title: '国家',
            align: 'center'
        }, {
            field: 'regionName',
            title: '大区',
            align: 'center'
        }, {
            field: 'cityName',
            title: '城市',
            align: 'center'
        }, {
            field: 'houseSn',
            title: '房源编号',
            align: 'center'
        }, {
            field: 'putawayTime',
            title: '首次上架时间',
            align: 'center',
            formatter: 'CommonUtils.formateDate'
        }, {
            field: 'houseStatusName',
            title: '房源状态',
            align: 'center'
        }, {
            field: 'checkInOrderNum',
            title: '入住订单量',
            align: 'center'
        }, {
            field: 'evaRate',
            title: '评价率',
            align: 'center',
            formatter: 'formatPercent'
        }, {
            field: 'evaTotal',
            title: '累计评价量',
            align: 'center'
        }, {
            field: 'sumScoreAvg',
            title: '累计评分平均值',
            align: 'center'
        }, {
            field: 'houseCleanAvg',
            title: '整洁卫生星级平均值',
            align: 'center'
        }, {
            field: 'desMathAvg',
            title: '描述相符星级平均值',
            align: 'center',
        }, {
            field: 'safeDegreeAvg',
            title: '安全程度星级平均值',
            align: 'center'
        }, {
            field: 'trafPosAvg',
            title: '交通位置星级平均值',
            align: 'center',
        }, {
            field: 'costPerforAvg',
            title: '性价比星级平均值',
            align: 'center',
        }, {
            field: 'evaLessFourNum',
            title: '4星以内评价量',
            align: 'center',
        }]
    //初始化整租房源订单周期列表
    function entireHouseEvaluate() {
        $("#entireLi").addClass('active');
        $("#subLi").removeClass('active');
        exportUrl = 'houseEvaluate/houseEvaluateExcelList?rentWay=0';
        CommonUtils.strapTable('listTable', 'houseEvaluate/dataList', paginationParam, columnsData);
    }
    //初始化合租房源订单周期列表
    function subHouseEvaluate() {
        $("#subLi").addClass('active');
        $("#entireLi").removeClass('active');
        exportUrl = 'houseEvaluate/houseEvaluateExcelList?rentWay=1';
        CommonUtils.strapTable('listTable', 'houseEvaluate/dataList', subPaginationParam, columnsData);
    }
    function formatPercent(value, index, row){
        if (value == null){
            return '-';
        }else {
            var result = parseFloat(value*100).toFixed(2) + "%";
            return result;
        }
    }
</script>
</body>

</html>
