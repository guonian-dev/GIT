package com.springmvc.handler;

import com.springmvc.pojo.BookType;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 开发处理器bean的第二种方式(xml)
 */
public class UserInfoManagerHandler implements HttpRequestHandler {
    /**
     * servlet: public void doPost(HttpServlerRequest , HttpServletResponse)
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println(" invoke handleRequest method ");
        //1)模拟通过servlet的请求对象获取表单提交参数
        String userName = httpServletRequest.getParameter("username");
        String userPwd = httpServletRequest.getParameter("userpwd");
        System.out.println(userName + "\t" + userPwd);

        //2)模拟图书类型的集合
        List<BookType> bookTypeList = new ArrayList<BookType>();
        for(int i = 100 ; i <= 110 ; i++){
            BookType bookType = new BookType("计算机" + i);
            bookTypeList.add(bookType);
        }

        //3)将集合类型存储至指定的作用范围(servlet:四大作用域[page , request , session , application])
        httpServletRequest.getSession().setAttribute("BOOK_TYPE_LIST", bookTypeList);

        //4)资源跳转
        //4_1)session范围(转发 、 重定向皆可)
        //4_2)request范围(转发)
        httpServletResponse.sendRedirect("/index.jsp");
        //struts2: (struts.xml result type="redirect")
    }
}
