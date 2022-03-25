package chat;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@Log4j2
public class ChatController {

    @GetMapping(value = "/chat")
    public String home(Locale locale, Model model) {
            System.out.println("log?");
        return "chat";
    }

}
