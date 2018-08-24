package Funding.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import Funding.Bean.Funding;
import Funding.Mapper.FundingMapper;
import Funding.Bean.Contents;
import Funding.Bean.Funding;
import Funding.Bean.Member;
import Funding.Bean.Reward;
import Funding.Mapper.ContentsMapper;
import Funding.Mapper.FundingMapper;
import Funding.Mapper.MemberMapper;
import Funding.Mapper.RewardMapper;


public class FundingDao {
	private static FundingDao dao = new FundingDao();
	
	public static FundingDao getInstance() {
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

	public int InsertReFunding(Funding funding) {
		   SqlSession sqlSession = getSqlSessionFactory().openSession();
		   
		   int re = -1;
		   
		   try {
			   re = sqlSession.getMapper(FundingMapper.class).InsertReFunding(funding);
			   if(re>0) {
				   sqlSession.commit();
			   }else {
				   sqlSession.rollback();
			   }
		   } catch (Exception e) {
			   e.printStackTrace();
		   }finally {
			   sqlSession.close();
		}
		   
		   return re;
	   }

	
	public Funding MyFunding(int m_num){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Funding funding = null;
		try {
		funding = sqlSession.getMapper(FundingMapper.class).MyFunding(m_num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return null;
	}

}
