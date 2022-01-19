package com.codekul.Java14OctSpring.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LombokController {

    @Autowired
    private LombokRepo lombokRepo;

    @PostMapping("saveLombok")
    public String saveLombok(@RequestBody LombokDemo lombokDemo){
        lombokRepo.save(lombokDemo);

        return "saved..";
    }
}
