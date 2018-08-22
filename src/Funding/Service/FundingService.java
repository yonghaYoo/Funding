package Funding.Service;

import Funding.Dao.FundingDao;

public class FundingService {
	private static FundingDao dao;
	private static FundingService service = new FundingService();
	
	public static FundingService getInstance(){
		dao= FundingDao.getInstance();
		return service;
	}
	
}
