package com.xdf.filter;

import com.xdf.dao.Action;
import com.xdf.dao.impl.AddAction;
import com.xdf.dao.impl.DelAction;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebFilter("/*")
public class MyDefaultFilter implements Filter {
  // 保存 所谓的  路径 以及对应的执行类
    Map<String,String> map=new HashMap<String, String>();

    public void init(FilterConfig filterConfig) throws ServletException {
        // 存放值  key  就是用户请求的路径   value  即将执行的类
        map.put("/addAction","com.xdf.dao.impl.AddAction");
        map.put("/delAction","com.xdf.dao.impl.DelAction");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      //获取用户的请求 路径
    HttpServletRequest httpServletRequest= (HttpServletRequest) request;
    HttpServletResponse httpServletResponse= (HttpServletResponse) response;

        System.out.println("getContextPath==>"+httpServletRequest.getContextPath());  //项目名
        System.out.println("getServletPath==>"+httpServletRequest.getServletPath()); //用户访问的路径
        System.out.println("getRequestURI==>"+httpServletRequest.getRequestURI()); //项目名+访问的路径
        System.out.println("getRequestURL==>"+httpServletRequest.getRequestURL());//完整路径

        String path=httpServletRequest.getServletPath(); //获取用户访问的路径

        if (path.equals("/login.jsp")){
            chain.doFilter(request,response);
        }else{
            try {
                Action action= (Action) Class.forName(map.get(path)).newInstance();
                action.execute();
                //跳转到 success.jsp
                httpServletRequest.getRequestDispatcher("/success.jsp").forward(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /*  if (path.equals("/addAction")){
                  Action action=new AddAction();
                  action.execute();
              }else if (path.equals("/delAction")){
                  Action action=new DelAction();
                  action.execute();
              }
           //跳转到 success.jsp
            httpServletRequest.getRequestDispatcher("/success.jsp").forward(request,response);*/
        }




    }

    public void destroy() {

    }
}
