//package com.uchnion.web.controller;
//
//import com.uchnion.web.model.EksKul;
//import com.uchnion.web.model.EkskulSiswa;
//import com.uchnion.web.model.Siswa;
//import com.uchnion.web.service.EkskulSiswaService;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// *
// * @author Marojahan
// */
//@Controller
//public class EkskulSiswaController {
//    
//    @Autowired
//    public EkskulSiswaService ekssisservice;
//
//    @RequestMapping(value = "/ekssisinput", method = RequestMethod.GET)
//    public String EKSTambahPage(Model model) {
//        model.addAttribute("addstuclass", new EkskulSiswa());
//        List<Siswa> liststu = ekssisservice.getAllSiswa();
//        List<EksKul> liscla = ekssisservice.getAllEksKul();
//        
//        Map<Integer, String> pilihan = new HashMap<>();
//        for (Siswa siswa : ekssisservice.getAllSiswa()) {
//            pilihan.put(siswa.getId(), siswa.getNis());
//        }
//        
//        Map<Integer, String> pilihan2 = new HashMap<>();
//        for (EksKul ekskul : ekssisservice.getAllEksKul()) {
//            pilihan2.put(ekskul.getEkskulid(), ekskul.getNama_ekskul());
//        }
//        
//        model.addAttribute("liststu", pilihan);
//        model.addAttribute("liscla", pilihan2);
//
//        return "";
//    }
//    @RequestMapping(value = "/stuclassinput", method = RequestMethod.POST)
//    public String EKSTambahinPage(Model model, @ModelAttribute EkskulSiswa ekssis) {
//         ekssisservice.insertEkskulSiswa(ekssis);
//        List<EkskulSiswa> list = ekssisservice.getAllEkskulSiswa();
//        
//       
//        model.addAttribute("ListStuClass", list);
//        String pesan = "Student Class Save Success";
//
//        return "";
//    }
//    
//    @RequestMapping(value = "/stuclasstampil", method = RequestMethod.GET)
//    public String EKSTampilPage(Model model) {
//        List<EkskulSiswa> list = ekssisservice.getAllEkskulSiswa();
//        model.addAttribute("ListStuClass", list);
//        return "";
//    }
//    
//}
