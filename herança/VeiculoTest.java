package herança;

class Veiculo {
    public void acelerar (){
        System.out.println("Veiculo acelerando");
    }
}

class Carro extends Veiculo {
    public void acelerar(){
        System.out.println("Carro acelerando!");
    }
    super(acelerar);
}

public class VeiculoTest{

    public static void main(String[] args){
        Carro carro = new Carro();

        carro.acelerar();

    }
}