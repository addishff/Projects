package mapper;

import model.Blog;

import java.util.List;

/**
 * Created by huangfeifeng on 8/19/16.
 */
public interface BlogMapper {
    List<Blog> selectAll();
}
