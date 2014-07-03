package com.uchnion.web.controller;

import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.service.KelasSiswaService;
import com.uchnion.web.service.MapelSiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Marojahan
 */
@Controller
public class SnmptnuBidikmisiController {
    
    @Autowired
    public MapelSiswaService msservice;
    
    @Autowired
    public KelasSiswaService ksservice;
    
    @RequestMapping(value = "/snmptnu", method = RequestMethod.GET)
    public String SnmptuUndanganPage(Model model) {
        List <MapelSiswa> list = msservice.getAllMapelSiswa();
        model.addAttribute("List_snmptnu",list);
        return "snmptn-undangan";
    }
    
    @RequestMapping(value = "/bidikmisi", method = RequestMethod.GET)
    public String BidikmisiPage() {
        return "bidikmisi";
    }
    
}
