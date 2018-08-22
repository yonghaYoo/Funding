package Funding.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Funding.Bean.Reward;
import Funding.Mapper.RewardMapper;

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

			list = sqlSession.getMapper(RewardMapper.class).DetailRewardList(c_num);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}
	
	public int InsertReward(Reward reward) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		try {
			re = sqlSession.getMapper(RewardMapper.class).InsertReward(reward);
			
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
		
		return 0;
	}
}
