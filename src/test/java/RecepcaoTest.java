import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecepcaoTest {

    Recepcao recepcao;
    Quarto quarto;

    @BeforeEach
    void setUp() {
        recepcao = new Recepcao();
        quarto = new Quarto(1, "Casal");
    }

    @Test
    void deveOcuparQuarto() {
        Tarefa checkIn = new CheckInTarefa(quarto);
        recepcao.executarTarefa(checkIn);

        assertEquals("Quarto ocupado", quarto.getSituacao());
    }

    @Test
    void deveLiberarQuarto() {
        Tarefa checkOut = new CheckOutTarefa(quarto);
        recepcao.executarTarefa(checkOut);

        assertEquals("Quarto liberado", quarto.getSituacao());
    }

    @Test
    void deveCancelarCheckOut() {
        Tarefa checkIn = new CheckInTarefa(quarto);
        Tarefa checkOut = new CheckOutTarefa(quarto);

        recepcao.executarTarefa(checkIn);
        recepcao.executarTarefa(checkOut);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Quarto ocupado", quarto.getSituacao());
    }

}