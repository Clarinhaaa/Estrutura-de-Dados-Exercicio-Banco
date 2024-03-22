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
        if (arrayCon[index] == null) {
            for (int i = this.index; i > posicao; i--) {
                arrayCon[i] = arrayCon[i--];
            }
            arrayCon[posicao] = con;
            index++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public void excluirContaEsp(int posicao) {
        for (int i = posicao; i < this.index - 1; i++) {
            arrayCon[i] = arrayCon[i++];
        }
        index--;
        arrayCon[index] = null;
    }

    public Conta[] listarConta() {
        return arrayCon;
    }

    public void procurarConta(String nome) {
        boolean achou = false;
        
        for (int i = 0; i < this.index; i++) {
            if (nome.equals(arrayCon[i].getNome())) {
                System.out.println("A conta buscada é: " + arrayCon[i].toString());
                if (arrayCon[i].getNome().equals("Enrico")) {
                    System.out.println("Pague os 300 pra Junio pelo amor de Deus");
                }
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Conta não encontrada!");
        }
    }
}