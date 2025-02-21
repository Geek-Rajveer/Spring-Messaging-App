package helloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Say Hello
    @GetMapping("/hello")
    public String uc1(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String uc2(@RequestParam (value = "name", required = false,defaultValue = "Guest")String  name){
        return "Hello " + name + " from BridgeLabz";
    }

}
