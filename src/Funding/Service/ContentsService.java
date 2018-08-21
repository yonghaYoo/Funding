package Funding.Service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import Funding.Bean.Contents;
import Funding.Dao.ContentsDao;

public class ContentsService {
	
private static ContentsDao dao;

private static ContentsService service = new ContentsService();
public static ContentsService getInstance(){
	dao = ContentsDao.getInstance();
	return service;
}

/*public Contents DetailContents(HttpServletRequest request) throws Exception{
	Contents contents = new Contents();
	String str = request.getParameter("c_num");
	int c_num=0;
	if(str!=null){
		c_num = Integer.parseInt(str);
	}	
	contents = dao.DetailContents(c_num);
	return contents;
}*/

public List<Contents> AllListContents() throws Exception{
    List<Contents> list = new ArrayList<Contents>();
    list = dao.AllListContents();
    return list;
 }
}
