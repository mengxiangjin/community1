package com.jin.community.dao;

import com.jin.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    /*
    * 查询帖子（分页）
    * userId：根据用户查询(0代表查询所有用户)动态拼接sql语句
    * offset：帖子的开始位置
    * limit：每页显示的帖子数（可写死）
    * */
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    /*
    * @Param注解用于给参数取别名
    * 注意:如果只有一个参数，并且用<if>使用,则必须取别名
    * */
    int selectDiscussPostRows(@Param("userId") int userId);
}
