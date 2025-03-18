package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Conta: ");
        Numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o numero da Agencia: ");
        Agencia = sc.next();
        System.out.print("Por favor, digite o seu Nome: ");
        NomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o seu Saldo: ");
        Saldo = sc.nextDouble();

        System.out.println("Ola "+NomeCliente+" ,obrigado por criar uma conta em nosso banco, sua agencia e "+Agencia+
                " conta "+ Numero+ "\n e seu saldo "+Saldo+" ja esta disponivel para saque.");

        sc.close();
    }
}
