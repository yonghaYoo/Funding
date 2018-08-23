package Funding.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Bean.Contents;
import Funding.Controller.ActionFoward;
import Funding.Dao.ContentsDao;
import Funding.Service.AllListContentsService;

public class AllListContentsAction implements Action {

   @Override
   public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
      AllListContentsService service = AllListContentsService.getInstance();
      List<Contents> list = new ArrayList<Contents>();
      list = service.AllListContents();
      request.setAttribute("list", list);
     
      System.out.println("aa");
      System.out.println(list.get(0));
      
      ActionFoward forward = new ActionFoward();
      forward.setPath("Main.jsp");
      forward.setRedirect(false);
      
      return forward;
   }

}