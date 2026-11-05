package dev.Winners.SistemaDeCadastro.Pessoas;

import dev.Winners.SistemaDeCadastro.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Ele transforma uma classe comum em uma entidade no BD
@Entity
@Table(name = "tb_cadastro")
public class NovoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Vai ser gerado automaticamente números sequenciais
    private Long id;
    private String nome;
    private String email;
    private int idade;
    // @ManyToOne - uma pessoa tem uma unica tarefa
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

    public NovoModel() {

    }

    public NovoModel(String nome, String email, int idade) {
        super();
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


}

