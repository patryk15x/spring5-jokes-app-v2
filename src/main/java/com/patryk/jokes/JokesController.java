package com.patryk.jokes;

import com.patryk.jokes.services.GenericJoke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final GenericJoke genericJoke;

    public JokesController(GenericJoke genericJoke) {
        this.genericJoke = genericJoke;
    }

    @RequestMapping("/")
    public String getJokes(Model model){

        model.addAttribute("joke", genericJoke.getRandomQuote());
        return "index";
    }
}
