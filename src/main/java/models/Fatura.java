package models;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class Fatura {

    public String nomeCliente;
    public Double valorTotal;
    public Date data;
    public List<Boleto> boletoList;


}
