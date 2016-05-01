package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    //private static final String template = "Hello, %s!";
   // private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting",method=RequestMethod.POST,consumes="text/plain")
    public void greeting(@RequestBody String payload) throws Exception {
      System.out.println("Received payload is: "+payload);  
    }
}
