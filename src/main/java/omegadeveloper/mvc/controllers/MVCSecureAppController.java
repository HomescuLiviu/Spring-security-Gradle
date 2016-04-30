package omegadeveloper.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liviu on 2/23/2016.
 */

@Controller
@Component
public class MVCSecureAppController {

    @Autowired
    ConfigurableApplicationContext context;

    @RequestMapping("/piechart")
    public String sendJMSTest(Model model){

        //returns the view name
        return "piechart";
    }

    @RequestMapping("/getText")
    public String jmsText(Model model){

        model.addAttribute("message", context.getBean("messages"));
        //returns the view name

        return "textReceived";
    }
}
