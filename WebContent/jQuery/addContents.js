$(function(){
	var count=1;
	$('#nextStep').click(function(){
		
		$('#settingRewardWrap').css('display','block');
		$('#basicInfoWrap').css('display','none');
		
		$('body,html').animate({scrollTop:0},500);
	});
	
	
$('#before').click(function(){
		
		$('#settingRewardWrap').css('display','none');
		$('#basicInfoWrap').css('display','block');
		
		$('body,html').animate({scrollTop:0},500);
	});
	
$('#newReward').click(function(){
	count++;
	var html ='<div class="reWrap">';
		html+='<form Action="" method="post">';
		html+='<div class="reTitle"><h2>리워드 #'+count+'</h2></div>';
		html+='<div class="reInfo">';
		html+='<p>금액<input type="number" id="rewardMoney" name="r_price"></p>';
		html+='<p>리워드명<input type="text" id="rewardTitle" name="r_title"></p>';
		html+='<div>상세설명</div><textarea rows="6" cols="72" name="r_detail"></textarea></div>';
		html+='<div class="delete"><img src="img/delete.png"></div>';
		html+='<div class="resubmit"><input type="submit"  id="resubmit" value="리워드 저장"></div></form></div>';
	
		$('#newReward').before(html);
});


$('body').on('click','.delete',function(){
	$(this).closest('.reWrap').hide();
	alert("zzz")
});
});