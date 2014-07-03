package com.uchnion.web.controller;

import com.uchnion.web.model.Akun;
import com.uchnion.web.service.AkunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LinkController {

    @Autowired
    private AkunService akunService;
    
    @RequestMapping(value = "/masuk", method = RequestMethod.GET)
    public String LoginPage(Model model) {
        model.addAttribute("akun", new Akun());
        return "login";
    }

    @RequestMapping(value = "/masuk", method = RequestMethod.POST)
    public String LoginPage(Model model, @ModelAttribute Akun login) {
        if (akunService.isLogin(login)) {
            return "home";
        }
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String HomePage() {

        return "home";
    }

}
