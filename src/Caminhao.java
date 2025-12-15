public class Caminhao extends VeiculoMotorizado{
    private double capacidadeToneladas;

    public double getCapacidadeToneladas() {
        return capacidadeToneladas;
    }

    public Caminhao(String placa, String modelo, double valorDiaria, boolean locado, int ano,double capacidadeToneladas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.capacidadeToneladas=capacidadeToneladas;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
    @Override
    public String toString() {
        return "Caminhão{" +super.toString()+
                "Capacidade:"+ getCapacidadeToneladas() +
                "Ano: "+ getAno();

    }
}
