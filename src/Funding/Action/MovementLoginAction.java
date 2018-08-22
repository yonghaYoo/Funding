package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;

public class MovementLoginAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionFoward forward = new ActionFoward();
		
		forward.setPath("Login.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
