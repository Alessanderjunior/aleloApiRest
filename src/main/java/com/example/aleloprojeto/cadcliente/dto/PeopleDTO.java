package com.example.aleloprojeto.cadcliente.dto;

import com.example.aleloprojeto.cadcliente.entity.Adress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeopleDTO {


    private int id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    @Size(max = 30)
    private String birthDate;

    @NotBlank
    @Size(max = 30)
    private String cpf;


    @NotBlank
    @Valid
    private Adress adress;

    @NotBlank
    @Size(max = 50)
    private String phoneNumb;

}
