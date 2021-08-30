package com.zhang.controller;

import com.zhang.pojo.News;
import com.zhang.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
   private NewsService newsService;
    //全查
    @RequestMapping("select")
    public String select(Model model){
        List<News> Arraylist=newsService.Arraylist();
        model.addAttribute("Array", Arraylist);
        return "list";
    }

    //跳转添加页面
    @RequestMapping("addlist")
    public String addlist(){
        return "add";
    }
    //添加
    @RequestMapping("add")
    public String add(News news){
        newsService.add(news);
        System.out.println("添加");
        return "forward:select";
    }
    //跳转修改页面
    @RequestMapping("/updateById")
    public String updateById(int id, Model model){
        News updateById=this.newsService.findById(id);
        model.addAttribute("update", updateById);
        System.out.println(newsService.findById(id));
        return "update";
    }
    //修改
    @RequestMapping("/update")
    public String update(News news){
        newsService.update(news);
        return "forward:select";
    }
    //删除
    @RequestMapping("delete")
    public String delete(int id){
        newsService.delete(id);
        return "forward:select";
    }
}
