package com.example.aleloprojeto.cadcliente.entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class people {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String birthDate;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private  Adress adress;

    @Column(nullable = false)
    private String phoneNumb;

}


