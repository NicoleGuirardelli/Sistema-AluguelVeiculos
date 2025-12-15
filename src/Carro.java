public class Carro extends VeiculoMotorizado{
    private  int quantidadePortas;

    public Carro(String placa, String modelo, double valorDiaria, boolean locado, int ano,  int quantidadePortas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +super.toString()+
                "Quantidade de portas:"+ getQuantidadePortas()+
                "Ano: "+ getAno();

    }
}
