package com.uchnion.web.controller;

import com.uchnion.web.model.Kelas;
import com.uchnion.web.service.KelasService;
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
public class KelasController {
    
    @Autowired
    public KelasService kelasservice;
    
    @RequestMapping(value = "/kelasinput", method = RequestMethod.GET)
    public String KelasTambahPage(Model model) {
        model.addAttribute("tambahkelas", new Kelas());

        return "inputkelas";
    }

    @RequestMapping(value = "/kelasinput", method = RequestMethod.POST)
    public String KelasTambahinPage(Model model, @ModelAttribute Kelas tbkelas) {
        kelasservice.insertKelas(tbkelas);
        List<Kelas> list = kelasservice.getAllKelas();
        model.addAttribute("BanyakKelas", list);
        String pesan = "Kelas berhasil disimpan";

        return "kelas";
    }

    @RequestMapping(value = "/kelastampil", method = RequestMethod.GET)
    public String KelasTampilPage(Model model) {
        List<Kelas> list = kelasservice.getAllKelas();
        model.addAttribute("BanyakKelas", list);

        return "kelas";
    }

    @RequestMapping(value = "/kelasedit/{kelasid}", method = RequestMethod.GET)
    public ModelAndView KelasEditPage(@PathVariable Integer kelasid) {
        ModelAndView mav = new ModelAndView("editkelas");

        Kelas kelas = kelasservice.getKelas(kelasid);
        mav.addObject("ubahkelas", kelas);

        return mav;
    }
    

    @RequestMapping(value = "/kelasedit/{kelasid}", method = RequestMethod.POST)
    public ModelAndView KelasEditingPage(@ModelAttribute Kelas kelas, @PathVariable Integer kelasid) {
        ModelAndView mav = new ModelAndView("kelas");
        kelasservice.updateKelas(kelas);

        String pesan = "Mata Pelajaran berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<Kelas> list= kelasservice.getAllKelas();
        mav.addObject("BanyakKelas",list);
        return mav;
    }

    @RequestMapping(value = "/kelasdelete/{kelasid}", method = RequestMethod.GET)
    public String DeleteKelasPage(@PathVariable Integer kelasid, Model model) {
        kelasservice.deleteKelas(kelasid);
        List<Kelas> list = kelasservice.getAllKelas();
        model.addAttribute("BanyakKelas", list);
        String pesan = "Mata Pelajaran berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "kelas";
    }
    
}
