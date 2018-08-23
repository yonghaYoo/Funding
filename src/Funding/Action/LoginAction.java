package Funding.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Funding.Bean.Member;
import Funding.Controller.ActionFoward;
import Funding.Service.ListMemberService;

public class LoginAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ListMemberService service = ListMemberService.getInstance();
		
		String id = request.getParameter("m_id");
		String pw = request.getParameter("m_pw");
		System.out.println("kk");
		List<Member> list = null;
		
		list = service.listMember();
		
		ActionFoward forward = new ActionFoward();
		
		HttpSession session = request.getSession();
		System.out.println(list.get(0).getM_id());
		
		for(int i =0;i<list.size();i++) {
			System.out.println("zz");
			if(id.equals(list.get(i).getM_id()) && pw.equals(list.get(i).getM_pw())) {
				forward.setPath("AllListContentsAction.do");
				forward.setRedirect(false);
				
				/*if(session!=null) {
					session.setAttribute("member", list.get(i));
				}*/
				session.setAttribute("member", list.get(i));
				
				Member member = new Member();
				member = (Member)session.getAttribute("member");
				
				System.out.println(member.getM_num());
				break;
			}else {
				forward.setPath("Login.jsp");
				forward.setRedirect(false);
			}
		}
		
		return forward;
	}

}
