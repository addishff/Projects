package controller;

import model.JsonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.BlogService;

/**
 * Created by huangfeifeng on 8/15/16.
 */
@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping("index")
    @ResponseBody
    public JsonWrapper indexView() {
        return new JsonWrapper();
    }

    @RequestMapping("/")
    public ModelAndView homeView() {
        return new ModelAndView("blog/home", "blogs", blogService.getBlogs());
    }

    @RequestMapping("/admin")
    public ModelAndView adminView() {
        return new ModelAndView("blog/admin");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonWrapper addBlog(@RequestParam("blog") String blogStr) {
        System.out.println(blogStr);
        return new JsonWrapper();
    }

    @RequestMapping("/post/{id}")
    public ModelAndView postView(@PathVariable int id) {
        System.out.println(id);
        return new ModelAndView("blog/post");
    }

}
