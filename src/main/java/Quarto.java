public class Quarto {

    private int numero;
    private String tipo;
    private String situacao;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ocuparQuarto() {
        this.situacao = "Quarto ocupado";
    }

    public void liberarQuarto() {
        this.situacao = "Quarto liberado";
    }
}
