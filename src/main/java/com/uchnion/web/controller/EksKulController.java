package com.uchnion.web.controller;

import com.uchnion.web.model.EksKul;
import com.uchnion.web.service.EksKulService;
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
public class EksKulController {
    
    @Autowired
    public EksKulService ekskulservice;
    
    @RequestMapping(value = "/ekskulinput", method = RequestMethod.GET)
    public String EksKulTambahPage(Model model) {
        model.addAttribute("tambahekskul", new EksKul());

        return "inputekskul";
    }

    @RequestMapping(value = "/ekskulinput", method = RequestMethod.POST)
    public String EksKulTambahinPage(Model model, @ModelAttribute EksKul tbekskul) {
        ekskulservice.insertEksKul(tbekskul);
        List<EksKul> list = ekskulservice.getAllEksKul();
        model.addAttribute("BanyakEksKul", list);
        String pesan = "Ekstra Kulikuler berhasil disimpan";

        return "ekskul";
    }

    @RequestMapping(value = "/ekskultampil", method = RequestMethod.GET)
    public String EksKulTampilPage(Model model) {
        List<EksKul> list = ekskulservice.getAllEksKul();
        model.addAttribute("BanyakEksKul", list);

        return "ekskul";
    }

    @RequestMapping(value = "/ekskuledit/{id_ekskul}", method = RequestMethod.GET)
    public ModelAndView EksKulEditPage(@PathVariable String id_ekskul) {
        ModelAndView mav = new ModelAndView("editekskul");

        EksKul ekskul = ekskulservice.getEksKul(id_ekskul);
        mav.addObject("ubahekskul", ekskul);

        return mav;
    }
    

    @RequestMapping(value = "/ekskuledit/{id_ekskul}", method = RequestMethod.POST)
    public ModelAndView EksKulEditingPage(@ModelAttribute EksKul ekskul, @PathVariable String id_ekskul) {
        ModelAndView mav = new ModelAndView("ekskul");
        ekskulservice.updateEksKul(ekskul);

        String pesan = "Mata Pelajaran berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<EksKul> list= ekskulservice.getAllEksKul();
        mav.addObject("BanyakEksKul",list);
        return mav;
    }

    @RequestMapping(value = "/ekskuldelete/{id_ekskul}", method = RequestMethod.GET)
    public String DeleteEksKulPage(@PathVariable String id_ekskul, Model model) {
        ekskulservice.deleteEksKul(id_ekskul);
        List<EksKul> list = ekskulservice.getAllEksKul();
        model.addAttribute("BanyakEksKul", list);
        String pesan = "Ekstra Kulikuler berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "ekskul";
    }
    
}
