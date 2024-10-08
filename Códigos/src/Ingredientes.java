public class Ingredientes {
    private String nome;
    private String quantidade;

    public Ingredientes () {
    }

    public Ingredientes (String nome, String quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarIngrediente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
    }
}