
package com.hcg.starreptile.test;

import static com.sun.activation.registries.LogSupport.log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloWorld {
    
    @RequestMapping("index")
    public String helloWorld(){
        log("\n========Hello World========\n");
        System.out.print("\n========Hello World========\n");
        return "test/index";
    }
}
