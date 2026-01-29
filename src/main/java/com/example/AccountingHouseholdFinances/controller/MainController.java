package com.example.AccountingHouseholdFinances.controller;

import com.example.AccountingHouseholdFinances.dto.FinancesDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {

    private FinancesDTO lastSavedFinances = new FinancesDTO();

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @PostMapping("/chart")
    public String chart(@Valid FinancesDTO dto) {
        this.lastSavedFinances = dto;
        return "redirect:/home";
    }

    @GetMapping("/chart")
    @ResponseBody
    public FinancesDTO getChartData() {
        return lastSavedFinances;
    }
}
