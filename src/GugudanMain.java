
public class GugudanMain {

	public static void main(String[] args) {
	
		for(int j = 2; j < 10; j++) {
			gugudan.calculate(j);
			gugudan.print(gugudan.calculate(j), j);
		
		}
	}

}
