
;(function($,window,document,undefined){
   //默认参数var this.PARAMS;
            var plugin=function(ele, opt){
						this.parent=ele;
						this.defaults= {percent:100 ,w:266,oneCircle:"false"};
						//初始化参数
						this.PARAMS=$.extend({},this.defaults,opt) ;
						this.DrawCircle();
				}
		    //定义方法
			plugin.prototype={
				      DrawCircle:function(){
						
					       if(!canvasSupport()){
								return
							}
							var drawOne=this.PARAMS.oneCircle;
							var r=this.PARAMS.w/2;
							var r1=this.PARAMS.w/2-20;
							var x1=this.PARAMS.w/2;
							var y1=this.PARAMS.w/2;
							var canvas=this.parent[0];
							var tip=this.PARAMS.percent;
							var angle="";
							var init=0;
							var initA=0;
							var preM=0;
							var initM=0;  //因为是半圆  所以初始角度是Math.PI; 
							var s=2*Math.PI/180;
							var bottomC=Math.PI;
							var allCount=180;
							var allCountP=1.8;
							var poinits=new Array();
							if(drawOne=="ture"){

							}else{
								angle=tip*Math.PI/100+Math.PI;
								canvas.width=this.PARAMS.w;
								canvas.height=this.PARAMS.w/2;
								init=180;
								preM=Math.PI;
								initM=Math.PI;  //因为是半圆  所以初始角度是Math.PI;
								s=2*Math.PI/180;
							}
							var cxt=canvas.getContext("2d");
							//cxt.lineCap="round";
							cxt.lineWidth=6;
							var speed=1;
							var radius=this.PARAMS.w/2-2;
							var ball={x:0,y:0,speed:2};
							var T1;
							function drawScreen(){
								cxt.fillStyle="#ffffff";
								cxt.fillRect(0,0,canvas.width,canvas.height);

								//创建圆环与虚线
								//底圆
								cxt.beginPath();
								cxt.strokeStyle="#f1f1f1";
								cxt.arc(x1,y1,r1-6,0,bottomC,true);
								cxt.lineWidth=8;
								cxt.stroke();  //先执行stroke  就不会出现横线
                                cxt.closePath();


								//画实线
								if(initM<angle){
									initM+=s;
								}else{
									initM=angle;
									}
								cxt.beginPath();
								cxt.strokeStyle="#f2c96f";
								cxt.arc(x1,y1,r1-6,0,initM,false);
                                cxt.lineWidth=13;
                                cxt.stroke();  //先执行stroke  就不会出现横线
								cxt.closePath();



							}
						  T1=setInterval(drawScreen,30) 
					  }
			 }
			function canvasSupport(){
			//判断是否支持canvas标签
			 return Modernizr.canvas;
		    }	
		//在插件中使用plugin对象
	    $.fn.audios2=function(options){
		//创建实体
		var plugina=new plugin(this,options);
		}	
})(jQuery,window,document);

