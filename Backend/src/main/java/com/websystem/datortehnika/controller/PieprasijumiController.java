package com.websystem.datortehnika.controller;

import com.websystem.datortehnika.model.Pieprasijumi;
import com.websystem.datortehnika.service.PieprasijumiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pieprasijumi")
@CrossOrigin
public class PieprasijumiController {
    @Autowired
    private PieprasijumiService pieprasijumiService;

    @PostMapping("/add")
    public String add(@RequestBody Pieprasijumi pieprasijumi) {
        pieprasijumiService.savePieprasijumi(pieprasijumi);
        return "Pieprasījums pievienots";
    }

    @GetMapping("/getAll")
    public List<Pieprasijumi> getAllPieprasijumi() {
        return pieprasijumiService.getAllPieprasijumi();
    }

}
