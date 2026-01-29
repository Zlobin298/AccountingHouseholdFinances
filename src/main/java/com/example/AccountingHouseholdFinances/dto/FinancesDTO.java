package com.example.AccountingHouseholdFinances.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class FinancesDTO {
    @NotBlank(message = "Поле обязательные не должно быть пустым")
    @Size(min = 0, message = "Поле обязательные не должно быть меньше нуля")
    private String required;

    @NotBlank(message = "Поле желанные не должно быть пустым")
    @Size(min = 0, message = "Поле желанные не должно быть меньше нуля")
    private String desirable;

    @NotBlank(message = "Поле имиджевые не должно быть пустым")
    @Size(min = 0, message = "Поле имиджевые не должно быть меньше нуля")
    private String imageBased;
}
