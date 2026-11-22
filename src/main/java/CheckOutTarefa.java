public class CheckOutTarefa implements Tarefa {

    private Quarto quarto;

    public CheckOutTarefa(Quarto quarto) {
        this.quarto = quarto;
    }

    public void executar() {
        this.quarto.liberarQuarto();
    }

    public void cancelar() {
        this.quarto.ocuparQuarto();
    }
}
