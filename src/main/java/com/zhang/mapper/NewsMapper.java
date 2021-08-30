package com.zhang.mapper;

import com.zhang.pojo.News;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface NewsMapper {
    //全查
    public List<News> Arraylist();
    //添加
    public void add(News news);
    //回显
    public News findById(Integer id);
    //修改
    public void update(News news);
    //删除
    public void delete(Integer id);

}
