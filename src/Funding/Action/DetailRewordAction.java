package Funding.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Funding.Bean.Reward;
import Funding.Controller.ActionFoward;
import Funding.Service.RewardService;

public class DetailRewordAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RewardService service = RewardService.getInstance();
		
	
		
		return null;
	}

}
