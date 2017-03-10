package service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import mapper.BlogMapper;
import model.Blog;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BlogService;

import java.io.IOException;
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

    @Override
    public Blog getBlog(Integer id) {
        return blogMapper.selectOne(id);
    }

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.insert(blog);
    }

    @Override
    public String filter(String str) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost("http://10.1.113.89:8080/keyword/replace");
        String entityStr = "{\"texts\":[\"" + str + "\"],\"replaceChar\" : \"*\"}";
        HttpEntity httpEntity = new StringEntity(entityStr, "utf-8");
        postMethod.setEntity(httpEntity);

        HttpResponse response = httpClient.execute(postMethod);
        String resStr = EntityUtils.toString(response.getEntity());
        JSONObject jsonObject = JSONObject.parseObject(resStr);
        JSONArray result = jsonObject.getJSONArray("data");
        return result.size() == 0 ? null : result.get(0).toString();
    }

    public static void main(String... args) {
        try {
            System.out.println(new BlogServiceImpl().filter("国民党gmd"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
