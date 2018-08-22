<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet" type="text/css" href="css/Main.css">-->
<link rel="stylesheet" type="text/css" href="css/Mypage.css">

<title>Insert title here</title>

</head>
<body>
<body>
	<header><!-- 헤더 시작 -->
	<div id="title">
		<h3>프로젝트명</h3>
	</div>

	<div id="loginList">
		<div>로그인</div>
		<div>회원가입</div>
		<div>컨텐츠 추가</div>
	</div>
	</header>
	<!-- 헤더 끝 -->

	<!--  본문 시작 -->
	<div id = "title"></div>

	<div id="Mypage">

		<h3>마이페이지</h3>
	</div>
	<div id = "pageturn"></div>
	<div >
		<ul id ="MyList"> 
			<li><a>내정보 보기<a></a></li>
			<li>결제 내역</li>
			<li>내가 만든 컨텐츠</li>
		</ul>
	</div>
	<br><br>
	
		<div id="Information">
			<div id="PersonalInformation">
			<br><br>
				<div class="name">이름[name]</div><br>
						
				<div class="Id">id[id]</div><br>
				
				<div class = "Email">이메일[e-mail]</div><br>
			
				<div class = "Acc">계좌번호[acc]</div><br>
		
				<div class = "Point">포인트[point]</div><br>
			<br>
	</div>
</div>
	<!-- 본문 끝 -->
	
	<!-- 예약내역 시작 -->
	
	<div id = FundinfList>
		<!-- 나중에 foreach 로 변경 해야 해요... -->
		<div id = FundinfList2>
			<p>컨텐츠 제목</p>
			<p>간단한 소개</p>
			<p>예약 날짜</p>
			<p>예약 금액</p>
			<p>결제 일시</p>
		
		</div>
		
	<div id = "ShareFunding">
		<p>공유하기</p>
		<p>자세히 보기</p>
	</div>	
	</div>
		
	
	
	<div id ="MyCotentsListUp">
		<p>컨텐츠</p>
	</div>
	<div id="ContentsDisplay">
		<div id="img">
			<img  src="img/tumb01.jpg">
			<a href=""></a><!-- detail로 넘어가요 -->
	</div>
	
	
	
	
	</div>
	
	
	<!-- <table border="1">
	<tr>
	<td  colspan="3">결제 내역<td>
	</tr>
	
	<tr border="1">
	<th>이름</th>
	<th>내용</th>
	<th>공유하기</th>
	
	<tr border="1"></tr>
	<td>집사를 위한 주인님 간식</td>
	<td>츄르 100개</td>
	<td></td>
	

	</table> -->
	
	
	

	<!-- 푸터시작 -->
	<footer>

	<div id="f_first"></div>
	<div id="f_second">
		와디즈 (주) | 대표이사 신혜성 | <br> 사업자등록번호 220-88-37661 | <br>
		통신판매업신고 2013-경기성남-0428<br> 경기도 성남시 분당구 판교로 242 (삼평동)<br>
		판교디지털센터 A동 4층 402호<br>
	</div>
	<div id="f_third">

		고객센터 1661-9056 | info@wadiz.kr<br> 제휴문의 070-5088-0219 |
		partner@wadiz.kr<br> Yellow ID @와디즈<br> 이용약관 | 개인정보처리방침 |
		수수료 항목<br>
	</div>
	</footer>

	<!-- 푸터끝 -->
</body>
</html>