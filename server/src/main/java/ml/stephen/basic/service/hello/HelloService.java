package ml.stephen.basic.service.hello;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stephen on 2017/7/10.
 */
@Service
public class HelloService {

    public Object sqyHello() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World!");
        return result;
    }

}
