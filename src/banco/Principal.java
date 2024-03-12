package banco;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastrarConta cadCon = new CadastrarConta();
        String nome = "";

        //adicionando as contas no array
        Conta con1 = new Conta(1, "Clara", 100.0);
        Conta con2 = new Conta(2, "Luiza", 200.0);
        Conta con3 = new Conta(3, "Vinícius", 150.0);
        Conta con4 = new Conta(4, "Cauã", 250.0);

        cadCon.adicionarConta(con1);
        cadCon.adicionarConta(con2);
        cadCon.adicionarConta(con3);
        cadCon.adicionarConta(con4);

        //imprimindo as contas cadastradas
        System.out.println(Arrays.toString(cadCon.listarConta()));

        System.out.println();
        
        //sistema de busca de contas
        System.out.print("Coloque o nome da conta que deseja buscar: ");
        nome = scan.nextLine();
        cadCon.procurarConta(nome);

        scan.close();
    }
}