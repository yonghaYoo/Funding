package Funding.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;

import Funding.Bean.Contents;
import Funding.Controller.ActionFoward;
import Funding.Dao.ContentsDao;
import Funding.Service.AllListContentsService;
import Funding.Service.ContentsService;

public class AllListContentsAction implements Action {

   @Override
   public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
      AllListContentsService service = AllListContentsService.getInstance();
      ContentsService service2 = ContentsService.getInstance();
      
      List<Contents> list = new ArrayList<Contents>();
      list = service2.AllListContents();
      
      request.setAttribute("list", list);
      
      ActionFoward forward = new ActionFoward();
      forward.setPath("Main.jsp");
      forward.setRedirect(false);
      
      return forward;
   }

}