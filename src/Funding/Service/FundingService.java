package Funding.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Funding.Bean.Funding;
import Funding.Dao.FundingDao;

public class FundingService {
	private static FundingDao dao;
	private static FundingService service = new FundingService();
	
	public static FundingService getInstance(){
		dao= FundingDao.getInstance();
		return service;
	}
	
	public int InsertReFundingService(HttpServletRequest request) throws Exception {
		Funding funding = new Funding();
		
		funding.setF_rename(request.getParameter("f_rename"));
		funding.setF_readd(request.getParameter("f_readd"));
		
		String str1 = request.getParameter("f_card_1");
		int f_card_1=0;
		if(str1!=null){
			f_card_1 = Integer.parseInt(str1);
		}
		funding.setF_card_1(f_card_1);
		
		String str2 = request.getParameter("f_card_2");
		int f_card_2=0;
		if(str2!=null){
			f_card_2 = Integer.parseInt(str2);
		}
		funding.setF_card_2(f_card_2);

		String str3 = request.getParameter("f_card_3");
		int f_card_3=0;
		if(str3!=null){
			f_card_3 = Integer.parseInt(str3);
		}
		funding.setF_card_3(f_card_3);
		
		String str4 = request.getParameter("f_card_4");
		int f_card_4=0;
		if(str4!=null){
			f_card_4 = Integer.parseInt(str4);
		}
		funding.setF_card_4(f_card_4);
		
		String str5 = request.getParameter("f_price");
		int f_price=0;
		if(str5!=null){
			f_price = Integer.parseInt(str5);
		}
		funding.setF_price(f_price);
		
		String str6 = request.getParameter("m_num");
		int m_num =0;
		if(str6!=null){
			m_num = Integer.parseInt(str6);
		}
		funding.setM_num(m_num);

		return dao.InsertReFunding(funding);
	}
	
}
	

