package Funding.Dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Funding.Bean.Contents;
import Funding.Mapper.ContentsMapper;

public class ContentsDao {
	private static ContentsDao dao = new ContentsDao();

	public static ContentsDao getInstance() {
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
public Contents DetailContents(int c_num){
	SqlSession sqlSession = getSqlSessionFactory().openSession(); //공장 문 열고
	Contents contents = new Contents();
	try {
		contents = sqlSession.getMapper(ContentsMapper.class).DetailContents(c_num);
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		sqlSession.close(); //문 닫음
	}
	return contents;
	
}
}
