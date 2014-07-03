package com.uchnion.web.controller;

import com.uchnion.web.model.Siswa;
import com.uchnion.web.service.SiswaService;
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
public class SiswaController {

    @Autowired
    public SiswaService siswaservice;

    @RequestMapping(value = "/siswainput", method = RequestMethod.GET)
    public String SiswaTambahPage(Model model) {
        model.addAttribute("tambahsiswa", new Siswa());

        return "inputsiswa";
    }

    @RequestMapping(value = "/siswainput", method = RequestMethod.POST)
    public String SiswaTambahinPage(Model model, @ModelAttribute Siswa tambahsiswa) {
        siswaservice.insertSiswa(tambahsiswa);
        List<Siswa> list = siswaservice.getAllSiswa();
        model.addAttribute("BanyakSiswa", list);
        String pesan = "Siswa berhasil disimpan";

        return "siswa";
    }

    @RequestMapping(value = "/siswatampil", method = RequestMethod.GET)
    public String SiswaTampilPage(Model model) {
        List<Siswa> list = siswaservice.getAllSiswa();
        model.addAttribute("BanyakSiswa", list);

        return "siswa";
    }
    
//    @RequestMapping(value = "/siswatampil/pribadi/{siswaId}", method = RequestMethod.GET)
//    public String SiswaPribadiPage(Model model) { 
//        List <Siswa> siswa = siswaservice.getAllSiswa();
//        model.addAttribute("TampilPribadi", siswa);
//        return "siswapribadi";
//    }
    
    @RequestMapping(value = "/siswatampil/pribadi/{siswaId}", method = RequestMethod.GET)
    public String SiswaPribadiPage(Model model, @PathVariable Integer siswaId) { 
        Siswa siswa = siswaservice.getSiswa(siswaId);
        model.addAttribute("pribadi", siswa);
        return "siswapribadi";
    }
//    @RequestMapping(value = "/siswatampil/pribadi/{siswaId}", method = RequestMethod.GET)
//    public ModelAndView SiswaPribadiPage(@PathVariable Integer siswaId) {
//        ModelAndView mav = new ModelAndView("siswapribadi");
//
//        Siswa siswa = siswaservice.getSiswa(siswaId);
//        mav.addObject("TampilPribadi", siswa);
//
//        return mav;
//    }

    @RequestMapping(value = "/siswaedit/{siswaId}", method = RequestMethod.GET)
    public ModelAndView SiswaEditPage(@PathVariable Integer siswaId) {
        ModelAndView mav = new ModelAndView("editsiswa");

        Siswa siswa = siswaservice.getSiswa(siswaId);
        mav.addObject("ubahsiswa", siswa);

        return mav;
    }

    @RequestMapping(value = "/siswaedit/{siswaId}", method = RequestMethod.POST)
    public ModelAndView SiswaEditingPage(@ModelAttribute Siswa siswa, @PathVariable Integer siswaId) {
        ModelAndView mav = new ModelAndView("siswa");
        siswaservice.updateSiswa(siswa);

        String pesan = "Siswa berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<Siswa> list = siswaservice.getAllSiswa();
        mav.addObject("BanyakSiswa", list);
        return mav;
    }

    @RequestMapping(value = "/siswadelete/{siswaId}", method = RequestMethod.GET)
    public String DeleteSiswaPage(@PathVariable Integer siswaId, Model model) {
        siswaservice.deleteSiswa(siswaId);
        List<Siswa> list = siswaservice.getAllSiswa();
        model.addAttribute("BanyakSiswa", list);
        String pesan = "Siswa berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "siswa";
    }

}
