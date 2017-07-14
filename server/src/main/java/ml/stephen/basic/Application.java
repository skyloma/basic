package ml.stephen.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Stephen on 2017/7/10.
 */
@SpringBootApplication
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public ServletRegistrationBean apiServletBean(WebApplicationContext webApplicationContext) {
        DispatcherServlet servlet = new DispatcherServlet(webApplicationContext);
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet, "/api/*");
        bean.setName("ApiServlet");
        return bean;
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

                // 首页默认加载web端
                viewControllerRegistry.addViewController("/").setViewName("/web/index.html");
                viewControllerRegistry.addViewController("/index.html").setViewName("redirect:/");

                // web首页
                viewControllerRegistry.addViewController("/web").setViewName("/web/index.html");

                // webapp首页
                viewControllerRegistry.addViewController("/webapp").setViewName("/webapp/index.html");

                viewControllerRegistry.setOrder(Ordered.HIGHEST_PRECEDENCE);
                super.addViewControllers(viewControllerRegistry);
            }
        };
    }

}
