package com.springmvc.handler;

import com.springmvc.pojo.BookType;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户的处理器bean(spring框架都称为bean)
 * 1、此bean等效于原来servlet
 * 2、等效于struts2 action
 * 3、spring框架的组件都把这三者统称为(控制器 @Controller【后端控制器】)
 */
public class UserManagerHandler implements Controller{
    /**
     * 处理器类去实现Controller所重写方法与servlet extends HttpServlet规范基本一样
     * 1、创建一个servlet的规范类(面试题:请问创建一个servlet类必须满足哪些规范?)
     *    public class UserManagerServlet extends HttpServlet
     *    {
     *        public void service(HttpServletRequest req,HttpServletResponse resp)
     *
     *        public void doGet(HttpServletRequest req,HttpServletResponse resp)
     *
     *        public void doPost(HttpServletRequest req,HttpServletResponse resp)
     *
     *        面试题:如果在一个servlet中同时存在service , doGet , doPost ，如果表单指定的提交方式为post
     *
     *        请问最终调用哪个方法?(service)
     *
     *    }
     *
     * @param req
     * @param resp
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("invoke handleRequest method ");
        //1、模拟原来的servlet(springmvc肯定会解决这种共性问题)
       /* String username = req.getParameter("username");
        String userpwd = req.getParameter("userpwd");
        System.out.println(username + "\t" + userpwd);*/

       //2、模拟在处理方法中通过一个List集合来保存图书类型对象，最终将处理完成的集合跳转至index.jsp(top.jsp)
        /*
            1)要在webapp目录下创建index.jsp所相关联的页面
            2)在处理器方法中创建集合，通过循环创建图书类型对象，再添加至集合中
            3)跳转至:index.jsp(top.jsp)
            4)在top.jsp页面中获取集合中的数据呈现在页面
         */
        List<BookType> bookTypeList = new ArrayList<BookType>();
        for(int i = 10 ; i <= 20 ; i++){
            BookType bookType = new BookType("计算机" + i);
            bookTypeList.add(bookType);
        }
        /*
        *  req.getSession().setAttribute("BOOK_TYPE_LIST",bookTypeList);
        *  resp.sendRedirect("/index.jsp"); 结果跳转至:tomcat 首页
        * */
        /*req.setAttribute("BOOK_TYPE_LIST",bookTypeList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.jsp");*/

        ModelAndView modelAndView = new ModelAndView();
        //问题1:默认将模型数据存储至哪个范围(request,session,application)
        // modelAndView.addObject("BOOK_TYPE_LIST",bookTypeList); 就是req.setAttribute("BOOK_TYPE_LIST",bookTypeList)
        // 默认为请求范围
        modelAndView.addObject("BOOK_TYPE_LIST",bookTypeList);
        //以下代码默认的跳转方式为?(以下默认的跳转方式为 转发方向)
        //req.getRequestDipather("/index.jsp").forward(req,resp);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}
