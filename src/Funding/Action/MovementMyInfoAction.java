package Funding.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Funding.Bean.Funding;
import Funding.Bean.Member;
import Funding.Bean.Myreservation;
import Funding.Controller.ActionFoward;
import Funding.Service.FundingService;

public class MovementMyInfoAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ActionFoward forward = new ActionFoward();
	
	HttpSession session = request.getSession();
	ActionFoward foward = new ActionFoward();
	FundingService service = FundingService.getInstance();
	
	if(session.getAttribute("member")!=null) {	
		Member member = new Member();
		member = (Member)session.getAttribute("member");
		
		request.setAttribute("member", member);
		
		int m_num=member.getM_num();
		
		List<Myreservation> list = null;
		list = service.getMyes(m_num);
		
		request.setAttribute("reList", list);
		
		forward.setPath("MyPage.jsp");
		forward.setRedirect(false);
	} else {
		
		forward.setPath("MovementLoginAction.do");
		forward.setRedirect(true);
	}
	

	
	return forward;
	}
}