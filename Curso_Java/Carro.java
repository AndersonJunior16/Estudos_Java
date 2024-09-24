

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    
    Carro(String marcaInit, String modeloInit, int anoInit ) {
        marca = marcaInit;
        modelo = modeloInit;
        ano = anoInit;
    }    
    Carro(String marcaInit, String modeloInit) {
        marca = marcaInit;
        modelo = modeloInit;
    }    
    Carro() {

    }    
    
  public static void main(String args[]) {
    
    Carro carro = new Carro("Ford", "Mustang", 1990);

    System.out.println("Carro de Marca " + carro.marca + ", modelo " + carro.modelo + " ano " + carro.ano);
  }
}