package service.impl;

import mapper.BlogMapper;
import model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BlogService;

import java.util.List;

/**
 * Created by huangfeifeng on 8/19/16.
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Override
    public List<Blog> getBlogs() {
        return blogMapper.selectAll();
    }
}
