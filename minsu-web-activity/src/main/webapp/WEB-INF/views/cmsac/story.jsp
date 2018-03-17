<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="applicable-device" content="mobile">
    <meta content="fullscreen=yes,preventMove=yes" name="ML-Config">
    <script>!function(N,M){function L(){var a=I.getBoundingClientRect().width;a/F>540&&(a=540*F);var d=a/10;I.style.fontSize=d+"px",D.rem=N.rem=d}var K,J=N.document,I=J.documentElement,H=J.querySelector('meta[name="viewport"]'),G=J.querySelector('meta[name="flexible"]'),F=0,E=0,D=M.flexible||(M.flexible={});if(H){var C=H.getAttribute("content").match(/initial\-scale=([\d\.]+)/);C&&(E=parseFloat(C[1]),F=parseInt(1/E))}else{if(G){var B=G.getAttribute("content");if(B){var A=B.match(/initial\-dpr=([\d\.]+)/),z=B.match(/maximum\-dpr=([\d\.]+)/);A&&(F=parseFloat(A[1]),E=parseFloat((1/F).toFixed(2))),z&&(F=parseFloat(z[1]),E=parseFloat((1/F).toFixed(2)))}}}if(!F&&!E){var y=N.navigator.userAgent,x=(!!y.match(/android/gi),!!y.match(/iphone/gi)),w=x&&!!y.match(/OS 9_3/),v=N.devicePixelRatio;F=x&&!w?v>=3&&(!F||F>=3)?3:v>=2&&(!F||F>=2)?2:1:1,E=1/F}if(I.setAttribute("data-dpr",F),!H){if(H=J.createElement("meta"),H.setAttribute("name","viewport"),H.setAttribute("content","initial-scale="+E+", maximum-scale="+E+", minimum-scale="+E+", user-scalable=no"),I.firstElementChild){I.firstElementChild.appendChild(H)}else{var u=J.createElement("div");u.appendChild(H),J.write(u.innerHTML)}}N.addEventListener("resize",function(){clearTimeout(K),K=setTimeout(L,300)},!1),N.addEventListener("pageshow",function(b){b.persisted&&(clearTimeout(K),K=setTimeout(L,300))},!1),"complete"===J.readyState?J.body.style.fontSize=12*F+"px":J.addEventListener("DOMContentLoaded",function(){J.body.style.fontSize=12*F+"px"},!1),L(),D.dpr=N.dpr=F,D.refreshRem=L,D.rem2px=function(d){var c=parseFloat(d)*this.rem;return"string"==typeof d&&d.match(/rem$/)&&(c+="px"),c},D.px2rem=function(d){var c=parseFloat(d)/this.rem;return"string"==typeof d&&d.match(/px$/)&&(c+="rem"),c}}(window,window.lib||(window.lib={}));</script>
 
    
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta content="yes" name="apple-mobile-web-app-capable" />
    <meta content="yes" name="apple-touch-fullscreen" />
    <title>自如民宿 旅行者和房东故事</title>
    
    
    
    <style type="text/css">
      * {
        margin: 0;
        padding: 0;
      }

      table {
        border-collapse: collapse;
        border-spacing: 0
      }

      h1,h2,h3,h4,h5,h6 {
        font-size: 100%
      }

      ul,ol,li {
        list-style: none
      }

      em,i {
        font-style: normal
      }

      img {
        border: 0
      }

      input,img {
        vertical-align: middle
      }

      a {
        text-decoration: none
      }

      html,body {
        font-family: "Hiragino Sans GB",Helvetica,sans-serif;
        -webkit-text-size-adjust: none;
        font-size: 100%; color: #444;
      }

      textarea.fixAndroidKeyboard:focus,input.fixAKeyboard:focus {
        -webkit-tap-highlight-color: rgba(255,255,255,0);
        -webkit-user-modify: read-write-plaintext-only; resize:none;
      }
      button,input,select,textarea {
        margin: 0;
        font-family: inherit;
        font-size: 100%;
        padding: 0
      }

      button,input {
        line-height: normal
      }

      button,select {
        text-transform: none
      }

      button,html input[type=button],input[type=reset],input[type=submit],select,textarea {
        cursor: pointer;
       -webkit-appearance: none;
        outline: 0;
        box-shadow: none; border:none;
      }

      button[disabled],html input[disabled] {
        cursor: default
      }

      input[type=checkbox],input[type=radio] {
        padding: 0;
        box-sizing: border-box
      }

      input[type=search] {
        -webkit-box-sizing: content-box;
        -moz-box-sizing: content-box;
        box-sizing: content-box
      }

      input[type=search]::-webkit-search-cancel-button,input[type=search]::-webkit-search-decoration {
        -webkit-appearance: none;
        box-shadow: none
      }

      button::-moz-focus-inner,input::-moz-focus-inner {
        padding: 0;
        border: 0
      }

      input {
        -webkit-appearance: none; border:none;
      }

      input:focus,textarea:focus {
        outline: 0
      }
      .clearfix:after {
        display: block;
        visibility: hidden;
        clear: both;
        height: 0;
        content: "."
      }

      .clearfix {
        display: inline-block
      }

      * html .clearfix {
        height: 1%
      }

      .clearfix {
        display: block
      }

      * {
        tap-highlight-color: rgba(0,0,0,0);
        -webkit-tap-highlight-color: rgba(0,0,0,0);
        -ms-tap-highlight-color: rgba(0,0,0,0)
      }

      ::selection {
        background-color: rgba(13,173,81,0.2);
        color: #333
      }

      ::-moz-selection {
        background-color: rgba(13,173,81,0.2);
        color: #333
      }

      ::-webkit-selection {
        background-color: rgba(13,173,81,0.2);
        color: #333
      }

      * {
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
        cursor: pointer
      }

      .clear:after {
        content: '.';
        clear: both;
        display: block;
        height: 0;
        visibility: hidden;
        font-size: 0;
        line-height: 0
      }

      .clear {
        display: inline-table;
        *zoom: 1
      }

      * html .clear {
        height: 1%
      }

      .clear {
        display: block
      }
      
      .main{margin: 0 .42rem;
      padding-bottom: .5rem}
      .box{padding: .64rem 0; position: relative; font-size:.34rem;color: #444; line-height: .5rem;;text-align:justify;
      text-align-last:justify;}

      

      img{width: 100%; height:100%; vertical-align: top;}
        
      .top_box .text{float:left; box-sizing: border-box;width: 3.3rem; padding-top: 3.5rem}
      .top_box .img{width:5.6rem; float: right; height:8.4rem;}
      .top_box .name{position: absolute; left: 0; top: .95rem; width:4.4rem; height: 2.66rem;}

      .center_box {padding:0;}
      .center_box .img{width: 4.8rem; height: 4.8rem; position: absolute; left: 0; top: .36rem;}
      .center_box .text{border:solid 1px #eee; padding: .4rem .4rem .4rem 1.1rem; margin-left: 4rem; min-height: 5.5rem;
      display: flex;align-items:center;}

      .list li{ padding-top:.64rem; position: relative; border-bottom: solid 1px #eee;}

      .list li .text{padding-top: .266rem; padding-bottom:.48rem;}
      .list li .img{height: 6.1333rem;}
      
      .list li.s2{padding-bottom: .48rem;}
      .list li.s2 .img{width: 4.8rem; height: 7.2rem; float: left;}
      .list li.s2 .text{float: right; height: 7.2rem; width: 4.05rem; padding: 0;display: flex;align-items:center;}
      .viewMore{border:solid 1px #ddd; width: 3.5rem; height:1.2rem; text-align: center; font-size: .4rem; line-height: 1.2rem; display: block; margin: 0rem auto .64rem auto; color: #444; border-radius:5px;}
    </style>
    <script type="text/javascript" src="https://bnbstatics.ziroom.com/act/js/jquery.min.js?v=js.version.1.0003"></script>
    <script type="text/javascript" src="https://bnbstatics.ziroom.com/act/js/md5.js?v=js.version.1.0003"></script>
    <script src="https://bnbstatics.ziroom.com/act/js/common.js?v=js.version.1.0003"></script>
    <script src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
</head>
<body>

     <div id="main" class="main">
          ${bodyHtml }
     </div>
    <a href="javascript:;" id="houseT" class="viewMore">查看房源详情</a>
    <script type="text/javascript">
   //微信分享开始
    setShare();
   
    var shareFlag = 0;
    var curUrl=window.location.href;
	if(curUrl.indexOf('shareFlag=2')>0){
	    shareFlag=2
	  }
   $("#houseT").click(function(){
 	  var fid = $('#fid').val() ? $('#fid').val() : 0;
      var rentWay = rentWay = $('#rentWay').val() ? $('#rentWay').val() : 0;
      minsutuijianJump(fid,rentWay,shareFlag,'https://bnbm.ziroom.com/');
   }); 
   setIframeHeight();
   

 function setShare(){
	 wx.config({
		    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
		    appId:'${appId}', // 必填，公众号的唯一标识
		    timestamp:'${timestamp}' , // 必填，生成签名的时间戳
		    nonceStr:'${nonceStr}', // 必填，生成签名的随机串
		    signature:'${signature}',// 必填，签名，见附录1
		    jsApiList:['onMenuShareAppMessage','onMenuShareTimeline','onMenuShareQQ'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
		});
     wx.ready(function () {
             
             wx.onMenuShareAppMessage({
                 title:'${newsTitle}', // 分享标题
                 desc:'${newThe}', // 分享描述
                 link:window.location.href, // 分享链接
                 imgUrl:  $('#shareImg').val(), // 分享图标
                 type: 'link', // 分享类型,music、video或link，不填默认为link
                 dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
                 trigger: function (res) {
                   },
                 success: function () { 
                     // 用户确认分享后执行的回调函数
                 },
                 cancel: function () { 
                     // 用户取消分享后执行的回调函数
                 },
                   fail: function (res) {
                   }
             });
             
             wx.onMenuShareTimeline({
                 title: '${newsTitle}', // 分享标题
                 link:window.location.href, // 分享链接
                 imgUrl:  $('#shareImg').val(), // 分享图标
                 success: function () { 
                     // 用户确认分享后执行的回调函数
                 },
                 cancel: function () { 
                     // 用户取消分享后执行的回调函数
                 }
             });
             
             wx.onMenuShareQQ({
                 title: '${newsTitle}', // 分享标题
                 desc: '${newThe}', // 分享描述
                 link:window.location.href, // 分享链接
                 imgUrl:  $('#shareImg').val(), // 分享图标
                 success: function () { 
                    // 用户确认分享后执行的回调函数
                   
                 },
                 cancel: function () { 
                    // 用户取消分享后执行的回调函数
                 }
             });
             
           });
               
           wx.error(function(res){
              // config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
               });
 }

  
function setIframeHeight(){
  var agent = navigator.userAgent;
  var h=500;
  var dpr=$('html').attr('data-dpr');
  h=215*dpr;
  $('iframe').each(function(){
    $(this).css('height',h+'px');
  });
}
    
</script>

</body>
</html>