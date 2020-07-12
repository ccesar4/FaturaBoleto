import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ProcessadorDeBoletosTest {

    @Test
    public void processadorDeBoletosDeveRetornarFalso() {
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        boolean resultado = processadorDeBoletos.calculaFatura(listaDeBoletos, fatura);

        assertFalse(resultado);
    }

    @Test
    public void processadorDeBoletosDeveRetornarVerdadeiro() {
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        boolean resultado = processadorDeBoletos.calculaSeFaturaEstaPaga(listaDeBoletos2, fatura);

        assertTrue(resultado);
    }
}