package com.inpe.controledeacesso.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // A anotação @Entity é usada para mapear a classe Java para uma tabela no banco de dados.
@Table(name = "tb_user")
public class User {
    
    //Variáveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // A anotação @GeneratedValue é usada para indicar que o valor para esse campo deve ser gerado automaticamente pelo banco de dados ao inserir um novo registro na tabela. O parâmetro "strategy" indica o tipo de estratégia de geração de valor a ser usado. No exemplo fornecido, o valor "GenerationType.IDENTITY" indica que o banco de dados deve gerar um valor de chave primária usando a identidade do banco de dados.
    private long id;
    private String name;
    private String email;
    private long matricula;

    //Métodos
    @ManyToOne //No banco de dados relacional significa uma relação user -> department de muitos para um
    @JoinColumn(name = "department_id")
    private Department department;

    public User(){
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
