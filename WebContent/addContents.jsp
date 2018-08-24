<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/addContents.css">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gothic+A1:700&amp;subset=korean"
        rel="stylesheet">
<script src="jquery.js" type="text/javascript"></script>
<script src="jQuery/addContents.js" type="text/javascript"></script>
</head>
<body>
	<!-- 헤더 -->
   <header>
      <div id="title">
      <a href="AllListContentsAction.do"><h3>프로젝트명</h3></a>
      </div>
      
      <div id="loginList">
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>
         	<a href="MovementLoginAction.do">
            로그인
            </a>
            </div>
      	</c:when>
      	
         <c:otherwise>
         	<div>
         	<a href="LogoutAction.do">
            로그아웃
            </a>
            </div>
         </c:otherwise>
      </c:choose>
        	
        	
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>
            회원가입

         	</div>
      	</c:when>
      	
      	<c:otherwise>
      		<div>
      			<a href="MovementMyInfoAction.do">
    	 마이 페이지
    	 		</a>
      		</div>
      	</c:otherwise>
      </c:choose>
         <div>
         	<a href="MovementAddContentsAction.do">
            컨텐츠 추가
            </a>
         </div>
      </div>
   </header>
   
   
   <!-- 헤더 끝 -->
	
	
		
		<!-- 상단 인디케이터 -->
	<div id="wrapper">
	<div id="space"></div>
<div id="toptitle"><h1>프로젝트 등록</h1></div>
		<section id="indicater">
			<div id="indiwrapper">
				<div class ="indi"><p>기본정보</p></div>
				<div class="line"></div>
				<div class="indi"><p>리워드 설정</p></div>
				<div class="line"></div>
				<div class="indi"><p>완료</p></div>
			</div>
		</section>
	
	<!-- 상단 인디케이터 끝 -->
	
	
<!-- 	<section id= "allWarp"> -->
	<!-- 기본정보 -->
		
			<div id = "basicInfoWrap">
				<form action="InsertContentsAction.do" method="post" enctype="multipart/form-data">
				<div class="info">
					<h2>프로젝트 제목</h2>
					<div>프로젝트를 잘 나타내거나 흥미를 갖게 할 수 있는 멋진 제목을 입력해보세요. <br>
							  프로젝트 페이지와 메인페이지에 사용됩니다.
					</div>
					<input type="text" id="title" name="c_title">
				</div>
				
				<div class="info">
					<h2>프로젝트 요약</h2>
					<div>프로젝트에 대해 간략한 소개를 해주세요.<br>
							  메인페이지의 프로젝트 카드이미지에 사용됩니다.
					</div>
					<input type="text" id="intro" name="c_intro">
				</div>
				
				<div class="info">
					<h2>카테고리</h2>
					<div>프로젝트의 카테고리를 지정해주세요!<br> 
							  이용자분들이 나의 프로젝트를 좀더 쉽게 찾아볼수있게 도와줍니다.
					</div>
					<select name ="c_cate">
						<option value="A">패션/뷰티</option>
						<option value="B">식음료</option>
						<option value="C">가전기기</option>
						<option value="D">소품</option>
					</select>
				</div>
				
				<div class="info">
					<h2>썸네일 이미지</h2>
					<div>썸네일이미지는 프로젝트가 소개되는 모든화면에 노출되는 사진입니다.<br>
							  가로 304px 세로 225px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					
					<input type = "file"  id="thumbImg" name="c_thimg">
				</div>
								
				<div class="info">
					<h2>본문 내용</h2>
					<div>프로젝트의 자세한 설명을 적어주세요! <br> 
							  상세페이지 상단에 들어갈 글이니 이용자들의 눈길을 끌만한 글을 작성해보세요!
					</div>
					<textarea rows="6" cols="100" name="c_text" ></textarea>
				</div>
				
				<div class="info">
					<h2>본문 이미지</h2>
					<div>프로젝트의 자세한 설명을 도와주는 이미지를 넣어주세요! 본문 내용 아래에 삽입될 이미지입니다. <br>
							  가로 868px 세로 1464px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					<input type = "file"  id="midImg" name="c_midimg">
				</div>
				
			
				<div class="info">
					<h2>메인 이미지</h2>
					<div>메인이미지는 프로젝트를 클릭했을시 제일 먼저 보이는 이미지입니다. 첫인상을 판가름하지요.<br>
							  가로 1522px 세로 720px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					
					<input type = "file"  id="dmainImg" name="c_topimg">
				</div>
				
				<div class="info">
					<h2>마감날짜</h2>
					<div>해당 프로젝트의 마감날짜를 설정해주세요.
					</div>
					<input type = "date"  id="deadDate" name="c_dead">
				</div>
				
				<div class="info">
					<h2>목표금액</h2>
					<div>프로젝트를 진행하기 위한 최소한의 목표금액을 입력해주세요.
					</div>
					<input type="number" id="goalMoney" name="c_goal">
				</div>
				
				<div id="submit">
				 <input type="hidden" value=${member.c_num } name="c_num">
					<input type="submit" id ="save" value="저장">
					<div id="nextStep"><p>다음 단계</p></div>
				</div>
				</form>
			</div>
		
	<!-- 기본정보 끝 -->
	
	<!-- 리워드 설정 -->
		<div id = "settingRewardWrap">
			<div class="reWrap">
			<form>
				<div class="reTitle">
					<h2>리워드 #1</h2>
				</div>
				<div class="reInfo">
						<input type="hidden" value=${member.c_num } id="c_num" name="c_num">
					<p>
						금액
						<input type="number" id="rewardMoney" name="r_price">
					</p>
					
					<p>
						리워드명
						<input type="text" id="rewardTitle" name="r_title">
					</p>
					
				
						<div>상세설명</div>
						<!-- <hr/> -->
						<textarea rows="6" cols="72" name="r_detail"></textarea>
					
					
				</div>
				
				<div class="delete">
					<img src="img/delete.png">
				</div>

				<div class="resubmit">
					<input type="submit"  id="resubmit" value="리워드 저장">
				</div>
			</form>
			</div>
			
			<div id = "newReward"><p>새 리워드 추가</p></div>
			
			<div id ="nextorbefore">
				<div id="before"><p>이전단계</p></div>
				<div id="next"><p>다음단계</p></div>
			</div>
		</div>
	<!-- 리워드 설정 끝 -->
	<!-- </section> -->
	</div>
	
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