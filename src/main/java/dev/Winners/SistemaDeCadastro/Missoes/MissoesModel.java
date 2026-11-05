package dev.Winners.SistemaDeCadastro.Missoes;


import dev.Winners.SistemaDeCadastro.Pessoas.NovoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Missoes;
    private String dificuldade;

    // Uma missão pode ter várias pesoas
    @OneToMany(mappedBy = "missoes")
    private List<NovoModel> pessoas;

}

