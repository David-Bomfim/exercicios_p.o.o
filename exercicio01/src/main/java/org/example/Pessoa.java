package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
public class Pessoa {

    private String name;
    private Date dataNascimento;
    private Double altura;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;

    }

    //Método para calcular a idade com base na data de nascimento
    public int calcularIdade() {
        LocalDate dataNascimentoLocal = dataNascimento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimentoLocal, hoje).getYears();

    }

    // Método para exibir todas as informações da Pessoa
    public void exibirInformacoes() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + getName());
        System.out.println("Data de Nascimento: " + formato.format(getDataNascimento()));
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Altura: " + getAltura() + " metros");

}

}