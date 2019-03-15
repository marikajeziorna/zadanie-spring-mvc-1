package pl.mj.zadaniespringmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TablePageController {


    @GetMapping("/tablepage")
    public String tablepage(){
        return "tablepage";
    }



}
