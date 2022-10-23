package com.gates.test;

import com.itheima.mapper.IClassMapper;
import com.itheima.mapper.IStudentMapper;
import com.itheima.pojo.IClass;
import com.itheima.pojo.IStudent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @ClassName: MyBatisTest
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 19:50
 */
public class MyBatisTest {
    SqlSession sqlSession;
    IStudentMapper iStudentMapper;
    IClassMapper iClassMapper;

    @Before
    public void openSqlSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sessionFactory.openSession();
        iStudentMapper = sqlSession.getMapper(IStudentMapper.class);
        iClassMapper = sqlSession.getMapper(IClassMapper.class);
    }
    @After
    public void closeSqlSession(){
        sqlSession.close();
    }

    @Test
    public void findIStudentByIdTest() {
        IStudent iStudent = iStudentMapper.selectOne(2);
        System.out.println(iStudent);
    }

    @Test
    public void update() {
        IStudent iStudent = iStudentMapper.selectOne(4);
        System.out.println(iStudent);
        int num = iStudentMapper.update(new IStudent(4, "李雷", 21));
        sqlSession.commit();
        IStudent iStudent2 = iStudentMapper.selectOne(4);
        System.out.println(iStudent);

    }

    @Test
    public void selectClass() {
        IClass select = iClassMapper.select(2);
        System.out.println(select);
    }

    @Test
    public void selectMany() {
        List<IStudent> iStudents = iStudentMapper.selectMany(2);
        iStudents.forEach(iStudent -> System.out.println(iStudent));
    }

}
