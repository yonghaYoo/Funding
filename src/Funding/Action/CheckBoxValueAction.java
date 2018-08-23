package Funding.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Bean.Contents;
import Funding.Bean.Reward;
import Funding.Controller.ActionFoward;
import Funding.Service.RewardService;

public class CheckBoxValueAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RewardService service = RewardService.getInstance();
		
		List<Reward> list = new ArrayList<Reward>();
		int c_num=0;
		list = service.listDetailRewardList(c_num);
		
		request.setAttribute("list", list);
		
		ActionFoward forward = new ActionFoward();
		forward.setPath("Payment.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
