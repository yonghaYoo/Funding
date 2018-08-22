package Funding.Service;

import java.util.ArrayList;
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
		dao = RewardDao.getInstance();
		return service;
	}
/*public List<Reward>listDetailRewardList(int c_num){
	
	List<Reward> list = new ArrayList<Reward>();
	
	list = dao.DetailRewardList(c_num);
	
	return list;

	}*/
	
	public int InsertReward(HttpServletRequest request) {
		Reward reward = new Reward();
		
		String str = request.getParameter("c_num");
		int c_num=0;
		
		if(str!=null) {
			c_num = Integer.parseInt(str);
		}
		
		reward.setC_num(c_num);
		
		String str2 = request.getParameter("r_price");
		int r_price=0;
		
		if(str2!=null) {
			r_price=Integer.parseInt(str2);
		}
		
		reward.setR_price(r_price);
		
		reward.setR_title(request.getParameter("r_title"));
		reward.setR_detail(request.getParameter("r_detail"));
		
		return dao.InsertReward(reward);
	}
}


