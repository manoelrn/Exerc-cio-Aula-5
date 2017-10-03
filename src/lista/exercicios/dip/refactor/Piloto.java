package lista.exercicios.dip.refactor;

import lista.exercicios.dip.violation.CarroDeCorrida;

public class Piloto {

    private CarroDeCorrida veiculo;

    public Piloto(){
        this.veiculo = new CarroDeCorrida(100);
    }

    public void aumentaVelocidade(){
        veiculo.acelerar();
    }
}
