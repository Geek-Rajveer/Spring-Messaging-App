package helloApp;

import helloApp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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

    @GetMapping("/hello/query/{name}")
    public String uc3(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName() + " from BridgeLabz";
    }
}
