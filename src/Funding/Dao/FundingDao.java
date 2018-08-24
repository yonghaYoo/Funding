package Funding.Dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Funding.Bean.Funding;
import Funding.Mapper.FundingMapper;

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
}
