import models.Boleto;
import models.Fatura;

import java.util.List;

public class ProcessadorDeBoletos {

    double valorTotalBoletos = 0;

    public boolean calculaSeFaturaEstaPaga(List<Boleto> listaDeBoletos, Fatura fatura){

        for (Boleto boleto : listaDeBoletos) {
            valorTotalBoletos += boleto.getValorPago();
        }

        System.out.println(valorTotalBoletos);
        System.out.println(fatura.getValorTotal());
        return valorTotalBoletos > fatura.getValorTotal();

    }
}
