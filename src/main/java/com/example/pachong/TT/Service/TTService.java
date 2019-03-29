package com.example.pachong.TT.Service;

import com.example.pachong.TT.Pojo.Blogs;
import com.example.pachong.mapper.BlogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTService {
    @Autowired
    BlogsMapper blogsMapper;

    public List<Blogs> getAllBlogs(){
        return blogsMapper.selectAll();
    }
}
