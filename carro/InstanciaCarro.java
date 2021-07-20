package aulas.carro;

public class InstanciaCarro {
    public static void main(String[] args){

        //instancia e atributos

        Carro carro = new Carro("Camaro", "Chevrolet", 0, 4);
        System.out.println(carro);

        //adicionar passageiro
        carro.addPessoa();

        //mostrar lotação do carro
        System.out.println("Lotação atual: " + carro.getQuantidadePessoas() + " passageiros.");

        //adiciona mais passageiros
        carro.addPessoa();
        carro.addPessoa();
        carro.addPessoa();

        // mostra lotacao atualizada
        System.out.println("Lotação atual: " + carro.getQuantidadePessoas() + " passageiros.");

        //remove pessoa
        carro.removerPessoas();

        // mostra lotacao atualizada
        System.out.println("Lotação atual: " + carro.getQuantidadePessoas() + " passageiros.");

        // adiciona pessoas para testar quando for maior que o numero de assentos
        carro.addPessoa();
        carro.addPessoa();

        // mostra lotacao atualizada
        System.out.println("Lotação atual: " + carro.getQuantidadePessoas() + " passageiros.");
    }
}

