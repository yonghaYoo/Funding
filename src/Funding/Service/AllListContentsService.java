package Funding.Service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import Funding.Bean.Contents;
import Funding.Dao.ContentsDao;

public class AllListContentsService {

   private static ContentsDao dao;

   private static AllListContentsService service = new AllListContentsService();
   public static AllListContentsService getInstance(){
      dao = ContentsDao.getInstance();
      return service;
   }

   public List<Contents> AllListContents() throws Exception{
      List<Contents> list = new ArrayList<Contents>();
      list = dao.AllListContents();
      return list;
   }
   
}