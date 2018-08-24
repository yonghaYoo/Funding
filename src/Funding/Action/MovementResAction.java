package Funding.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Funding.Bean.Contents;
import Funding.Bean.Funding;
import Funding.Bean.Member;
import Funding.Bean.Reward;
import Funding.Controller.ActionFoward;
import Funding.Service.ContentsService;
import Funding.Service.FundingService;
import Funding.Service.RewardService;


public class MovementResAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ContentsService service = ContentsService.getInstance();
		RewardService service2= RewardService.getInstance();
		HttpSession session = request.getSession();
		ActionFoward forward = new ActionFoward();
		
		if(session.getAttribute("member")!=null) {	
			
			String str = request.getParameter("c_num");
			int c_num=0;
		
			if(str!=null){
				c_num=Integer.parseInt(str);
			}
		
		
			Contents contents =  new Contents();
			contents = service.DetailContents(c_num);
		
			request.setAttribute("Contents", contents);
			
			List<Reward> list = service2.listDetailRewardList(c_num);
			request.setAttribute("list", list);

		
			Member member = new Member();
			member = (Member)session.getAttribute("member");
			
			request.setAttribute("member", member);
			
			forward.setPath("Payment.jsp");
			forward.setRedirect(false);
		}else {
			
			forward.setPath("MovementLoginAction.do");
			forward.setRedirect(true);
		}
		
		return forward;
	}

}
