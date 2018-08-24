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
	
	var s =$('.reInfo input:first-child').val();	
	alert(s);
	var html ='<div class="reWrap">';
		html+='<form>';
		html+='<div class="reTitle"><h2>리워드 #'+count+'</h2></div>';
		html+='<div class="reInfo">';
		html+='<input type="hidden" value='+ s +' name="c_num">'
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


	$('#basicInfoWrap form').submit(function(){
			alert("프로젝트 정보가 저장되었습니다. 리워드 생성으로 이동해주세요.");
	});
	
	$('.indi:nth-child(3n)').click(function(){
		$('#settingRewardWrap').css('display','block');
		$('#basicInfoWrap').css('display','none');
	});
	
	$('.indi:first-child').click(function(){
		$('#settingRewardWrap').css('display', 'none');
		$('#basicInfoWrap').css('display','block');
	});
	
	$('body').on('submit', '.reWrap form', function(){
		alert("aa");
		
		$.ajax({
			url:"InsertRewardAction.do",
			type:'post',
			datatype:'text',
			data:$(this).serialize(),
			success:function(){
				alert("저장되었습니다. 추가를 원하시면 계속 추가해주세요");
			}
		
		});
		return false;
	});
});