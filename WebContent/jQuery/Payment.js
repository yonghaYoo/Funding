$(function(){
	var sum=0;
	
	$('#nextButton').click(function(){
		var scrollTop = $(window).scrollTop();
		
		$('#paywrap').css('display','block');
		$('#selectReward').css('display','none');
		
		$('body,html').animate({scrollTop:0},500);
		
		$('.indi:nth-child(3n)').css('background-color','#14a085').css('color','white').css('box-shadow','5px 5px 10px #a8a8a8').css('border','2px solid #14a085');
		$('.indi:first-child').css('background-color','white').css('color','black').css('box-shadow','0px 0px 0px').css('border','2px solid #e0e0e0');
		
		
		var html ='<input type="hidden" value="'+sum+'"name="f_price">';
		$('#payguied').after(html);
		
		
	});
	
	
	$('#back').click(function(){
		var scrollTop = $(window).scrollTop();
		
		$('#paywrap').css('display','none');
		$('#selectReward').css('display','block');
		
		$('body,html').animate({scrollTop:0},500);
		
		$('.indi:first-child').css('background-color','#14a085').css('color','white').css('box-shadow','5px 5px 10px #a8a8a8').css('border','2px solid #14a085');
		$('.indi:nth-child(3n)').css('background-color','white').css('color','black').css('box-shadow','0px 0px 0px').css('border','2px solid #e0e0e0');
	});
	
	$('body').on('click','input[type="checkbox"]',function(){
		var count =0;
	
			if ($(this).is(":checked")) {
				sum+=parseInt($(this).val());
				$('#totalPrice b').empty();
				$('#totalPrice b').prepend(sum);
				
				$('#finalPrice h1:last-child').empty();
				$('#finalPrice h1:last-child').prepend(sum + "원");
				
			}else {
				sum-=parseInt($(this).val());
				$('#totalPrice b').empty();
				$('#totalPrice b').prepend(sum);
			}

		
	});
	
	$('#wrapper form').submit(function(){
		alert("예약이 완료되었습니다.");
		
		
	})
	

	
});