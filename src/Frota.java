import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Frota <T extends Veiculo>{
    private List<T> veiculos= new ArrayList<>();

    public void adicionar(T veiculo){
        veiculos.add(veiculo);
    }
    List<T> getVeiculos(){
        return veiculos;
    }
    public void exibirTodos(){
        this.veiculos.forEach(System.out::println);
    }
    public T buscarMaisCaro(){
        return veiculos.stream().max(Comparator.comparingDouble(Veiculo::getValorDiaria)).get();
    }
    public T buscarMaisBarato(){
        return veiculos.stream().min(Comparator.comparingDouble(Veiculo::getValorDiaria)).get();
    }

}
