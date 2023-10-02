package loops;

public class BreakContinue {
	public static void main(String[] args) {
		for (int cliente = 1; cliente <= 20; cliente++) {
			System.out.println("Eres el cliente " + cliente);
			if(cliente == 5) {
				System.out.println("Te ganaste una coquita en bolsa");
			}
		}
	}
}
