package banco;

public class CadastrarConta {
    //ArrayList

    private Conta[] arrayCon = new Conta[5];
    private int totalContas = 0;

    public void adicionarConta(Conta con) {
        aumentarArray(arrayCon);
        arrayCon[totalContas] = con;
        totalContas++;
    }

    public void adicionarContaEsp(Conta con, int posicao) {
        if (!verificarPosicaoAdicionar(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        aumentarArray(arrayCon);
        for (int i = this.totalContas; i > posicao; i--) {
            arrayCon[i] = arrayCon[i - 1];
        }
        arrayCon[posicao] = con;
        totalContas++;
    }

    private void aumentarArray(Conta[] arrayCon) {
        if (arrayCon[arrayCon.length - 1] != null) {
            Conta[] novoArray = new Conta[arrayCon.length + 5];
            System.arraycopy(arrayCon, 0, novoArray, 0, totalContas);
            this.arrayCon = novoArray;
        }
    }

    public void excluirContaEsp(int posicao) {
        if (!verificarPosicaoExcluir(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = posicao; i < this.totalContas - 1; i++) {
            arrayCon[i] = arrayCon[i + 1];
        }
        totalContas--;
        arrayCon[totalContas] = null;
    }

    public Conta[] listarConta() {
        return this.arrayCon;
    }

    public void procurarConta(String nome) {
        boolean achou = false;
        
        for (Conta con : arrayCon) {
            if (nome.equals(con.getNome())) {
                System.out.println("A conta buscada é: " + con.toString());
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Conta não encontrada!");
        }
    }

    private boolean verificarPosicaoExcluir(int posicao) {
        if (this.totalContas == 0) {
            return false;
        }

        return posicao >= 0 && posicao <= this.totalContas - 1;
    }

    private boolean verificarPosicaoAdicionar(int posicao) {
        return posicao >= 0 && posicao <= this.totalContas;
    }

    public void size() {
        return this.totalContas;
    }
}