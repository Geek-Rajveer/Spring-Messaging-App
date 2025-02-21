package helloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Say Hello
    @GetMapping("/hello")
    public String uc1(){
        return "Hello from BridgeLabz";
    }

}
