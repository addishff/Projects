package mapper;

import model.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by huangfeifeng on 8/19/16.
 */
public interface BlogMapper {
    List<Blog> selectAll();

    Blog selectOne(@Param("id") Integer id);

    int insert(Blog blog);
}
