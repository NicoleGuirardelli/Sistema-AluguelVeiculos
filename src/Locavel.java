public interface Locavel {
    double calcularValorAluguel(int dias) throws IllegalArgumentException;
    void alugar() throws IllegalStateException;
    void devolver() throws IllegalStateException;
    boolean isLocado();
}
