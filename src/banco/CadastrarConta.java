package banco;

public class CadastrarConta {
    private Conta[] arrayCon = new Conta[5];
    private int totalContas = 0;

    public void adicionarConta(Conta con) {
        arrayCon = aumentarArray(arrayCon);
        arrayCon[totalContas] = con;
        totalContas++;
    }

    public void adicionarContaEsp(Conta con, int posicao) {
        arrayCon = aumentarArray(arrayCon);
        for (int i = this.totalContas; i > posicao; i--) {
            arrayCon[i] = arrayCon[i - 1];
        }
        arrayCon[posicao] = con;
        totalContas++;
    }

    public Conta[] aumentarArray(Conta[] arrayCon) {
        Conta[] novoArray = new Conta[arrayCon.length + 5];

        if (arrayCon[arrayCon.length - 1] == null) {
            return arrayCon;
        } else {
            System.arraycopy(arrayCon, 0, novoArray, 0, totalContas);
        }

        return novoArray;
    }

    public void excluirContaEsp(int posicao) {
        for (int i = posicao; i < this.totalContas - 1; i++) {
            arrayCon[i] = arrayCon[i + 1];
        }
        totalContas--;
        arrayCon[totalContas] = null;
    }

    public Conta[] listarConta() {
        return arrayCon;
    }

    public void procurarConta(String nome) {
        boolean achou = false;
        
        for (int i = 0; i < this.totalContas; i++) {
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