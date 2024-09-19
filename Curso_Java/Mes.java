public class Mes {
	public static void main(String[] args) {
        String mes = "Fevereiro";
        
        switch (mes){
            
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> System.out.println(mes + " tem 31 dias.");
            
            case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println(mes + " tem 30 dias.");
            
            case "Fevereiro" -> System.out.println(mes + " tem 28 dias.");
            
            default -> System.out.println("Mês invalido");
        }
	}
}