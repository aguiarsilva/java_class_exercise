package aulas.carro;

public class Carro {

    // declarar variaveis
    private String modelo, marca;
    private int quantidadePessoas = 0;
    private int quantidadeAssentos;
    // constructor

    public Carro(String modelo, String marca, int quantidadePessoas, int quantidadeAssentos) {
        this.modelo = modelo;
        this.marca = marca;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    //methods


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }

    //adicionar pessoas

    public void addPessoa(){
        if(this.getQuantidadePessoas() < this.getQuantidadeAssentos()){
            quantidadePessoas += 1;
            System.out.println("Passageiro entrando...");
        } else {
            System.out.println("Veículo sem assentos livres. Aguarde o próximo.");
        }
    }

    // remover pessoas

    public void removerPessoas(){
        if(this.getQuantidadePessoas() > 0 ){
            quantidadePessoas -=1;
            System.out.println("Passageiro saindo...");
        } else {
            System.out.println("O veículo está vazio. Aguardar próximo passageiro.");
        }
    }

    @Override
    public String toString(){
        return "Carro " + "\nMarca: " + marca + "\nModelo: " + modelo + "\nQuantidade de Passageiros: " + quantidadePessoas + "\nQuantidade de Assentos: " + quantidadeAssentos;    }
}


