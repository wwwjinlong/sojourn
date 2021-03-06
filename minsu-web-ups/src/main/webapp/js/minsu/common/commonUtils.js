/**
 * 公用js使用，能提出来的js大家都提出来哈
 * @param $
 */

//获取当前网址，如： http://localhost:8080/Tmall/index.jsp 
var curWwwPath=window.document.location.href; 

//获取主机地址之后的目录如：/Tmall/index.jsp 
var pathName=window.document.location.pathname; 
var pos=curWwwPath.indexOf(pathName); 

//获取主机地址，如： http://localhost:8080 
var localhostPaht=curWwwPath.substring(0,pos); 

//获取带"/"的项目名，如：/Tmall 
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1); 
var SERVER_CONTEXT = localhostPaht+"/";
if(localhostPaht.indexOf("localhost")>0){
	SERVER_CONTEXT = localhostPaht+projectName+"/";
}
(function ($) {
	
	var commonUtils = {};
	
	/**
	 *  所有的ajax调用  可以使用此方法提交 url:要提交的路径 data:提交的数据 binary:提交成功的回调函数
	 *  @param url 请求的url
	 *  @param data 请求数据
	 *  @param callback 回调函数
	 */
	commonUtils.ajaxPostSubmit =  function (url,data,callback){
		$.ajax({
	    type: "POST",
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
	/**
	 * 获取订单状态中文：//订单状态 10:待确认 20:待入住 30:强制取消 31:房东已拒绝 32:房客取消 33:未支付超时取消 40:已入住未生成单据 41：已入住已生成单据 50:正常退房中  51：提前退房中 60:待用户确认额外消费 71:提前退房完成 72:正常退房完成
	 * @param value
	 * @param row
	 * @param index
	 */
	commonUtils.getOrderStatu = function(value, row, index){
		
		var orderStatuStr="";
		if(value==10){
			orderStatuStr =  "待确认";
		}
		if(value == 20){
			orderStatuStr =  "待入住";
		}
		if(value==30){
			orderStatuStr =  "强制取消";
		}
		if(value == 31){
			orderStatuStr =  "房东已拒绝";
		}
		if(value==32){
			orderStatuStr =  "房客取消";
		}
		if(value == 33){
			orderStatuStr =  "未支付超时取消";
		}
		if(value == 34){
			orderStatuStr =  "强制取消申请中";
		}
		if(value==40){
			orderStatuStr =  "已入住未生成单据";
		}
		if(value == 41){
			orderStatuStr =  "已入住已生成单据 ";
		}
		if(value==50){
			orderStatuStr =  "正常退房中";
		}
		if(value==51){
			orderStatuStr =  "提前退房中";
		}
		if(value == 60){
			orderStatuStr =  "待用户确认额外消费";
		}
        if(value == 61){
            orderStatuStr =  "提前退房待用户确认额外消费";
        }
		if(value==70){
			orderStatuStr =  "正常退房完成";
		}
		if(value == 71){
			orderStatuStr =  "提前退房完成";
		}
		if(orderStatuStr == ""){
			orderStatuStr =  "*";
		}
		
		return orderStatuStr;
	}
	
	/**
	 * 获取差额表的审核状态
	 */
	commonUtils.getCheckedStatu = function(value, row, index){
		
		var statuStr= "";
		if(value == 0){
			statuStr= "未关联";
		}
		if(value == 1){
			statuStr= "待审批";
		}
		if(value == 2){
			statuStr= "人工审核通过";
		}
		if(value == 3){
			statuStr= "系统审核通过";
		}
		if(value == 4){
			statuStr= "已拒绝";
		}
		if(statuStr == ""){
			statuStr = "*";
		}
		
		return statuStr;
	}
	
	/**
	 * 获取收入类型 收入类型 1：客户房租佣金 2：客户违约金佣金 3：房东房租佣金 4：房东违约金佣金 5：房东违约金
	 */
	commonUtils.getIncomeType= function(value, row, index){
		var incomeTypeStr= "";
		if(value == 1){
			incomeTypeStr= "客户房租佣金";
		}
		if(value == 2){
			incomeTypeStr= "客户违约金佣金";
		}
		if(value == 3){
			incomeTypeStr= "房东房租佣金";
		}
		if(value == 4){
			incomeTypeStr= "房东违约金佣金";
		}
		if(value == 5){
			incomeTypeStr= "房东违约金";
		}
		if(incomeTypeStr == ""){
			incomeTypeStr = "*";
		}
		
		return incomeTypeStr;
	}

    /**
     * 收入状态 1：未收款 2：已收款 3：提前退房取消
     * @param value
     * @param row
     * @param index
     * @returns {string}
     */
    commonUtils.getIncomeStatus= function(value, row, index){
        var incomeStatusStr= "";
        if(value == 1){
            incomeStatusStr= "未收款";
        }
        if(value == 2){
            incomeStatusStr= "已收款";
        }
        if(value == 3){
            incomeStatusStr= "提前退房取消";
        }
        if(incomeStatusStr == ""){
            incomeStatusStr = "*";
        }
        return incomeStatusStr;
    }


    /**
     * 同步状态 1：未同步 2：同步成功 3：同步失败
     * @param value
     * @param row
     * @param index
     * @returns {string}
     */
    commonUtils.getIncomeSyncStatus= function(value, row, index){
        var incomeSyncStatusStr= "";
        if(value == 1){
            incomeSyncStatusStr= "未同步";
        }
        if(value == 2){
            incomeSyncStatusStr= "同步成功";
        }
        if(value == 3){
            incomeSyncStatusStr= "同步失败";
        }
        if(incomeSyncStatusStr == ""){
            incomeSyncStatusStr = "*";
        }
        return incomeSyncStatusStr;
    }


    commonUtils.rentWay= function(value, row, index){
        var str = "";
        if(value == 0){
            str= "整租";
        }
        if(value == 1){
            str= "合租";
        }

        return str;
    }

	
	/**
	 * 付款单付款状态 1：未付款 2：已消费 3：已申请打款 4：已打款 5：已打余额 6：被动余额 7：提前退房取消 8：未绑定银行卡 9：失败
	 */
	commonUtils.getPaymentStatus=function(value, row, index){
		var paymentStatusStr= "";
		if(value == 1){
			paymentStatusStr= "未付款";
		}
		if(value == 2){
			paymentStatusStr= "已消费";
		}
		if(value == 3){
			paymentStatusStr= "已申请打款";
		}
		if(value == 4){
			paymentStatusStr= "已打款";
		}
		if(value == 5){
			paymentStatusStr= "已打余额";
		}
		if(value == 6){
			paymentStatusStr= "被动余额";
		}
		if(value == 7){
			paymentStatusStr= "提前退房取消";
		}
		if(value == 8){
			paymentStatusStr= "未绑定银行卡";
		}
		if(value == 9){
			paymentStatusStr= "失败";
		}
		if(paymentStatusStr == ""){
			paymentStatusStr = "*";
		}
		
		return paymentStatusStr;
	}
	/**
	 * 收款单收款状态 1：未同步 2：同步成功 3：同步失败
	 */
	commonUtils.getPaymentSta=function(value, row, index){
		var paymentStatusStr= "";
		if(value == 1){
			paymentStatusStr= "未同步";
		}
		if(value == 2){
			paymentStatusStr= "同步成功";
		}
		if(value == 3){
			paymentStatusStr= "同步失败";
		}
	
		if(paymentStatusStr == ""){
			paymentStatusStr = "*";
		}
		
		return paymentStatusStr;
	}
	
	/**
	 * 付款单来源 1：定时任务 2：用户结算 3：用户提现 4：新旧订单折算 5：强制取消结算 6：超时取消 7:透支打款
	 */
	commonUtils.getPaySourceType=function(value, row, index){
		var paySourceTypeStr= "";
		if(value == 1){
			paySourceTypeStr= "定时任务";
		}
		if(value == 2){
			paySourceTypeStr= "用户结算";
		}
		if(value == 3){
			paySourceTypeStr= "用户提现";
		}
		if(value == 4){
			paySourceTypeStr= "新旧订单折算";
		}
		if(value == 5){
			paySourceTypeStr= "强制取消结算";
		}
		if(value == 6){
			paySourceTypeStr= "超时取消";
		}
		if(value == 7){
			paySourceTypeStr= "透支打款";
		}
		if(paySourceTypeStr == ""){
			paySourceTypeStr = "*";
		}
		
		return paySourceTypeStr;
	}
	
	/**
	 *  yl_pay(1,"银联支付"),
     * yl_ios_pay(11,"银联借记卡支付"),
	 * yl_ad_pay(12,"银联借记卡支付"),
     * zfb_pay(2,"支付宝支付"),
     * jd_pay(3,"京东支付"),
     * jd_m_pay(31,"京东移动支付"),
     * wx_ios_pay(41,"微信支付"),
     * wx_ad_pay(42,"微信支付"),
     * cft_wx_pay(5,"威富通（微信公众号）支付"),
     *  cash_coupon_pay(106,"代金券"),
     * card_pay(107,"积分卡支付"),
     * account_pay(108,"账户余额支付(余额消费)");
	 */
	commonUtils.getPayType=function(value, row, index){
		var payTypeStr= "";
		if(value == 1){
			payTypeStr= "银联支付";
		}
		if(value == 2){
			payTypeStr= "支付宝支付";
		}
		if(value == 3){
			payTypeStr= "京东支付";
		}
		if(value == 5){
			payTypeStr= "威富通（微信公众号）支付";
		}
		if(value == 11){
			payTypeStr= "银联借记卡支付";
		}
		if(value == 12){
			payTypeStr= "银联借记卡支付";
		}
		
		if(value == 31){
			payTypeStr= "京东移动支付";
		}
		if(value == 41){
			payTypeStr= "微信支付-ios";
		}
		if(value == 42){
			payTypeStr= "微信支付-ad";
		}
		if(value == 106){
			payTypeStr= "代金券";
		}
		if(value == 107){
			payTypeStr= "积分卡支付";
		}
		if(value == 108){
			payTypeStr= "账户余额支付(余额消费)";
		}
		if(payTypeStr == ""){
			payTypeStr = "*";
		}
		
		return payTypeStr;
	}
	/**
	 * 同意查询接口
	 */
	commonUtils.query = function(){
		$('#listTable').bootstrapTable('selectPage', 1);
	}
	//分转化成元
	commonUtils.getMoney = function (value, row, index){
		
		if(value==null||value==""||value==undefined) {
			return "*";
		}
    	return parseFloat(value)/100;
		
	}
    //分转化成元
    commonUtils.getMoneyStr = function (value, row, index){

        if(value==null||value==""||value==undefined ||   typeof(value)!="undefined" ) {
            return "0 元";
        }
        return parseFloat(value)/100 + "元";

    }
	// 格式化时间
	commonUtils.formateDate =  function(value, row, index) {
		
		  if(value==null||value == ""||value==undefined){
			  return "";
		  }
		  var date = new Date(value);
		  var month = date.getMonth()+1;
		  var day = date.getDate();
		  var hours = date.getHours();
		  var minutes = date.getMinutes();
		  var seconds = date.getSeconds();
		  month = month<10?'0'+month:month;
		  day = day<10?'0'+day:day;
		  hours = hours<10?'0'+hours:hours;
		  minutes = minutes<10?'0'+minutes:minutes;
		  seconds = seconds<10?'0'+seconds:seconds;
		  return date.getFullYear()+"-"+month+"-"+day+"  "+hours+":"+minutes+":"+seconds;
	}
	// 格式化时间(隔1个空格)
	commonUtils.formateDateTime =  function(value, row, index) {
		  if(value==null||value == ""||value==undefined){
			  return "";
		  }
		  var date = new Date(value);
		  var month = date.getMonth()+1;
		  var day = date.getDate();
		  var hours = date.getHours();
		  var minutes = date.getMinutes();
		  var seconds = date.getSeconds();
		  month = month<10?'0'+month:month;
		  day = day<10?'0'+day:day;
		  hours = hours<10?'0'+hours:hours;
		  minutes = minutes<10?'0'+minutes:minutes;
		  seconds = seconds<10?'0'+seconds:seconds;
		  return date.getFullYear()+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
	}
	// 格式化日期
	commonUtils.formateDay =  function(value, row, index) {
		
		  if(value==null||value == ""||value==undefined){
			  return "-";
		  }
		  var date = new Date(value);
		  var month = date.getMonth()+1;
		  var day = date.getDate();
		  var date = new Date(value);
		  month = month<10?'0'+month:month;
		  day = day<10?'0'+day:day;
		  return date.getFullYear()+"-"+month+"-"+day;
	}
	
	/**
	 * 获取常量1
	 */
	commonUtils.getConstant = function(value, row, index){
		return 1;
	}

	/* 加载树  公共方法封装  domId:id信息  obj:树的数据  binary：点击回调函数*/
	commonUtils.treeViewCommon =  function (domId,obj,binary){
		//加载左侧树	
	    $('#'+domId).treeview({
	        color: " inherit",
	        data: obj,
	        onNodeSelected: function (event, node) {
	        binary(event, node);
	     }
	  })
	}
	/* layer方法confirm  mes:展示的信息 iconNum：layer的icon binary：confirm方法回调  */
	 commonUtils.layerConfirm = function(mes,iconNum,binary){
		layer.confirm(mes, {icon: iconNum, title:'提示'},function(index){
			binary(index);
		});
	}
	/* 笑脸图标，显示2000ms 自动消失，不需要用户确认*/
	 commonUtils.msgLayer =  function (mesg){
		layer.msg(mesg, {icon: 6,time: 2000, title:'提示'});
	}
	 /**
	  * 获取国家 省 市  区的下拉列表 
	  * 条件：国家id必须为： nationCode  省id必须为：provinceCode 市id必须为cityCode  区id必须为areaCode
	  */
	 commonUtils.getNationInfo = function(id,obj){
		 
		 var pcode = $(obj).val();
		if(id === 'nationCode'){
			$("#provinceCode").empty();
			$("#cityCode").empty();
			$("#areaCode").empty();
		}else if(id === 'provinceCode'){
			$("#cityCode").empty();
			$("#areaCode").empty();
		}else if(id === 'cityCode'){
			$("#areaCode").empty();
		}
		 if(id!=undefined&&id!=null&&id!=null){
			 var _html="";
			 $("#"+id).empty();
			 commonUtils.ajaxPostSubmit(SERVER_CONTEXT+"config/city/getNationInfo", {"pcode":pcode}, function(nation){
				 if(nation){
					 _html +="<option value=''>请选择</option>";
					 for (var i = 0; i < nation.length; i++) {
						 _html +="<option value='"+nation[i].code+"'>"+nation[i].showName+"</option>";
					}
					 $("#"+id).html(_html);
				 }
			 })
		 }
		
	 }
	 /* 日历插件 */
	 commonUtils.datePicker = function(elemId){
		 laydate({
		      elem: '#'+elemId, //目标元素。由于laydate.js封装了一个轻量级的选择器引擎，因此elem还允许你传入class、tag但必须按照这种方式 '#id .class'
		      event: 'focus' //响应事件。如果没有传入event，则按照默认的click
		  });
	 }
	 commonUtils.datePickerFormat = function(elemId){
		 laydate({
		    elem: '#' + elemId,
		    format: 'YYYY-MM-DD hh:mm:ss',
		    istime: true,
		    istoday: true
		 });
	 }
	 
	 /*paramObj示例 {isWeightS:$('#test1').val(),zoName:$('#zoName').val()}*/
	 /* 分页  tableName:table名称,paramObj:参数对象,params:table内部对象     */
	 commonUtils.paginationCommon = function(tableName,paramObj,params){
		    var result = paramObj;
			if(typeof(paramObj) != undefined && typeof(paramObj) == "object"){
				result.limit = params.limit; //页数限制
				result.page = $('#'+tableName).bootstrapTable('getOptions').pageNumber;
				
				/*var resultName = '';
				for(var param in paramObj){
					resultName = param;
					result.resultName = paramObj[param];
				}*/
			}
			return result;
	}
	 /**
	  * 获取可点击值
	  */
	 commonUtils.nameShow = function(value){
		 return "<a href='javascript:void(0);'>"+value+"</a>";

	 }



    // 格式化时间
    commonUtils.formateTimeStr = function formateDate(value, row, index) {
        if (value != null) {
            var vDate = new Date(value);
            return vDate.format("yyyy-MM-dd HH:mm:ss");
        } else {
            return "";
        }
    }

    // 格式化时间
    commonUtils.formateDateStr = function formateDate(value, row, index) {
        if (value != null) {
            var vDate = new Date(value);
            return vDate.format("yyyy-MM-dd");
        } else {
            return "";
        }
    }
    
    /** 设置select选择框 为value的值选中*/
    commonUtils.selectedDefault = function(selectName,value,showName){
    	if(typeof(selectName) != undefined && typeof(selectName) == "string"){
    		$("#"+selectName+" option[value='"+value+"']").attr("selected","selected");	
    	}
    	
    	if(typeof(showName) != undefined && typeof(showName) == "string"){
    		$("#"+showName).val($("#"+selectName+" option[value='"+value+"']").html());	
    	}else if(typeof(showName) != undefined && typeof(showName) == "function"){
    		showName(value);
    	}
	}
    /** 参数对象 构造函数方式实现*/
    commonUtils.Param = function(name,value){
    	this.name = name; 
    	this.value = value; 
    	return this;
    }
    //jumpPageOrExportFile(new Param("url","www.baidu.com"),new Param('rentWay','1'),new Param('beginTime','hello'));
    /** 页面跳转、导出excel都可使用 1 需要传入路径名称为'url' 2 传入任意个参数 */
    commonUtils.jumpPageOrExportFile = function(){
    	   var url = "";
    	   var param = "";
    	   var args = arguments;
    	   for(var i in args){
    		   if(args[i].name == 'url'){
    			   url = args[i].value;
    			}else{
    			   if(!!param){
    				   param += "&"+args[i].name+"="+args[i].value;   
    			   }else{
    				   param += args[i].name+"="+args[i].value;
    			   }
    			   
    		   }
    	   }
    	   if(!!param){
    		   url += "?" + param
    	   }
    	  window.location.href = url;
     } 
    /** 动态生成bootstrapTable*/
    commonUtils.strapTable=function (tableId,dataUrl,queryParam,columnsData) { 
    	  $('#'+tableId).bootstrapTable('destroy'); 
    	  $('#'+tableId).bootstrapTable({ 
    	   url: dataUrl,   //请求后台的URL（*） 
    	   contentType :"application/x-www-form-urlencoded",
    	   method: 'post',      //请求方式（*） 
    	   cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*） 
    	   pagination: true,     //是否显示分页（*） 
    	   queryParams: queryParam,//传递参数（*） 
    	   sidePagination: "server",   //分页方式：client客户端分页，server服务端分页（*） 
    	   pageSize: 10,      //每页的记录行数（*） 
    	   pageList: [10, 20, 50],  //可供选择的每页的行数（*） 
    	   columns: columnsData,
    	   toggle:'table',
    	   paginationFirstText:'首页',
    	   paginationPreText:'上一页',
    	   paginationNextText:'下一页',
    	   paginationLastText:'末页',
    	   singleSelect:true,
    	   height:520,
    	   clickToSelect:true
    	  });
    }
   window.CommonUtils = commonUtils;
}(jQuery));