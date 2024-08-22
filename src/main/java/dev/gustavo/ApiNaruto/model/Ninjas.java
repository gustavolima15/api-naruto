package dev.gustavo.ApiNaruto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ninjas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ninjas {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    String nome;
    String aldeia;
    int idade;
    String elemento;
    String imgUrl;


}
