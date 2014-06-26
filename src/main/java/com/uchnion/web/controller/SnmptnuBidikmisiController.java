package com.uchnion.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Marojahan
 */
@Controller
public class SnmptnuBidikmisiController {
    
    @RequestMapping(value = "/snmptnu", method = RequestMethod.GET)
    public String SnmptuUndanganPage() {

        return "snmptn-undangan";
    }
    
    @RequestMapping(value = "/bidikmisi", method = RequestMethod.GET)
    public String BidikmisiPage() {

        return "bidikmisi";
    }
    
}
