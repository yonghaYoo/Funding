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
		dao= RewardDao.getInstance();
		return service;
	}
public List<Reward>listDetailRewardList(int c_num){

	List<Reward> list = new ArrayList<Reward>();
	
	list = dao.DetailRewardList(c_num);
	
	return list;

	}
	
	
}


