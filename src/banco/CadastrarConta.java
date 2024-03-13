package banco;

public class CadastrarConta {
    private int tamanho = 5;
    private Conta[] arrayCon = new Conta[tamanho];
    private int index = 0;

    public void adicionarConta(Conta con) {
        if (index < arrayCon.length) {
            arrayCon[index] = con;
            index++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public void adicionarContaEsp(Conta con, int posicao) {
        tamanho++;
        
        /* if (arrayCon[arrayCon.length -1] == null) {
            for (int i = arrayCon.length - 1; i > posicao; i--) {
                arrayCon[i] = arrayCon[i - 1];
            }
            arrayCon[posicao] = con;
        } else {
            System.out.println("Vetor cheio!");
        } */
    }

    public Conta[] listarConta() {
        return arrayCon;
    }

    public void procurarConta(String nome) {
        boolean achou = false;
        
        for (int i = 0; i < arrayCon.length; i++) {
            if (nome.equals(arrayCon[i].getNome())) {
                System.out.println("A conta buscada é: " + arrayCon[i].toString());
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Conta não encontrada!");
        }
    }
}