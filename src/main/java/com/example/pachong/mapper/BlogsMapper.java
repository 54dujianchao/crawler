package com.example.pachong.mapper;

import com.example.pachong.TT.Pojo.Blogs;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsMapper {
    @Insert({
        "insert into blogs (id, user_id, ",
        "user_name, user_image, ",
        "`name`, summary, created_at, ",
        "content)",
        "values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{userImage,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{summary,jdbcType=VARCHAR}, #{createdAt,jdbcType=DOUBLE}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Blogs record);

    @Select({
        "select",
        "id, user_id, user_name, user_image, `name`, summary, created_at, content",
        "from blogs"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_image", property="userImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.DOUBLE),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Blogs> selectAll();
}