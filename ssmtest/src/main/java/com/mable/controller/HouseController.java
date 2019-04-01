package com.mable.controller;

import com.mable.domain.House;
import com.mable.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService hs;
    @RequestMapping("/findById")
    public String findById(Integer id, HttpServletRequest request){

        House house = hs.findById(id);
        System.out.println(hs.findById(id));
        request.setAttribute("idResult",house);
        return "id";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<House> houses = hs.findAll();
        for (House house:houses
             ) {
            System.out.println(house);
        }
        model.addAttribute("houseList",houses);
        return "success";
    }
    @RequestMapping("/saveHouse")
    public String saveHouse(House house){
        hs.saveHouse(house);
        return "save";
    }
    @RequestMapping("/updateHouse")
    public String update(House house){
        hs.updateHouse(house);
        return "update";
    }
}
