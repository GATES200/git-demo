package com.itheima.mapper;

import com.itheima.pojo.IStudent;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName: StudentMapper
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 19:46
 */
public interface IStudentMapper {

    @Select("select * from s_student where id=#{id}")
    IStudent selectOne(Integer id);

    @Select("select * from s_student where cid=#{cid}")
    List<IStudent> selectMany(Integer cid);

    @Update("update s_student set name=#{name},age=#{age} where id=#{id}")
    int update(IStudent iStudent);
}
