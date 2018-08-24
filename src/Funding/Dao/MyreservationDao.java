package Funding.Dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Funding.Bean.Myreservation;
import Funding.Mapper.MyreservationMapper;

public class MyreservationDao {
	private static MyreservationDao dao = new MyreservationDao();
	
	public static MyreservationDao getInstance(){
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
	
	
	public List<Myreservation> getMyres(int m_num){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Myreservation> list = null;
		try {
			list = sqlSession.getMapper(MyreservationMapper.class).getMyres(m_num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		return list;
	}
}
