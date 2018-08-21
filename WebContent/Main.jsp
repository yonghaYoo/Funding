<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
        href="https://fonts.googleapis.com/css?family=Gothic+A1:700&amp;subset=korean"
        rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/Main.css">
<script src="jquery.js" type="text/javascript"></script>
<script src="jQuery/Main.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
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
   
   <section id="mainFirst">
      <div id="subImage">
         <img  src="img/main4.jpg">
      </div>
      <div id="mainImage">
            <img  src="img/main5.jpg">
         <div   id="mainText">
            <h1>
               DDU DU DDU DU 
            </h1>
            착한얼굴에 그렇지 못한태도 강렬한 몸매속 가려진 볼륨은 두배로
         </div>
         <div id="shadows">
         </div>
      </div>
      <div id="pattern">
      </div>
   </section>
   
   <section id="middle">
      <div   id="catlist">
         <div id="category">
         
      
            
            <div class = "item">
               <div class="itemimg">
                  <img  src="img/cat04.jpg">
               </div>
               <div class="itemname">
                  전체보기
               </div>
            </div>
            
            <div class = "item">
               <div class="itemimg">
               <img  src="img/cat01.jpg">
               </div>
               <div class="itemname">
                  패션/뷰티
               </div>
            </div>
            
            <div class = "item">
               <div class="itemimg">
               <img  src="img/cat02.jpg">
               </div>
               <div class="itemname">
                  식음료
               </div>
            </div>
            
            <div class = "item">
               <div class="itemimg">
               <img  src="img/cat03.jpg">
               </div>
               <div class="itemname">
                  가전기기
               </div>
            </div>
            
            <div class = "item">
               <div class="itemimg">
               <img  src="img/cat05.jpg">
               </div>
               <div class="itemname">
                  소품
               </div>
            </div>
               
         </div>
         <br>
         <div id="conlist">
            <h1>전체보기</h1>
            <hr/>
            <div id="conwrap">
            <c:forEach var="Contents" items="${list}">
            <div class="contents">
               <div class="contentsimg">
                  
                  <a href="MoveDetailAction.do?c_num=${Contents.c_num}"><img src="${Contents.c_thimg}"></a>
                  <!-- img경로 설정 -->
               </div>
               <div class="contentstext">
                  <h3>&nbsp;&nbsp;${Contents.c_title}</h3><br><br>
                  &nbsp;&nbsp;${Contents.c_intro}
               </div>
               <div class="graph">
                  <div class="ing">
                  </div>
               </div>
               <div class = "contentsinfo">
                  <h4>${Contents.c_goalper}%</h4>
                  <p>${Contents.c_sumprice}</p>
                  <p>${Contents.c_remday}일 남음</p>
                  
               </div>
            </div>
            </c:forEach>
            
            </div>
         </div>

      </div>
   </section>
   
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
</body>
</html>