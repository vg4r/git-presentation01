package com.example.demo.api;


import com.example.demo.dto.DemoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/demo")
    public DemoDto getAll(){
        // ....
        return new DemoDto();
    }

}
