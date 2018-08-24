package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;
import Funding.Service.FundingService;

public class InsertReFundingAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		FundingService service = FundingService.getInstance();
		
		service.InsertReFundingService(request);
		
		ActionFoward forward = new ActionFoward();
		forward.setPath("Main.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
