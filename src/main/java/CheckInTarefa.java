public class CheckInTarefa implements Tarefa {

    private Quarto quarto;

    public CheckInTarefa(Quarto quarto) {
        this.quarto = quarto;
    }

    public void executar() {
        this.quarto.ocuparQuarto();
    }

    public void cancelar() {
        this.quarto.liberarQuarto();
    }
}
