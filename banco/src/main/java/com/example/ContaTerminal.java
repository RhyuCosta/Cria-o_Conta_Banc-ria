package com.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Exibe a mensagem final para o usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}