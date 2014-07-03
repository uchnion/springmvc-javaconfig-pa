package com.uchnion.web.controller;

import com.uchnion.web.model.Mapel;
import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.model.Siswa;
import com.uchnion.web.service.MapelSiswaService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class MapelSiswaController {

    @Autowired
    public MapelSiswaService msservice;

    @RequestMapping(value = "/mplsis/input", method = RequestMethod.GET)
    public String MapelSiswaTambahPage(Model model) {
        model.addAttribute("addmplsis", new MapelSiswa());
        List<Siswa> listms = msservice.getAllSiswa();

        Map<Integer, String> pilihan = new HashMap<>();
        for (Siswa siswa : msservice.getAllSiswa()) {
            pilihan.put(siswa.getSiswaId(), siswa.getNama());
        }

        Map<Integer, String> pilihan2 = new HashMap<>();
        for (Mapel kelas : msservice.getAllMapel()) {
            pilihan2.put(kelas.getMapelId(), kelas.getKodemapel());
        }

        model.addAttribute("listsiswa", pilihan);
        model.addAttribute("listmapel", pilihan2);
        model.addAttribute("BanyakMS", listms);

        return "mapelsiswa-input";
    }

    @RequestMapping(value = "/mplsis/input", method = RequestMethod.POST)
    public String MapelSiswaTambahinPage(Model model, @ModelAttribute MapelSiswa tambahks) {
        msservice.insertMapelSiswa(tambahks);
        List<MapelSiswa> list = msservice.getAllMapelSiswa();
        model.addAttribute("BanyakMapelSiswa", list);
        String pesan = "Mapel Siswa berhasil disimpan";
        return "mapelsiswa";
    }

    @RequestMapping(value = "/mapelsiswa", method = RequestMethod.GET)
    public String SiswaTampilPage(Model model) {
        List<MapelSiswa> list = msservice.getAllMapelSiswa();
        model.addAttribute("MapelSiswa", list);

        return "mapelsiswa";

    }

    @RequestMapping(value = "/nilaisiswa/{mapelId}/{siswaId}", method = RequestMethod.GET)
    public ModelAndView NilaisiswaPage(@PathVariable Integer mapelId, @PathVariable Integer siswaId) {
        ModelAndView mav = new ModelAndView("inputnilai");
        MapelSiswa ms = msservice.getMapelSiswa(mapelId, siswaId);
        mav.addObject("inputnilai", ms);
        return mav;
    }

    @RequestMapping(value = "/nilaisiswa", method = RequestMethod.POST)
    public ModelAndView SiswaEditingPage(@ModelAttribute MapelSiswa ms) {
        ModelAndView mav = new ModelAndView("mapelsiswa");
        msservice.updateMapelSiswa(ms);
        String pesan = "Siswa berhasil diperbaharui";
        mav.addObject("pesan", pesan);
        List<MapelSiswa> list = msservice.getAllMapelSiswa();
        mav.addObject("MapelSiswa", list);
        return mav;
    }

}
