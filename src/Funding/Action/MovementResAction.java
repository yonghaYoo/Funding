package Funding.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Funding.Bean.Contents;
import Funding.Bean.Payment;
import Funding.Bean.Reward;
import Funding.Controller.ActionFoward;
import Funding.Service.ContentsService;
import Funding.Service.PaymentService;
import Funding.Service.RewardService;


public class MovementResAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ContentsService service = ContentsService.getInstance();
		RewardService service2= RewardService.getInstance();
		
		
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
		
		ActionFoward forward = new ActionFoward();
		forward.setPath("Payment.jsp");
		forward.setRedirect(false);
		
		return forward;
		
	
	}

}
