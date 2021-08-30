package com.zhang.service.impl;

import com.zhang.mapper.NewsMapper;
import com.zhang.pojo.News;
import com.zhang.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper newsMapper;
    @Override
    public List<News> Arraylist() {
        return newsMapper.Arraylist();
    }

    @Override
    public void add(News news) {
        Date date=new Date();
        news.setNtime(date);
        newsMapper.add(news);
    }

    @Override
    public News findById(Integer id) {
        return newsMapper.findById(id);
    }

    @Override
    public void update(News news) {
        Date date=new Date();
        news.setNtime(date);
        newsMapper.update(news);

    }

    @Override
    public void delete(Integer id) {
        newsMapper.delete(id);

    }
}
