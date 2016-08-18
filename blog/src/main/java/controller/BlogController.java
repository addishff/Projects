package controller;

import model.JsonWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by huangfeifeng on 8/15/16.
 */
@Controller
public class BlogController {
    @RequestMapping("index")
    @ResponseBody
    public JsonWrapper indexView() {
        return new JsonWrapper();
    }

    @RequestMapping("/")
    public ModelAndView homeView() {
        return new ModelAndView("blog/home", "nums", new Integer[]{1, 2, 3, 4, 5});
    }

    @RequestMapping("/admin")
    public ModelAndView adminView() {
        return new ModelAndView("blog/admin");
    }
}
