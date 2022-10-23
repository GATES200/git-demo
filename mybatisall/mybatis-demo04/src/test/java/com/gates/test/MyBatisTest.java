package com.gates.test;



import com.itheima.mapper.CategoryMapper;
import com.itheima.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassName: MyTest
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/9/3 9:38
 */
public class MyBatisTest {
   SqlSession sqlSession;
   //动态代理对象
   CategoryMapper categoryMapper;
   @Before
   public void openSqlSession() throws IOException {
      // 读取核心配置文件
      InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
      // 创建工厂对象
      SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
      // 取出SqlSession对象
      sqlSession = factory.openSession();
     categoryMapper = sqlSession.getMapper(CategoryMapper.class);
   }
   @After
   public void closeSqlSession() {
      sqlSession.close();
   }

   @Test
   public void findCategoryTest(){
      Category category = categoryMapper.selectAll(2);
      System.out.println(category);

   }





























}
