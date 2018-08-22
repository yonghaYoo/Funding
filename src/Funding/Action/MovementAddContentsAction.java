package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Funding.Controller.ActionFoward;

public class MovementAddContentsAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		
		ActionFoward forward = new ActionFoward();
		
		if(session.getAttribute("member")!=null) {	
			forward.setPath("addContents.jsp");
			forward.setRedirect(false);
			
		}else {
			forward.setPath("MovementLoginAction.do");
			forward.setRedirect(true);
		}
		
		return forward;
	}

}
