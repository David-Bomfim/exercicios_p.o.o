package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


//Criação da Instancia de pessoa
  Pessoa pessoa = new Pessoa();

//Pegando o nome do usuario
  System.out.println("Digite o Seu Nome: ");
  String nome = leitor.nextLine();
  pessoa.setName(nome);

  //pegando a data de nascimento do usuario
  System.out.println("Digite a sua data de nascimento:  (dd/MM/yyyy");
  String dataNascimentoStr = leitor.nextLine();

  //Formatador de data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); // Define para não aceitar datas inválidas como 32/13/2023

        try {
            // Convertendo a String para Date
            Date dataNascimento = formato.parse(dataNascimentoStr);
            pessoa.setDataNascimento(dataNascimento);

            // Capturando a altura do usuário
            System.out.println("Digite sua altura em metros (exemplo: 1.75): ");
            Double altura = leitor.nextDouble();
            pessoa.setAltura(altura);

            // Exibindo todas as informações da Pessoa
            pessoa.exibirInformacoes();

        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
        }

        leitor.close();
    }







    }
