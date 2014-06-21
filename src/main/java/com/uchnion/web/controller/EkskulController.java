package com.uchnion.web.controller;

import com.uchnion.web.model.Ekskul;
import com.uchnion.web.service.EkskulService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Marojahan
 */
@Controller
public class EkskulController {
    
    @Autowired
    public EkskulService ekskulservice;
    
    @RequestMapping(value = "/ekskulinput", method = RequestMethod.GET)
    public String EkskulTambahPage(Model model) {
        model.addAttribute("tambahekskul", new Ekskul());

        return "inputekskul";
    }

    @RequestMapping(value = "/ekskulinput", method = RequestMethod.POST)
    public String EkskulTambahinPage(Model model, @ModelAttribute Ekskul tbekskul) {
        ekskulservice.insertEkskul(tbekskul);
        List<Ekskul> list = ekskulservice.getAllEkskul();
        model.addAttribute("BanyakEkskul", list);
        String pesan = "Ekstra Kulikuler berhasil disimpan";

        return "ekskul";
    }

    @RequestMapping(value = "/ekskultampil", method = RequestMethod.GET)
    public String EkskulTampilPage(Model model) {
        List<Ekskul> list = ekskulservice.getAllEkskul();
        model.addAttribute("BanyakEkskul", list);

        return "ekskul";
    }

    @RequestMapping(value = "/ekskuledit/{ekskulId}", method = RequestMethod.GET)
    public ModelAndView EkskulEditPage(@PathVariable Integer ekskulId) {
        ModelAndView mav = new ModelAndView("editekskul");

        Ekskul ekskul = ekskulservice.getEkskul(ekskulId);
        mav.addObject("ubahekskul", ekskul);

        return mav;
    }
    

    @RequestMapping(value = "/ekskuledit/{ekskulId}", method = RequestMethod.POST)
    public ModelAndView EkskulEditingPage(@ModelAttribute Ekskul ekskul, @PathVariable Integer ekskulId) {
        ModelAndView mav = new ModelAndView("ekskul");
        ekskulservice.updateEkskul(ekskul);

        String pesan = "Mata Pelajaran berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<Ekskul> list= ekskulservice.getAllEkskul();
        mav.addObject("BanyakEkskul",list);
        return mav;
    }

    @RequestMapping(value = "/ekskuldelete/{ekskulId}", method = RequestMethod.GET)
    public String DeleteEkskulPage(@PathVariable Integer ekskulId, Model model) {
        ekskulservice.deleteEkskul(ekskulId);
        List<Ekskul> list = ekskulservice.getAllEkskul();
        model.addAttribute("BanyakEkskul", list);
        String pesan = "Ekstra Kulikuler berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "ekskul";
    }
    
}
