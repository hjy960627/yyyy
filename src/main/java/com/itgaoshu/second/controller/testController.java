package com.itgaoshu.second.controller;

import com.itgaoshu.second.bean.T1;
import com.itgaoshu.second.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private testService testservice;

    @RequestMapping("tt.do")
    public String selectAll(Model model){
        List<T1> ts = testservice.selectAll();
        model.addAttribute("ts",ts);
        return "index2";
    }
    @RequestMapping("t2.do")
    public String selct(Model model){
        T1 t1=testservice.select(3);
        model.addAttribute("t1",t1);
        return "index2";
    }

}
