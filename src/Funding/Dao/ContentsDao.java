package Funding.Dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.org.apache.bcel.internal.generic.Select;

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
   
   public List<Contents> AllListContents(){
      SqlSession sqlSession = getSqlSessionFactory().openSession();
      
      List<Contents> list = new ArrayList<Contents>();
      list=null;
      
      try {
    	  System.out.println(sqlSession.getMapper(ContentsMapper.class));
         list = sqlSession.getMapper(ContentsMapper.class).AllListContents();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         sqlSession.close();
      }
         return list;
   }
   
   public Contents DetailContents(int c_num) {
	   SqlSession sqlSession = getSqlSessionFactory().openSession();
	   Contents contents = new Contents();
	   
	   try {
		contents = sqlSession.getMapper(ContentsMapper.class).DetailContents(c_num);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		sqlSession.close();
	}
	   
	   return contents;
   }
   
   
   public int InsertContents(Contents contents) {
	   SqlSession sqlSession = getSqlSessionFactory().openSession();
	   
	   int re = -1;
	   
	   try {
		   re = sqlSession.getMapper(ContentsMapper.class).InsertContents(contents);
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