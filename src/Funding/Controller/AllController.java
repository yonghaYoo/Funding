package Funding.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Action.Action;
import Funding.Action.AllListContentsAction;
import Funding.Action.MovementDetailAction;
import Funding.Action.MovementResAction;
import Funding.Action.InsertContentsAction;
import Funding.Action.LoginAction;
import Funding.Action.MemberInfoAction;
import Funding.Action.MovementAddContentsAction;
import Funding.Action.MovementLoginAction;
import Funding.Action.MovementMyInfoAction;

@WebServlet("*.do")
public class AllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AllController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)throws SecurityException,IOException, ServletException{
    	String requsetURI = request.getRequestURI();
    	System.out.println(requsetURI);	
    	
    	String contextPath = request.getContextPath();	
    	String command = requsetURI.substring(contextPath.length()+1);
    	System.out.println(command);
    	
    	Action action = null;
    	ActionFoward forward = null;
    	System.out.println("wow");
    	
    	
    	if(command.equals("AllListContentsAction.do")){
    		action = new AllListContentsAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("LoginAction.do")) {
    		action = new LoginAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MovementLoginAction.do")) {
    		action = new MovementLoginAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MovementAddContentsAction.do")) {
    		action = new MovementAddContentsAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("InsertContentsAction.do")) {
    		action = new InsertContentsAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MemberInfoAction.do")){
    		action = new MemberInfoAction();
    		try {
    			forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MovementMyInfoAction.do")){
    		action = new MovementMyInfoAction();
    		try {
				forward= action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	 	
    	}
    	
    	if(forward!=null){
    		if(forward.isRedirect()){
    			response.sendRedirect(forward.getPath());
    		}else{
    			
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
