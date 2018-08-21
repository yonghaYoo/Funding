<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Gothic+A1:700&amp;subset=korean" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gugi" rel="stylesheet">

<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/Payment.css">
<script src="jquery.js" type="text/javascript"></script>
<script src="jQuery/Payment.js" type="text/javascript"></script>
</head>
<body>
<!-- 헤더 시작 -->
	<header>
		<div id="title">
		<h3>프로젝트명</h3>
		</div>
		<div id="loginList">
			<div>
				로그인
			</div>
			<div>
				회원가입
			</div>
			<div>
				컨텐츠 추가
			</div>
		</div>
	</header>
	<!-- 헤더끝 -->
	
	<!-- 타이틀 -->
		<section id = "f_title">
			<div id = "backPage">
				<img  src="img/back.png">
				<p>돌아가기</p>
			</div>
			<div id ="f_maintitle">
				<h1>And i had the answers <br>but now they mean nothing</h1>
			</div>
		</section>
	<!-- 타이틀 끝 -->
	
	<!-- 상단 인디케이터 -->
	<div id="wrapper">
		<section id="indicater">
			<div id="indiwrapper">
				<div class ="indi"><p>리워드 선택</p></div>
				<div class="line"></div>
				<div class="indi"><p>결제정보입력</p></div>
				<div class="line"></div>
				<div class="indi"><p>완료</p></div>
			</div>
		</section>
	
	<!-- 상단 인디케이터 끝 -->
	
	<!--  리워드 선택 시작-->
	<form action="" method="post">
		<section id ="selectReward">
				
				<h2>리워드 선택</h2>
				<!-- 리워드 체크 -->
				<div class="select">
					<div class="check">
						<input type="checkbox"  id="r_num" >
						<label for="r_num"><span></span>	</label>
					</div>
					<div class="rewardText">
						<h4>17900원 펀딩합니다</h4>
						<hr/>
						<p><b>[리워드 제목]</b></p>
						<p>[리워드 상세 설명]</p>
						<p>배송비 없음</p>
					</div>
				</div>
				
				<div class="select">
					<div class="check">
						<input type="checkbox"  id="r_num1" >
						<label for="r_num1"><span></span>	</label>
					</div>
					<div class="rewardText">
						<h4>17900원 펀딩합니다</h4>
						<hr/>
						<p><b>[리워드 제목]</b></p>
						<p>[리워드 상세 설명]</p>
						<p>배송비 없음</p>
					</div>
				</div>
				
				<div class="select">
					<div class="check">
						<input type="checkbox"  id="r_num2" >
						<label for="r_num2"><span></span>	</label>
					</div>
					<div class="rewardText">
						<h4>17900원 펀딩합니다</h4>
						<hr/>
						<p><b>[리워드 제목]</b></p>
						<p>[리워드 상세 설명]</p>
						<p>배송비 없음</p>
					</div>
				</div>
				<!-- 리워드 체크 끝 -->
				<div id = "totalPrice">
					<p>(title) 에</p>
					<p><b>(거래금액)</b> 를 펀딩합니다. </p>
					<div id="nextButton"> 다음단계로</div>
				</div>
			
		</section>
	<!-- 리워드 선택 끝 -->
	
	<!-- 결제정보 입력 -->	
		<section id="paywrap">
			<section id="paymentInfo">
				<div id="obj_price">
					<h2>수량 및 가격</h2>
					<p>[리워드 제목]</p>
					<p>[리워드 상세 설명]</p>
					<p>수량 : 1개&nbsp; &nbsp;&nbsp;64000원</p>
				</div>
				<div id ="depay">
					<h2>배송비</h2>
					<p>0원</p>
				</div>
				<div id = "finalPrice">
					<h1>최종결제금액</h1>
					<h1>64000원</h1>
				</div>
			</section>
			
			<section id="deInfo">
				<div id="deform">
					<h2>배송지 정보</h2>
						<div id="dewrap">
						<div id ="dename">
							<h4>
								받는분 성함
							</h4>
							<input type="text"  id="f_rename">
						</div>
						<div id ="depno">
							<h4>
								받는분 전화번호
							</h4>
							<input type="text"  id="f_repno">
						</div>
						</div>
						<div id ="address">
							<h4>주소</h4>
							<input type="text"  id="f_readd" name="f_readd">
						</div>
						<div id ="demessage">
							<h4>배송메시지</h4>
							<input type="text"  id="f_demessage">
						</div>
				</div>
				<div id ="deguied">
					<h2>배송안내</h2>
					<p>
					펀딩에 대한 보답으로 메이커는 리워드를 약속한 배송일에 제공하기 위해 노력을 다합니다. <br>
					<br>
					리워드의 배송은 메이커다 담당하는 의무로 프로젝트 스토이에 안내한 배송시작일에 배송시작을 원칙으로 합니다.<br>
					<br>
					다만 프로젝트 진행중 예기치 못한 사정으로 리워드 제작 및 배송 일정 변경이 있을 수 있음을 알려드립니다. 변경되는 배송일은 새소식으로 메이커가 직접 전해드립니다.<br>
					<br>
					리워드 제품의 불량 또는 배송오류에 대한 문의 접수 및 교환 처리를 리워드를 제공하는 메이커가 직접 담당하고 있습니다. 메이커에게 문희하기에 기재된 연락처로 직접 소통할 수 있습니다.<br> 
					</p>
				</div>
			</section>
			
			<section id="payInfo">
				<div id="payform">
					<h4>결제정보</h4>
						<div id="paywrap1">
							<div id="cardnum">
								<p>신용(체크)카드 번호</p>
								<input type="text" id="f_card_1" name="f_card_1">
								<input type="text" id="f_card_2" name="f_card_2">
								<input type="text" id="f_card_3" name="f_card_3">
								<input type="text" id="f_card_4" name="f_card_4">
							</div>
							<div id="carddate">
								<p>유효기간</p>
								<input type="text" id="f_mondate">
								<input type="text" id="f_yeardate">
							</div>
						</div>
						<div id="paywrap2">
							<div id="cardpw">
								<p>비밀번호 앞 2자리</p>
								<input type="text" id="f_pw">
								● ●
							</div>
							<div id ="birth">
								<p>생년월일(주민등록번호 앞6자리)</p>
								<input type="text" id="f_birth">
							</div>
						</div>
				</div>
				<div id ="payguied">
					<h4>저희는 결제 예약을<br> 이용합니다.</h4>
					쇼핑하기 처럼 바로 결제되지 않습니다.프로젝트의 성공여부에 따라 결제가 실행됩니다. <br>
					<br><br>
					결제정보 입력후 결제예약을 완료하시면, 결제대기중으로 예약상태에 등록됩니다.<br>
					<br><br>
					프로젝트 종료일의 다음 영업일에 펀딩 성공여부에 따라 결제실행/결제취소가 진행됩니다.<br>
					<br>
				</div>
					
					<div id="paysubmit">
						<div id ="back">돌아가기</div>
						<input type="submit" value="결제 예약하기" id="paysubm">
					</div>
			</section>
		</section>
	</form>
	</div>
	<!-- 결제정보입력 끝 -->
	
	<!-- 푸터시작 -->
	<footer>
	
		<div id="f_first">
		</div>
		<div id="f_second">
			와디즈 (주) | 대표이사 신혜성 | <br>
			사업자등록번호 220-88-37661 | <br>
			통신판매업신고 2013-경기성남-0428<br> 
			경기도 성남시 분당구 판교로 242 (삼평동)<br> 
			판교디지털센터 A동 4층 402호<br>
		</div>
		<div id="f_third">
		
		고객센터 1661-9056 | info@wadiz.kr<br> 

		제휴문의 070-5088-0219 | partner@wadiz.kr<br> 

		Yellow ID @와디즈<br> 

		이용약관 | 개인정보처리방침 | 수수료 항목<br> 
		</div>
	</footer>
	
	<!-- 푸터끝 -->
</body>
</html>