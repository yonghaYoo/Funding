package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;

public class LogoutAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().invalidate();
		
		ActionFoward forward = new ActionFoward();
		
		forward.setPath("AllListContentsAction.do");
		forward.setRedirect(true);
		return forward;
	}

}
