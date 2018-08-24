$(function(){
	var i=0;
	var nowpage=-1;
	var prevpage=-2;
/*	
	$('#category').click(function(){
		alert("scrollTop" + $(window).scrollTop()+"px");
	});*/
	
/*$(window).scroll(function(){
	var scrollTop = $(window).scrollTop();
	
	
	if(i!=1){
		
	
			if(scrollTop<100 && scrollTop>0){
				$('body,html').animate({scrollTop:890}, 500);
				i=1;
			}else if(scrollTop<900 && scrollTop>870){
				$('body,html').animate({scrollTop:0}, 500);
				i=0;
			}else{
				return false;
			}
			
	}

});*/
	
	
	$('#nextButton').click(function(){
		
		nowpage++;
		prevpage++;
		if(nowpage>4){
			nowpage=4;
		}
		
		if(prevpage>=3){
			prevpage=3;
		}
	
		
		$.getJSON('data2.json',function(data){
		
			$.each(data,function(index,item){
				if(nowpage==index){
					
					$('#mainImage img').empty();
					$('#mainImage img').css('opacity','0').attr('src',item.src);
					$('#mainImage img').animate({
						opacity: 1
					}),0.5,function(){
						$('#mainImage img').attr('src',item.src);
					}
					
					$('#mainText h1').empty();
					$('#mainText h1').css('opacity','0').text(item.title);
					$('#mainText h1').animate({
						opacity: 1
					}),0.5,function(){
						$('#mainText h1').text(item.title);
					}
					
					
					$('#mainText p').empty();
					$('#mainText p').css('opacity','0').text(item.text);
					$('#mainText p').animate({
						opacity: 1
					}),0.5,function(){
						$('#mainText p').text(item.text);
					}
					
				}
				
			});
				$.each(data,function(index,item){
					if(prevpage==index){
						
						$('#subImage img').empty();
						$('#subImage img').css('opacity','0').attr('src',item.src);
						$('#subImage img').animate({
							opacity: 1
						}),0.5,function(){
							$('#subImage img').attr('src',item.src);
						}
							
					}

				});
	
		});
	});
	
	
	
	$('#beforeButton').click(function(){
		
		nowpage--;
		prevpage--;
		if(nowpage<-1){
			nowpage=-1;
		}
		
		if(prevpage<-2){
			prevpage=-2;
		}
	
		
		$.getJSON('data2.json',function(data){
			
			$.each(data,function(index,item){
				if(nowpage==index){
					
					$('#mainImage img').empty();
					$('#mainImage img').css('opacity','0').attr('src',item.src);
					$('#mainImage img').animate({
						opacity: 1
					}),0.5,function(){
						$('#mainImage img').attr('src',item.src);
					}
					
					$('#mainText h1').empty();
					$('#mainText h1').css('opacity','0').text(item.title);
					$('#mainText h1').animate({
						opacity: 1
					}),'slow',function(){
						$('#mainText h1').text(item.title);
					}
					
					
					$('#mainText p').empty();
					$('#mainText p').css('opacity','0').text(item.text);
					$('#mainText p').animate({
						opacity: 1
					}),0.5,function(){
						$('#mainText p').text(item.text);
					}
					
				}
				
			});
				$.each(data,function(index,item){
					if(prevpage==index){
						
						$('#subImage img').empty();
						$('#subImage img').css('opacity','0').attr('src',item.src);
						$('#subImage img').animate({
							opacity: 1
						}),0.5,function(){
							$('#subImage img').attr('src',item.src);
						}
							
					}

				});
				
		});
	});
});