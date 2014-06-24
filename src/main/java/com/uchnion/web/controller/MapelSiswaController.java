/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            pilihan.put(siswa.getSiswaId(), siswa.getNis());
        }
        
        Map<Integer, String> pilihan2 = new HashMap<>();
        for (Mapel kelas : msservice.getAllMapel()) {
            pilihan2.put(kelas.getMapelId(), kelas.getNamamapel());
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
        return "home";
    }
    
}
