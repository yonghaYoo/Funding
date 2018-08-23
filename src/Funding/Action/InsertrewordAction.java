package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;
import Funding.Service.RewardService;

public class InsertrewordAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		RewardService service = RewardService.getInstance();
		System.out.println(request.getParameter("c_num"));
		System.out.println(request.getParameter("r_price"));
		service.InsertReward(request);
		
		
		
		ActionFoward forward = new ActionFoward();
		forward.setPath("MovementAddContentsAction.do");
		forward.setRedirect(true);
		return forward;
	}

}
