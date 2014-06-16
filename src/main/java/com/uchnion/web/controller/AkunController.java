package com.uchnion.web.controller;

import com.uchnion.web.model.Akun;
import com.uchnion.web.service.AkunService;
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
public class AkunController {
    
    @Autowired
    public AkunService akunservice;
    
    @RequestMapping(value = "/akuninput", method = RequestMethod.GET)
    public String AkunTambahPage(Model model) {
        model.addAttribute("tambahakun", new Akun());

        return "inputakun";
    }

    @RequestMapping(value = "/akuninput", method = RequestMethod.POST)
    public String AkunTambahinPage(Model model, @ModelAttribute Akun tbakun) {
        akunservice.insertAkun(tbakun);
        List<Akun> list = akunservice.getAllAkun();
        model.addAttribute("BanyakAkun", list);
        String pesan = "Akun berhasil disimpan";

        return "akun";
    }

    @RequestMapping(value = "/akuntampil", method = RequestMethod.GET)
    public String AkunTampilPage(Model model) {
        List<Akun> list = akunservice.getAllAkun();
        model.addAttribute("BanyakAkun", list);

        return "akun";
    }

    @RequestMapping(value = "/akunedit/{akunid}", method = RequestMethod.GET)
    public ModelAndView AkunEditPage(@PathVariable Integer akunid) {
        ModelAndView mav = new ModelAndView("editakun");

        Akun akun = akunservice.getAkun(akunid);
        mav.addObject("ubahakun", akun);

        return mav;
    }
    

    @RequestMapping(value = "/akunedit/{akunid}", method = RequestMethod.POST)
    public ModelAndView AkunEditingPage(@ModelAttribute Akun akun, @PathVariable Integer akunid) {
        ModelAndView mav = new ModelAndView("akun");
        akunservice.updateAkun(akun);

        String pesan = "Mata Pelajaran berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<Akun> list= akunservice.getAllAkun();
        mav.addObject("BanyakAkun",list);
        return mav;
    }

    @RequestMapping(value = "/akundelete/{akunid}", method = RequestMethod.GET)
    public String DeleteAkunPage(@PathVariable Integer akunid, Model model) {
        akunservice.deleteAkun(akunid);
        List<Akun> list = akunservice.getAllAkun();
        model.addAttribute("BanyakAkun", list);
        String pesan = "Mata Pelajaran berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "akun";
    }

    
}
