package Funding.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Funding.Bean.Reward;

public class RewardDao {
	private static RewardDao dao = new RewardDao();
	
	public static RewardDao getInstance() {
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

	public List<Reward> DetailRewardList (int c_num){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Reward> list = new ArrayList<Reward>();
		
		try {
			list = dao.DetailRewardList(c_num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}
}
