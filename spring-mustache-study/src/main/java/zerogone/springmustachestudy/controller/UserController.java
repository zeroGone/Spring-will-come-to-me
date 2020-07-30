package zerogone.springmustachestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import zerogone.springmustachestudy.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/")
    public String displayUserList(Model model){
        List<User> user = new ArrayList<>();
        user.add(new User("zeroGone", "김영곤"));
        user.add(new User("rlgur0405", "정기혁"));
        model.addAttribute("user", user);
        model.addAttribute("sex", null);
        return "index";
    }
}
