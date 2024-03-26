package banco;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        CadastrarConta cadCon = new CadastrarConta();

        //adicionando as contas no array
        Conta con1 = new Conta(1, "Ana Clara", 100.0);
        Conta con2 = new Conta(2, "Luiza", 200.0);
        Conta con3 = new Conta(3, "Vinícius", 150.0);
        Conta con4 = new Conta(4, "Cauã", 250.0);

        cadCon.adicionarConta(con1);
        cadCon.adicionarConta(con2);
        cadCon.adicionarConta(con3);
        cadCon.adicionarConta(con4);

        //adição de contas em uma posição específica do array
        Conta con5 = new Conta (5, "Enrico", 300.0);
        cadCon.adicionarContaEsp(con5, 0);

        //teste dos métodos que aumentam o array
        Conta con6 = new Conta(6, "Thiago", 350.0);
        cadCon.adicionarContaEsp(con6, 3);

        //imprimindo as contas cadastradas
        System.out.println(Arrays.toString(cadCon.listarConta()));
        System.out.println();
        
        //sistema de busca de contas
        System.out.print("Coloque o nome da conta que deseja buscar: ");
        cadCon.procurarConta("Thiago");
    }
}