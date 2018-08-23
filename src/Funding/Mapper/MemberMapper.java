package Funding.Mapper;

import java.util.List;
import Funding.Bean.Member;

public interface MemberMapper {
	List<Member> listMember();
	Member infoMember(int m_num);
}
