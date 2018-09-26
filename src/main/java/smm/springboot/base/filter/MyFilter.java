package smm.springboot.base.filter;

import com.alibaba.fastjson.JSON;
import smm.springboot.dto.request.SelectUserDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("MyFilter init............");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter doFilter.........before");
        String id=request.getParameter("id");
        SelectUserDTO selectUserDTO= JSON.parseObject(JSON.toJSONString(request.getParameterMap()),SelectUserDTO.class);
        chain.doFilter(request, response);
        System.out.println("MyFilter doFilter.........after");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy..........");
    }
}
