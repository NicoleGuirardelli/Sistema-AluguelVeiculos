
public class  LocadoraVeiculos {
    public static void main(String[] args) {

        Frota<Veiculo> frota = new Frota<>();


        frota.adicionar(new Carro("AAA-1111", "Gol",
                120.0, false, 2018, 4));
        frota.adicionar(new Carro("BBB-2222", "Onix",
                150.0, true,  2020, 4));
        frota.adicionar(new Carro("CCC-3333", "Corolla",
                220.0, false, 2019, 4));
        frota.adicionar(new Carro("DDD-4444", "HB20",
                130.0, false, 2021, 4));
        frota.adicionar(new Carro("EEE-5555", "Civic",
                230.0, true,  2022, 4));
        frota.adicionar(new Carro("FFF-6666", "Fiesta",
                110.0, false, 2017, 4));
        frota.adicionar(new Carro("GGG-7777", "Sandero",
                125.0, false, 2018, 4));
        frota.adicionar(new Carro("HHH-8888", "Argo",
                140.0, true,  2021, 4));

        //motos
        frota.adicionar(new Moto("III-9999", "CG 160",
                80.0,  false, 2019, 160));
        frota.adicionar(new Moto("JJJ-0001", "Fazer 250",
                100.0, true,  2020, 250));
        frota.adicionar(new Moto("KKK-0002", "XRE 300",
                130.0, false, 2021, 300));

        // caminhões
        frota.adicionar(new Caminhao("LLL-0003", "Cargo 2429",
                400.0, false, 2018, 13.0));
        frota.adicionar(new Caminhao("MMM-0004", "Atego 2428",
                420.0, true,  2019, 14.0));
        frota.adicionar(new Caminhao("NNN-0005", "VM 270",
                450.0, false, 2020, 15.0));
        frota.adicionar(new Caminhao("OOO-0006", "Constellation 24.280", 470.0, false, 2021, 16.0));




       try {

           // APRESENTAR SOMENTE OS CARROS (LAMBDA + FILTER)
           System.out.println("\n===Somente Carros===");
           frota.getVeiculos().stream().filter(veiculo -> veiculo.getTipo().equals("Carro")).forEach(System.out::println);


           // APRESENTAR O MAIS CARO E O MAIS BARATO
           System.out.println("\n===Veiculo mais caro e mais barato===");
           System.out.println("Mais caro: " + frota.buscarMaisCaro());
           System.out.println("Mais barato: " + frota.buscarMaisBarato());


           // APRESENTAR TODOS OS VEÍCULOS
           // (usa lambda simples em Frota.exibirTodos)
           System.out.println("\n ===Todos os veículos===");
           frota.exibirTodos();


         // AUMENTAR EM 20% O VALOR DOS CAMINHÕES
           System.out.println("\n ===Aumentar valor dos caminhões em 20===");
           frota.getVeiculos().stream().filter(veiculo -> veiculo.getTipo().equals("Caminhão")).forEach(veiculo -> veiculo.reajustarDiaria(20));



            // APRESENTAR SOMENTE OS CAMINHÕES APÓS A ALTERAÇÃO
           System.out.println("\n===Caminhões após a alteração===");
           frota.getVeiculos().stream().filter(veiculo -> veiculo.getTipo().equals("Caminhão")).forEach(System.out::println);

          // APRESENTAR OS VEÍCULOS NÃO LOCADOS
           System.out.println("\n ===Veículos não locados===");
           frota.getVeiculos().stream().filter(veiculo -> !veiculo.isLocado()).forEach(System.out::println);


//            // APRESENTAR AS MOTOS LOCADAS
           System.out.println("\n ===Motos locadas===");
           frota.getVeiculos().stream().filter(veiculo -> veiculo.getTipo().equals("Moto")).filter(veiculo -> veiculo.isLocado()).forEach(System.out::println);

          // EXEMPLO DE USO DAS FUNCIONALIDADES DE LOCAVEL
          // (alugar, devolver, calcular valor)

       System.out.println("EXEMPLO DE USO DAS FUNCIONALIDADES DE LOCAVEL");
       Veiculo veiculo1 = frota.getVeiculos().get(1);
       Veiculo veiculo2 = frota.getVeiculos().get(11);

       try {
           veiculo1.calcularValorAluguel(5);
          // veiculo2.calcularValorAluguel(11);

       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }

       try {
           veiculo1.alugar();
          //       veiculo2.alugar();
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }

       try{
           veiculo1.devolver();
         //    veiculo2.devolver();

       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }








   }catch (Exception e){
       System.out.println("ERRO: "+e.getMessage());
   }





    }

}



