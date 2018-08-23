package Funding.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Funding.Bean.Contents;
import Funding.Dao.ContentsDao;

public class ContentsService {

	private static ContentsDao dao;

	private static ContentsService service = new ContentsService();

	public static ContentsService getInstance() {
		dao = ContentsDao.getInstance();
		return service;
	}

	public Contents DetailContents(int c_num) throws Exception {
		Contents contents = new Contents();

		contents = dao.DetailContents(c_num);

		return contents;
	}

	public List<Contents> AllListContents() throws Exception {
		List<Contents> list = new ArrayList<Contents>();
		list = dao.AllListContents();

		for (int i = 0; i < list.size(); i++) {
			Date date = new Date();
			SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
			String today = f.format(date);
			String itemDate = list.get(i).getC_dead();

			List<Integer> tlist = new ArrayList<Integer>();
			List<Integer> ilist = new ArrayList<Integer>();
			tlist.add(Integer.parseInt(today.substring(0, 4)));
			tlist.add(Integer.parseInt(today.substring(5, 7)));
			tlist.add(Integer.parseInt(today.substring(8, 10)));

			ilist.add(Integer.parseInt(itemDate.substring(0, 4)));
			ilist.add(Integer.parseInt(itemDate.substring(5, 7)));
			ilist.add(Integer.parseInt(itemDate.substring(8, 10)));
			String r1 = null;
			String r2 = null;
			
			List<Integer> value = new ArrayList<Integer>();
			
			for (int j = 0; j < 3; j++) {
				value.add(ilist.get(j)-tlist.get(j));
			}
			
			int result = (value.get(0)*365)+(value.get(1)*30)+(value.get(2));
			
			
			list.get(i).setC_remday(result);
			System.out.println(result);
		}
		
		/*for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getC_remday());
		}*/
		
		for(int i=0;i<list.size();i++){
			dao.GoalPerContents(list.get(i));
			System.out.println(list.get(i).getC_num());
		}
		return list;
	}

	public int InsertContentsService(HttpServletRequest request) throws Exception {
		Contents contents = new Contents();

		String uploadPath = request.getRealPath("receiveimg");
		System.out.println(uploadPath);
		int size = 20 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8",
				new DefaultFileRenamePolicy());

		String str = multi.getParameter("c_num");
		int c_num = 0;
		if (str != null) {
			c_num = Integer.parseInt(str);
		}
		contents.setC_num(c_num);

		String str2 = multi.getParameter("c_goal");
		int c_goal = 0;
		if (str2 != null) {
			c_goal = Integer.parseInt(str2);
		}

		contents.setC_goal(c_goal);

		contents.setC_title(multi.getParameter("c_title"));
		contents.setC_cate(multi.getParameter("c_cate"));
		contents.setC_intro(multi.getParameter("c_intro"));
		contents.setC_text(multi.getParameter("c_text"));
		contents.setC_dead(multi.getParameter("c_dead"));

		if (multi.getFilesystemName("c_thimg") != null) {
			String c_thimg = multi.getFilesystemName("c_thimg");
			contents.setC_thimg(c_thimg);
		} else {
			contents.setC_thimg("");
		}

		if (multi.getFilesystemName("c_midimg") != null) {
			String c_midimg = multi.getFilesystemName("c_midimg");
			contents.setC_midimg(c_midimg);
		} else {
			contents.setC_midimg("");
		}

		if (multi.getFilesystemName("c_topimg") != null) {
			String c_topimg = multi.getFilesystemName("c_topimg");
			contents.setC_topimg(c_topimg);
		} else {
			contents.setC_topimg("");
		}

		return dao.InsertContents(contents);
	}
	
}

/*
 * public int RemDayContents(String c_dead) throws Exception{ Contents contents
 * = new Contents(); int re =0; re = dao.RemDayContents(c_dead);
 * 
 * return re;
 * 
 * }
 */


