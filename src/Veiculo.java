public abstract class Veiculo implements Identificavel ,Locavel {
    protected String placa;
    protected  String modelo;
    protected double valorDiaria;
    protected boolean locado;

    public Veiculo(String placa, String modelo, double valorDiaria, boolean locado) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.locado = locado;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public boolean isLocado() {
        return locado;
    }

    public void  reajustarDiaria(double percentual){
        if(percentual <= 0){
        throw new IllegalArgumentException("ERRO: O percentual do reajuste da diaria deve ser maior que zero");
        }
        this.valorDiaria += valorDiaria * percentual/100;
    }

    @Override
    public void alugar() throws IllegalStateException {
        if(locado){
            throw new IllegalStateException("ERRO:O veículo já está locado");
        }
        locado=true;
    }

    @Override
    public void devolver() throws IllegalStateException {
        if(!locado){
            throw new IllegalStateException("ERRO: Não é possível devolver, pois não foi locado");
        }
        locado=false;
    }

    @Override
    public double calcularValorAluguel(int dias) throws IllegalArgumentException {
      if(dias <= 0){
          throw new IllegalArgumentException("ERRO: Valor inválido, a quantidade  de dias para calcular o valor do aluguel deve ser maior que zero");
      }
        return dias * valorDiaria;
    }
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Veiculo"+
                "Tipo: "+getTipo()
                +"Placa: "+getPlaca()
                +"Modelo: "+getModelo()
                +"ValorDiaria: "+getValorDiaria()
                +"Locado: "+isLocado();
    }
}
