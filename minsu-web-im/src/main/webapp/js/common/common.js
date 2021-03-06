$(function(){
    
    var oBody=$('body');

    $('#menu').click(function(){
        oBody.addClass('showNav');
    });
    $('#toggleNav').click(function(){
        oBody.removeClass('showNav');
    });


    setCalendarTd();

    $(".tabs").tab({tabNavObj:".tabTit",tabContentObj:".tabCon",tabContent:".con",eventType:"click"}); 


    $(window).on("orientationchange",function(){ 

        if(window.orientation == 0)// Portrait
        { 

             setCalendarTd();
           // window.location.href =window.location.href;

        }else// Landscape

        { 
            setCalendarTd();

            //Landscape相关操作
             // window.location.href =window.location.href;

        }

    });


    $('.starBig').each(function(){
        var aI=$(this).find('i');
        var _index=0;
        var oInp=$(this).find('input');

        aI.each(function(){
            $(this).click(function(){
                 _index = $(this).index();
                oInp.val(_index+1);
                aI.each(function(){
                   var i = $(this).index();
                   if(i<_index+1){
                       $(this).addClass('s');
                   }else{
                       $(this).removeClass('s');
                   }
                });
            });
        });
    });

   

    $(".checkFormChild").linghtBtn(); 

    radioCheck();
});

function radioCheck(){
    $('span.radio').each(function(){
        $(this).on('touchend',function(){
            $('span.radio').removeClass('radioActive');
            $(this).addClass('radioActive');
        });
    });
}


function setValToInput(obj,id){
    var val=$(obj).val();
    var txt =  $(obj).find("option:selected").text();
    $('#'+id).val(txt);
}
function setValToInputDate(obj,id){
    var val=$(obj).val();
   
    $('#'+id).val(val);
}
function setCalendarTd(){
    $('.calendars table').each(function(){
        var w=$(this).find('tr th:eq(0)').width();
       
        $(this).find('td').each(function(){

            $(this).css({width:w,height:w});

            $(this).find('span').css({width:(w*.9)+'px',height:(w*.9)+'px'});

        });
        
    });
}
//订单详情 收起打开
function sh(obj,id){
    var obj1 = $(obj).find('span.icon');
    var obj2 = $('#'+id);

    if(obj2.is(':visible')){
        obj2.hide();
        obj1.removeClass('icon_b').addClass('icon_t');
    }else{
        obj2.show();
        obj1.removeClass('icon_t').addClass('icon_b');
    }

    
}
//订单详情 输入其他金额中的合计金额改变样式
function keyUpMon(obj){
    var inputVal=$(obj).val(); 
    if(inputVal&&inputVal.indexOf('￥')==-1){
        $(obj).val('￥'+inputVal);
    }
}
function inputVal(obj,id){
    if($(obj).val()!==''){
        $(id).show();
    }else{
        $(id).hide();
    }
}

function clearInp(obj,id){
  $(id).val('');
  $(obj).hide();  
}


/*手机正则验证*/
function checkMobile(tel){
    var telReg;
    var pattern = /^1[34578]\d{9}$/;
    if (pattern.test(tel)) {
        telReg = true;
    }else{
        telReg = false;
    }
    return telReg;
}
/*邮箱验证*/
function checkEmail(email){
    var emailReg;
    var pattern = /^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$/;
    if (pattern.test(email)) {
        emailReg = true;
    }else{
        emailReg = false;
    }
    return emailReg;
}

/*密码6-16位*/
function checkPas(val){
    var emailReg;
    var _val=$.trim(val);
    if (_val.length>=6 && val.length<=16) {
        emailReg = true;
    }else{
        emailReg = false;
    }
    return emailReg;
}


/*是否为空*/
function checkEmpty(val) {
    if(val.length==0){
        return false;
    }else{
        return true;
    }
}


/*提示弹层*/
function showTips(str){
    layer.open({
        content:str,
        shade:false,
        success:function(){
            setTimeout(function(){
                layer.closeAll();
            },1000)
        }
    });
}

function showShadedowTips(str,time){
    if(time){
        layer.open({
            content: str,
            shade:false,
            style: 'background:rgba(0,0,0,.5); color:#fff; border:none;',
            time:time   
        });
    }else{
        layer.open({
            content: str,
             shade:false,
            style: 'background:rgba(0,0,0,.5); color:#fff; border:none;'

        });
    }
    
}
// 创建一个闭包     
(function($) {     
    //插件主要内容 判断表单元素是否全部有值，有值的话那就让提交按扭可点     
    $.fn.linghtBtn = function(options) {     
    // 处理默认参数   
    var opts = $.extend({}, $.fn.linghtBtn.defaults, options);     
    return this.each(function() {  
        var $this=$(this),
        $formInp=$('input:not([type="hidden"])',$this),  
       // $formInp=$('input:not([type="hidden"])',$this),              
        $formSlect=$('select',$this),
        $formTextarea=$('textarea',$this),
        $btn=$(opts.btn,$this),
        $close=$(opts.close,$this);

        var flag=0;

        $formInp.keyup(function(){
            checkAll();
        });
        $formInp.change(function(){
            checkAll();
        });
        $formSlect.change(function(){
            checkAll();
        });
        $formTextarea.keyup(function(){
            checkAll();
        });
        $formTextarea.change(function(){
            checkAll();
        });
        $close.click(function(){
            checkAll();
        });
        




        function checkAll(){

            flag = 1;
            $formInp.each(function(){
                if($(this).val()==''){
                    flag=0;
                }
            });
            $formSlect.each(function(){
                if($(this).val()==''){
                    flag=0;
                }
            });
            $formTextarea.each(function(){
                if($(this).val()==''){
                    flag=0;
                }
            });
           
           
            if(flag==1){
                $btn.removeAttr('disabled').removeClass('disabled_btn');
                
            }else{
                $btn.attr('disabled','disabled').addClass('disabled_btn');
            }
            
            
        }
        
    });
    // 保存JQ的连贯操作结束
    };
    //插件主要内容结束
    
    // 插件的defaults     
    $.fn.linghtBtn.defaults = {     
        form:'.checkFormChild',
        btn:'.org_btn',
        close:'.icon_close'
    };  
    //linghtBtn 用法例：$(".checkFormChild").linghtBtn({form:".checkFormChild",btn:".org_btn"}); 
})(jQuery);    
(function($) {     
    //插件主要内容 tab切换     
    $.fn.tab = function(options) {     
    // 处理默认参数   
    var opts = $.extend({}, $.fn.tab.defaults, options);     
    return this.each(function() {  
        var $this=$(this),
        $tabNavObj=$(opts.tabNavObj,$this),
        $tabContentObj=$(opts.tabContentObj,$this),
        $tabNavBtns=$(opts.tabNavBtn,$tabNavObj),
        $tabContentBlocks=$(opts.tabContent,$tabContentObj);
        $tabNavBtns.bind(opts.eventType,function(){
            var $that=$(this),
            _index=$tabNavBtns.index($that);
            
            if(!$that.hasClass('more')){
                $that.addClass(opts.currentClass).siblings(opts.tabNavBtn).removeClass(opts.currentClass);
                $tabContentBlocks.eq(_index).show().siblings(opts.tabContent).hide();
            }
            
        }).eq(0).trigger(opts.eventType);
    });
    // 保存JQ的连贯操作结束
    };
    //插件主要内容结束
    
    // 插件的defaults     
    $.fn.tab.defaults = {     
        tabNavObj:'.tabNav',
        tabNavBtn:'li',
        tabContentObj:'.tabContent',
        tabContent:'.list',
        currentClass:'active',
        eventType:'click'
    };  
    //tab 用法例：$(".index-tabWrap").tab({tabNavObj:".tabNav",tabContentObj:".tabContent",tabContent:".con",eventType:"click"}); 
})(jQuery);