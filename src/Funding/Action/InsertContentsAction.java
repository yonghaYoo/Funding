package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;
import Funding.Service.ContentsService;

public class InsertContentsAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ContentsService service = ContentsService.getInstance();
		
		service.InsertContentsService(request);
		
		ActionFoward forward = new ActionFoward();
		forward.setPath("MovementAddContentsAction.do");
		forward.setRedirect(false);
		return forward;
	}

}
