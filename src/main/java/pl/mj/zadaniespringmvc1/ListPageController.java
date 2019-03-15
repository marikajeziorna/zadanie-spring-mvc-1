package pl.mj.zadaniespringmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListPageController {


    @GetMapping("/listpage")
    public String listpage(){
        return "newProduct";
    }
}
