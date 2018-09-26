package smm.springboot.base.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {
       log.info("MyFilter init............");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       log.info("MyFilter doFilter.........before");
        chain.doFilter(request, response);
        log.info("MyFilter doFilter.........after");
    }

    @Override
    public void destroy() {
       log.info("MyFilter destroy..........");
    }
}
