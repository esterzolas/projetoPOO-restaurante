import java.util.ArrayList;

public class Bebida extends Itens {
    private String tipoEmbalagem;
    private String tamanhoEmbalagem;

    public Bebida () {
    }

    public Bebida(String nome, double precoUnitario, double precoCusto, ArrayList<Itens> listaDeItens, String tipoEmbalagem, String tamanhoEmbalagem) throws ErroCodigoException {
        super(nome, precoUnitario, precoCusto, listaDeItens);
        this.tipoEmbalagem = tipoEmbalagem;
        this.tamanhoEmbalagem = tamanhoEmbalagem;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public String getTamanhoEmbalagem() {
        return tamanhoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public void setTamanhoEmbalagem(String tamanhoEmbalagem) {
        this.tamanhoEmbalagem = tamanhoEmbalagem;
    }

    public void mostrarItem () {
        super.mostrarItem();
        System.out.println("Tipo embalagem: " + getTipoEmbalagem());
        System.out.println("Tamanho embalagem: " + getTamanhoEmbalagem());
    }
}
