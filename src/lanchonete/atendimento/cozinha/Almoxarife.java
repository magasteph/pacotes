package lanchonete.atendimento.cozinha;

public class Almoxarife {
	 private void controlarEntrada() {
		 System.out.println("Controlando a entrada dos itens");
	 }
	 private void controlarSaida() {
		 System.out.println("Controlando a saida dos itens");
	 }
	 // default 
	 void entregarIngredientes() {
		 System.out.println("Entreganod ingredientes");
		 controlarSaida();
	 }
	 //default
	 void trocarGas() {
		 System.out.println("Almoxarife trocando o Gas");
	 }
}
