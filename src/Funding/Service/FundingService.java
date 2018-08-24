package Funding.Service;

import java.util.List;

import Funding.Bean.Contents;
import Funding.Bean.Funding;
import Funding.Bean.Myreservation;
import Funding.Bean.Reward;
import Funding.Dao.FundingDao;
import Funding.Dao.MyreservationDao;

public class FundingService {
	private static FundingDao dao;
	private static MyreservationDao dao2;
	private static FundingService service = new FundingService();
	
	public static FundingService getInstance(){
		dao= FundingDao.getInstance();
		dao2 = MyreservationDao.getInstance();
		return service;
	}
	/*public Funding MyFunding(int m_num) throws Exception{
		Funding MyFunding = new Funding();
		MyFunding = dao.MyFunding(m_num);
		return MyFunding;
		
	}*/

	public List<Myreservation> getMyes(int m_num){
		System.out.println(m_num);
		List<Myreservation> list = null;
		list= dao2.getMyres(m_num);
		
		return list;
	}
}
