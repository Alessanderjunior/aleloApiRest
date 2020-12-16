package com.example.aleloprojeto.companystorage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AdressDTO {


    @NotBlank
    @Size(max = 200)
    private String street;

    @NotBlank
    @Size(max = 10)
    private Integer houseNum;

    @NotBlank
    @Size(max = 30)
    private String nbhd;

    @NotBlank
    @Size(max = 30)
    private String city;

    @NotBlank
    @Size(max = 30)
    private String state;



    @Size(max = 30)
    private String Complement;


}
