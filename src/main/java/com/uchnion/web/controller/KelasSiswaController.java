package com.uchnion.web.controller;

import com.uchnion.web.model.Kelas;
import com.uchnion.web.model.KelasSiswa;
import com.uchnion.web.model.Siswa;
import com.uchnion.web.service.KelasSiswaService;
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
public class KelasSiswaController {
    
    @Autowired
    public KelasSiswaService ksservices;
    
    @RequestMapping(value = "/klssis/input", method = RequestMethod.GET)
    public String KelasSiswaTambahPage(Model model) {
        model.addAttribute("addklssis", new KelasSiswa());
        List<Siswa> listsiswa = ksservices.getAllSiswa();
        
        Map<Integer, String> pilihan = new HashMap<>();
        for (Siswa siswa : ksservices.getAllSiswa()) {
            pilihan.put(siswa.getSiswaId(), siswa.getNis());
        }
        
        Map<Integer, String> pilihan2 = new HashMap<>();
        for (Kelas kelas : ksservices.getAllKelas()) {
            pilihan2.put(kelas.getKelasId(), kelas.getNamaKelas());
        }
        
        model.addAttribute("listsiswa", pilihan);
        model.addAttribute("listkelas", pilihan2);
        model.addAttribute("BanyakSiswa", listsiswa);
        
        return "kelassiswa-input";
    }
    
    @RequestMapping(value = "/klssis/input", method = RequestMethod.POST)
    public String KelasSiswaTambahinPage(Model model, @ModelAttribute KelasSiswa tambahks) {
        ksservices.insertKelasSiswa(tambahks);
        List<KelasSiswa> list = ksservices.getAllKelasSiswa();
        model.addAttribute("BanyakKelasSiswa", list);
        String pesan = "Kelas Siswa berhasil disimpan";
        return "home";
    }
    
}
