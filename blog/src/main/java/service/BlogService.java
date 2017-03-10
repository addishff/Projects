package service;

import model.Blog;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by huangfeifeng on 8/19/16.
 */
public interface BlogService {
    List<Blog> getBlogs();

    Blog getBlog(Integer id);

    int addBlog(Blog blog);

    String filter(String str) throws IOException;
}
