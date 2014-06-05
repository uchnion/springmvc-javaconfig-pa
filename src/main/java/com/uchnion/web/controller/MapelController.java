package com.uchnion.web.controller;

import com.uchnion.web.model.Mapel;
import com.uchnion.web.service.MapelService;
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
public class MapelController {

    @Autowired
    public MapelService mapelservice;

    @RequestMapping(value = "/mapelinput", method = RequestMethod.GET)
    public String MapelTambahPage(Model model) {
        model.addAttribute("tambahmapel", new Mapel());

        return "inputmapel";
    }

    @RequestMapping(value = "/mapelinput", method = RequestMethod.POST)
    public String MapelTambahinPage(Model model, @ModelAttribute Mapel tbmapel) {
        mapelservice.insertMapel(tbmapel);
        List<Mapel> list = mapelservice.getAllMapel();
        model.addAttribute("BanyakMapel", list);
        String pesan = "Mapel berhasil disimpan";

        return "mapel";
    }

    @RequestMapping(value = "/mapeltampil", method = RequestMethod.GET)
    public String MapelTampilPage(Model model) {
        List<Mapel> list = mapelservice.getAllMapel();
        model.addAttribute("BanyakMapel", list);

        return "mapel";
    }

    @RequestMapping(value = "/mapeledit/{kodemapel}", method = RequestMethod.GET)
    public ModelAndView MapelEditPage(@PathVariable String kodemapel) {
        ModelAndView mav = new ModelAndView("editmapel");

        Mapel mapel = mapelservice.getMapel(kodemapel);
        mav.addObject("ubahmapel", mapel);

        return mav;
    }
    

    @RequestMapping(value = "/mapeledit/{kodemapel}", method = RequestMethod.POST)
    public ModelAndView MapelEditingPage(@ModelAttribute Mapel mapel, @PathVariable String kodemapel) {
        ModelAndView mav = new ModelAndView("mapel");
        mapelservice.updateMapel(mapel);

        String pesan = "Mata Pelajaran berhasil diperbaharui";
        mav.addObject("pesan", pesan);

        List<Mapel> list= mapelservice.getAllMapel();
        mav.addObject("BanyakMapel",list);
        return mav;
    }

    @RequestMapping(value = "/mapeldelete/{kodemapel}", method = RequestMethod.GET)
    public String DeleteMapelPage(@PathVariable String kodemapel, Model model) {
        mapelservice.deleteMapel(kodemapel);
        List<Mapel> list = mapelservice.getAllMapel();
        model.addAttribute("BanyakMapel", list);
        String pesan = "Mata Pelajaran berhasil di hapus";
        model.addAttribute("pesan", pesan);

        return "mapel";
    }

}
