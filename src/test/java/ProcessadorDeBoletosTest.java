import models.Boleto;
import models.Fatura;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ProcessadorDeBoletosTest {

    List<Boleto> listaDeBoletos = new ArrayList<>();

    ProcessadorDeBoletos processadorDeBoletos;
    Fatura fatura1, fatura2;
    Boleto boleto1, boleto2, boleto3;

    @Before
    public void setUp() {
        processadorDeBoletos = new ProcessadorDeBoletos();

        boleto1 = Boleto.builder()
                .codigo("123456789")
                .data(new Date())
                .valorPago(20.00)
                .build();

        boleto2 = Boleto.builder()
                .codigo("123456788")
                .data(new Date())
                .valorPago(30.00)
                .build();

        boleto3 = Boleto.builder()
                .codigo("123456787")
                .data(new Date())
                .valorPago(40.00)
                .build();

        listaDeBoletos.add(boleto1);
        listaDeBoletos.add(boleto2);
        listaDeBoletos.add(boleto3);

        fatura1 = Fatura.builder()
                .nomeCliente("João")
                .data(new Date())
                .valorTotal(100.00)
                .boletoList(listaDeBoletos)
                .build();

        fatura2 = Fatura.builder()
                .nomeCliente("João")
                .data(new Date())
                .valorTotal(20.00)
                .boletoList(listaDeBoletos)
                .build();
    }

    @Test
    public void processadorDeBoletosDeveRetornarFalso() {
        boolean resultado = processadorDeBoletos.calculaSeFaturaEstaPaga(listaDeBoletos, fatura1);

        assertFalse(resultado);
    }

    @Test
    public void processadorDeBoletosDeveRetornarVerdadeiro() {
        boolean resultado = processadorDeBoletos.calculaSeFaturaEstaPaga(listaDeBoletos, fatura2);

        assertTrue(resultado);
    }
}