package com.EncontrarAnimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroController {
    @RequestMapping("/cadastro")
    public String cadastro (){


        return  "cadastro";
    }
}