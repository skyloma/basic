package ml.stephen.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

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

}
