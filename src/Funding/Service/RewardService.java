package Funding.Service;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.ListModel;

import Funding.Bean.Reward;
import Funding.Dao.RewardDao;

public class RewardService {
	private static RewardDao dao;
	private static RewardService service = new RewardService();

	
	public static RewardService getInstance(){
		return service;
	}
public List<Reward>listDetailRewardList(HttpServletRequest request){
	String str =request.getParameter("c_num");
	int c_num=0;
	if(str!=null){
		c_num=Integer.parseInt(str);
	}
	
	List<Reward> list = dao.DetailRewardList(c_num);
	
	return list;

	}
	
	
}


