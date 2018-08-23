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
import Funding.Action.CheckBoxValueAction;
import Funding.Action.MovementDetailAction;
import Funding.Action.MovementResAction;
import Funding.Action.InsertContentsAction;
import Funding.Action.InsertrewordAction;
import Funding.Action.LoginAction;
import Funding.Action.LogoutAction;
import Funding.Action.MovementAddContentsAction;
import Funding.Action.MovementLoginAction;


@WebServlet("*.do")
public class AllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AllController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws SecurityException,IOException, ServletException{
    	String requsetURI = request.getRequestURI();//�슂泥�諛쏆� uri瑜� 戮묒븘�삩�떎.
    	System.out.println(requsetURI);	// /MVC/insertForm.do //�뿬湲곗꽌 MVC�뒗 而⑦뀓�뒪�듃寃쎈줈.
    	
    	String contextPath = request.getContextPath();	//context寃쎈줈瑜� 戮묒븘�궦�떎.
    	String command = requsetURI.substring(contextPath.length()+1);	//command�씪�뒗 蹂��닔�뿉 uri�쓽 而⑦뀓�뒪�듃 寃쎈줈瑜� 類댁��떎.
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
    	}else if(command.equals("LogoutAction.do")) {
    		action = new LogoutAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MovementResAction.do")) {
    		action = new MovementResAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("CheckBoxValueAction.do")) {
    		action = new CheckBoxValueAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("MovementDetailAction.do")) {
    		action = new MovementDetailAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("InsertrewordAction.do")) {
    		action = new InsertrewordAction();
    		try {
				forward = action.execute(request, response);
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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
