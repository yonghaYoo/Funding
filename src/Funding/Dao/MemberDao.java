package Funding.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.org.apache.bcel.internal.generic.NEW;

import Funding.Bean.Member;
import Funding.Mapper.MemberMapper;

public class MemberDao {
	private static MemberDao dao = new MemberDao();
	
	public static MemberDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<Member> listMember() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Member> list =null;
		try {
			System.out.println("1");
			System.out.println("sqlSession1111111111: " + sqlSession);
			System.out.println("최종: " + sqlSession.getMapper(MemberMapper.class));
			
			list = sqlSession.getMapper(MemberMapper.class).listMember();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
}
