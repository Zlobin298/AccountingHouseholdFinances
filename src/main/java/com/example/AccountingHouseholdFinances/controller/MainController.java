package com.example.AccountingHouseholdFinances.controller;

import com.example.AccountingHouseholdFinances.dto.FinancesDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/home")
    protected String home() {
        return "index";
    }

    @PostMapping("/chart")
    protected String chart(@Valid FinancesDTO dto) {

        return "redirect:/home";
    }
}
