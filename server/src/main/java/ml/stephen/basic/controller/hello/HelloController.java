package ml.stephen.basic.controller.hello;

import ml.stephen.basic.service.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Stephen on 2017/7/10.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object sayHello() {
        return this.helloService.sqyHello();
    }

}
