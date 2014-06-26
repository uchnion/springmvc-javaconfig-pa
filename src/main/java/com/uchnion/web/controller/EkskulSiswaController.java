package com.uchnion.web.controller;

import com.uchnion.web.model.Ekskul;
import com.uchnion.web.model.EkskulSiswa;
import com.uchnion.web.model.Siswa;
import com.uchnion.web.service.EkskulSiswaService;
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
public class EkskulSiswaController {
    
    @Autowired
    public EkskulSiswaService ekssisservice;

    @RequestMapping(value = "/ekssis/input", method = RequestMethod.GET)
    public String EKSTambahPage(Model model) {
        model.addAttribute("addekssis", new EkskulSiswa());
        List<Siswa> listsiswa = ekssisservice.getAllSiswa();
        List<Ekskul> lisekskul = ekssisservice.getAllEksKul();
        
        Map<Integer, String> pilihan = new HashMap<>();
        for (Siswa siswa : ekssisservice.getAllSiswa()) {
            pilihan.put(siswa.getSiswaId(), siswa.getNama());
        }
        
        Map<Integer, String> pilihan2 = new HashMap<>();
        for (Ekskul ekskul : ekssisservice.getAllEksKul()) {
            pilihan2.put(ekskul.getEkskulId(), ekskul.getNamaEkskul());
        }
        
        model.addAttribute("listsiswa", pilihan);
        model.addAttribute("listekskul", pilihan2);
        model.addAttribute("lisSiswaTampil", listsiswa);

        return "ekskulsiswa-input";
    }
    @RequestMapping(value = "/ekssis/input", method = RequestMethod.POST)
    public String EKSTambahinPage(Model model, @ModelAttribute EkskulSiswa ekssis) {
         ekssisservice.insertEkskulSiswa(ekssis);
        List<EkskulSiswa> list = ekssisservice.getAllEkskulSiswa();
        
       
        model.addAttribute("ListEkskulSiswa", list);
        String pesan = "Ekstra Kulikuler siswa berhasil disimpan";

        return "home";
    }
    
    @RequestMapping(value = "/stuclasstampil", method = RequestMethod.GET)
    public String EKSTampilPage(Model model) {
        List<EkskulSiswa> list = ekssisservice.getAllEkskulSiswa();
        model.addAttribute("ListStuClass", list);
        return "home";
    }
    
}
