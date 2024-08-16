package org.example;

public class ContaCorrente {


   private int contaNumero;
   private String correntistaNome;
    private Double saldo;


    /*Metodo construtor para informar alguns atributos obrigatórios e alguns valores default
     */
    public ContaCorrente(String correntistaNome, int contaNumero) {
        this.correntistaNome = correntistaNome;
        this.contaNumero = contaNumero;
        this.saldo = 00.0d;

    }

    //Metodo para alterar o nome do Correntista
    public void alterarNome(String novoNome) {
        this.correntistaNome = novoNome;
    }

    //Metodo para depositar dinheiro
    public void depositar(Double valor){
        if(valor>0){
            this.saldo += valor;
        }else{
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    //Metodo para sacar dinheiro
    public void sacar (Double valor){
        if(valor>0 && this.saldo >= valor){
            this.saldo -=valor;
        }else if (valor <= 0) {
            System.out.println("O Valor de Saque deve ser positivo");
        }else{
            System.out.println("Saldo Insuficiente");

        }


    }

    public int getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(int contaNumero) {
        this.contaNumero = contaNumero;
    }

    public String getCorrentistaNome() {
        return correntistaNome;
    }

    public void setCorrentistaNome(String correntistaNome) {
        this.correntistaNome = correntistaNome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
