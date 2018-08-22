package Funding.Service;

import java.util.ArrayList;
import java.util.List;

import Funding.Bean.Member;
import Funding.Dao.MemberDao;

public class ListMemberService {

	private static MemberDao dao;
	private static ListMemberService service = new ListMemberService();
	
	public static ListMemberService getInstance() {
		dao = MemberDao.getInstance();
		return service;
	}
	
	public List<Member> listMember(){
		List<Member> list = null;
		list=dao.listMember();
		
		return list;
	}
}
