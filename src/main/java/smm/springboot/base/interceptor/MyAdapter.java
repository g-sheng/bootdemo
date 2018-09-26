package smm.springboot.base.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 继承WebMvcConfigureAdapter继承并重写addInterceptor方法用于添加配置拦截器
 *
 * @author chengxi
 */
@Component
public class MyAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加拦截器
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
