package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Funding.Bean.Member;
import Funding.Controller.ActionFoward;

public class MovementMyInfoAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {ActionFoward forward = new ActionFoward();
	
	HttpSession session = request.getSession();
	ActionFoward foward = new ActionFoward();
	
	
	if(session.getAttribute("member")!=null) {	
		Member member = new Member();
		member = (Member)session.getAttribute("member");
		
		request.setAttribute("member", member);
		
		forward.setPath("MyPage.jsp");
		forward.setRedirect(false);
	}else {
		
		forward.setPath("MovementLoginAction.do");
		forward.setRedirect(true);
	}
	

	
	return forward;
	}
}