package com.example.demo.api;


import com.example.demo.dto.DemoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {


    @GetMapping("/demo")
    public List<DemoDto> getAll(){
        List<DemoDto>  list = new ArrayList<>();
        list.add(new DemoDto());
        // ....
        return list;
    }

}
