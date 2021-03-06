<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link href="${staticResourceUrl}/css/bootstrap.min.css${VERSION}"rel="stylesheet">
<link href="${staticResourceUrl}/css/font-awesome.css${VERSION}"rel="stylesheet">
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
					<a href="javascript:entireLimitHouseList();">整租列表</a>
				</li>
				<li id="subLi">
					<a href="javascript:subLimitHouseList();">合租列表</a>
				</li>
				<li id="subTLi">
			      <a href="javascript:subSharedLimitHouseList();">合租按套列表</a>
		        </li>
			 </ul>
          </div>
		 <div class="col-sm-12">
		       <div class="ibox float-e-margins">
               <div class="ibox-content">
                      <div class="row">
	                		<div class="col-sm-12">
	                		<label class="col-sm-1 control-label mtop">从:</label>
                            <div class="col-sm-2 ">
                                 <input id="beginTime"  value=""  name="beginTime" class="laydate-icon form-control layer-date">
                            </div>
                            
                            <label class="col-sm-1 control-label mtop">到:</label>
                            <div class="col-sm-2">
                                 <input id="endTime" value="" name="endTime" class="laydate-icon form-control layer-date">
                            </div>
                            
                            <label class="col-sm-1 control-label mtop">城市:</label>
                             <div class="col-sm-2">
	                               <select class="form-control m-b" id="cityCode" name="cityCode" >
	                               <option value="">请选择</option>
	                               <c:forEach items="${cityList}" var="obj">
										<option value="${obj.code }">${obj.name }</option>
									</c:forEach>
	                              </select>
                             </div>
                            </div>
						</div>
						
						<div class="row">
							<div class="col-sm-6">
								<div class="col-sm-1 left2 left3">
								<customtag:authtag authUrl="house/limitCountDataList">
									<button class="btn btn-primary" type="button" onclick="query();">
										<i class="fa fa-search"></i>&nbsp;查询
									</button>
								</customtag:authtag>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="col-sm-1 left2 left3">
								<customtag:authtag authUrl="house/houseLimitListExcel">
									<button class="btn btn-primary" type="button" onclick="exportFile();" >
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
						 <table id="listTable" class="table table-bordered table-hover" >
	                     </table>
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

    function query(){
    	$('#listTable').bootstrapTable('selectPage', 1);
    }
    function paginationParam(params) {
	    return {
	        limit: params.limit,
	        page: $('#listTable').bootstrapTable('getOptions').pageNumber,
			rentWay:0 ,
			cityCode:$('#cityCode').val(),
	        beginTime:$('#beginTime').val(),
	        endTime:$('#endTime').val() 
            
    	};
	}
    function subPaginationParam(params) {
	    return {
	        limit: params.limit,
	        page: $('#listTable').bootstrapTable('getOptions').pageNumber,
			rentWay:1 ,
			cityCode:$('#cityCode').val(),
	        beginTime:$('#beginTime').val(),
	        endTime:$('#endTime').val() 
            
    	};
	}
    function sharedPaginationParam(params) {
	    return {
	        limit: params.limit,
	        page: $('#listTable').bootstrapTable('getOptions').pageNumber,
	        rentWay:1000,
	        cityCode:$('#cityCode').val(),
	        beginTime:$('#beginTime').val(),
	        endTime:$('#endTime').val() 
    	};
	}
    //导出excel表格
    var exportUrl='house/houseLimitListExcel?rentWay=0';
    function exportFile(){
    	var cityCode = $('#cityCode').val();
        var beginTime = $('#beginTime').val();
        var endTime = $('#endTime').val();
        
		var url = exportUrl+
		"&beginTime="+beginTime+
		"&endTime="+endTime+
		"&cityCode="+cityCode
		;
		
		window.location.href = url
	}
    function ajaxGetSubmit(url,data,callback){
		$.ajax({
	    type: "GET",
	    url: url,
	    dataType:"json",
	    data: data,
	    success: function (result) {
	    	callback(result);
	    },
	    error: function(result) {
	       alert("error:"+result);
	    }
	 });
	}
   
    
    $(function (){
		//初始化日期
		CommonUtils.datePickerFormat('beginTime');
		CommonUtils.datePickerFormat('endTime');
		entireLimitHouseList();
	});
    
    //初始化列表列
    var columnsData=[
     { 
 	    field: 'cityCode', 
 	    title: '城市code',
 	    align:'center'
 	 }, { 
 	    field: 'cityName', 
 	    title: '城市名字',
	 	align:'center'
 	 }, { 
 	    field: 'publish', 
 	    title: '发布量(套)',
 	    align:'center'
 	 },/*  { 
 	    field: 'guardRejict', 
 	    title: '管家审核未通过',
 	    align:'center'
 	 },{ 
	 	field: 'guardAccept', 
	 	title: '管家审核通过',
	 	align:'center'
	 }, */{ 
 	    field: 'qualityReject', 
 	    title: '品质审核未通过',
 	    align:'center'
 	 },{ 
 	    field: 'on', 
 	    title: '上架量',
 	    align:'center'
 	 },{ 
 	    field: 'off', 
 	    title: '下架量',
 	    align:'center'
 	 },{ 
 	    field: 'forceOff', 
 	    title: '强制下架量',
 	    align:'center',
 	 }] 
    //初始化整租房源状态列表
    function entireLimitHouseList(){
    	$("#entireLi").addClass('active');
    	$("#subLi").removeClass('active');
    	$("#subTLi").removeClass('active');
    	exportUrl='house/houseLimitListExcel?rentWay=0';
    	CommonUtils.strapTable('listTable','house/limitCountDataList',paginationParam,columnsData);
    }
    //初始化合租房源状态列表
    function subLimitHouseList(){
    	$("#subLi").addClass('active');
    	$("#entireLi").removeClass('active');
    	$("#subTLi").removeClass('active');
    	exportUrl='house/houseLimitListExcel?rentWay=1';
    	CommonUtils.strapTable('listTable','house/limitCountDataList',subPaginationParam,columnsData);
    }
    //初始化合租按套房源状态列表
    function subSharedLimitHouseList(){
    	$("#subTLi").addClass('active');
    	$("#entireLi").removeClass('active');
    	$("#subLi").removeClass('active');
    	exportUrl='house/houseLimitListExcel?rentWay=1000';
    	CommonUtils.strapTable('listTable','house/limitCountDataList',sharedPaginationParam,columnsData);
    }
	
</script>
</body>

</html>
