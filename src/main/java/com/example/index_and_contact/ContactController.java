package com.example.index_and_contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ContactController {
    @RequestMapping("/contact")
    public String indexPage() {
        return "This is the contact page";
    }
}
