package com.guga.lab.jwtsec;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {

    @GetMapping("ping")
    public ResponseEntity<String> hello(){
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        System.out.println(SimpleContext.EMAIL.get());
        return ResponseEntity.ok("All fine");
    }
}
