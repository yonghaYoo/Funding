package Funding.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Action.Action;


@WebServlet("*.do")
public class AllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AllController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws SecurityException,IOException, ServletException{
    	String requsetURI = request.getRequestURI();//요청받은 uri를 뽑아온다.
    	System.out.println(requsetURI);	// /MVC/insertForm.do //여기서 MVC는 컨텍스트경로.
    	
    	String contextPath = request.getContextPath();	//context경로를 뽑아낸다.
    	String command = requsetURI.substring(contextPath.length()+1);	//command라는 변수에 uri의 컨텍스트 경로를 뺴준다.
    	System.out.println(command);
    	
    	Action action = null;
    	ActionFoward forward = null;
    	System.out.println("wow");
    	
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
