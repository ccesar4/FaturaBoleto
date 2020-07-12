package models;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Boleto {

    public String codigo;
    public Date data;
    public Double valorPago;
}
