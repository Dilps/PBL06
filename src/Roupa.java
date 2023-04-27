public abstract class Roupa implements Produto {
    private String tamanho;
    private String cor;
    private float preco;
    private float acrescimo;
    public abstract void calcularPrecoFinal (float acrescimo);

    private void setTamanho() {
        this.tamanho = tamanho;
    }
    private String getTamanho (String tamanho) {
        this.tamanho = tamanho;
        return tamanho;
    }
    private void setCor() {
        this.cor = cor;
    }
    private String getCor (String cor) {
        return cor;
    }
}
