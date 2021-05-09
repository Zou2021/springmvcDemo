package com.zou.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author: 邹祥发
 * @date: 2021/5/9 17:46
 */
@Controller
public class FirstSpringMvcDemo {
    /**
     * 1. 使用 @RequestMapping 注解来映射请求的 URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
     * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
     * <p>
     * /WEB-INF/views/success.jsp
     */
    @RequestMapping("hello")
    public ModelAndView ModelAndViewTest() {
        String viewName = "success";
        ModelAndView modelAndView = new ModelAndView(viewName);

        //添加模型数据到ModelAndView中
        modelAndView.addObject("time", new Date());

        return modelAndView;
    }
}
