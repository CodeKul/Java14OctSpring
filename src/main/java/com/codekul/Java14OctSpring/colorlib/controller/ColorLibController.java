package com.codekul.Java14OctSpring.colorlib.controller;

import com.codekul.Java14OctSpring.colorlib.domain.ColorLib;
import com.codekul.Java14OctSpring.colorlib.domain.MealPreference;
import com.codekul.Java14OctSpring.colorlib.repository.ColorLibRepo;
import com.codekul.Java14OctSpring.colorlib.repository.MealPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorLibController {

    @Autowired
    private ColorLibRepo colorLibRepo;

    @Autowired
    private MealPrefRepo mealPrefRepo;

    @PostMapping("saveMeal")
    public String saveMealPref(@RequestBody MealPreference mealPreference){
        mealPrefRepo.save(mealPreference);
        return "meal pref saved..";
    }

    @GetMapping("getMealList")
    public List<MealPreference> getMealPref(){
        return mealPrefRepo.findAll();
    }

    @PostMapping("saveColorLib")
    public String saveColorLib(@RequestBody ColorLib colorLib){
        colorLibRepo.save(colorLib);
        return "color lib saved..";
    }




}
