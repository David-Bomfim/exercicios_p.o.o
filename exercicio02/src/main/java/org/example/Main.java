package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciando uma nova conta corrente
        ContaCorrente minhaConta = new ContaCorrente("João Silva", 123456);

        // Verificando o saldo inicial
        System.out.println("Saldo inicial: R$ " + minhaConta.getSaldo());

        // Alterando o nome do correntista
        minhaConta.alterarNome("João Santos");
        System.out.println("Nome atualizado: " + minhaConta.getCorrentistaNome());

        // Depositando dinheiro na conta
        minhaConta.depositar(500.0);
        System.out.println("Saldo após depósito: R$ " + minhaConta.getSaldo());

        // Tentando sacar um valor maior que o saldo disponível
        minhaConta.sacar(600.0); // Isso deve exibir uma mensagem de erro
        System.out.println("Saldo após tentativa de saque: R$ " + minhaConta.getSaldo());

        // Sacando um valor dentro do saldo disponível
        minhaConta.sacar(200.0);
        System.out.println("Saldo após saque: R$ " + minhaConta.getSaldo());

        // Exibindo o nome original do correntista
        System.out.println("Nome original: " + minhaConta.getCorrentistaNome());

        // Alterando o nome do correntista
        minhaConta.alterarNome("Henrique Rafael");

        // Verificando se o nome foi alterado com sucesso
        String nomeAtualizado = minhaConta.getCorrentistaNome();
        System.out.println("Nome atualizado: " + nomeAtualizado);

        // Teste para verificar se a alteração foi bem-sucedida
        if (nomeAtualizado.equals("Henrique Rafael")) {
            System.out.println("Teste de alteração de nome: SUCESSO");
        } else {
            System.out.println("Teste de alteração de nome: FALHA");
        }
    }

}