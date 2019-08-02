import java.util.ArrayList;
import java.util.Random;

public class Adicao implements Calculo {

	public static final Random random = new Random();
	
	public ArrayList<Integer> getCalculo(int qtdadeNumCalculo) {

		ArrayList<Integer> calculo = new ArrayList<Integer>();
		

		for (int x = 0; x < qtdadeNumCalculo; x++)
			calculo.add(random(0, 20));

		return calculo;
	}

	public String getCalculoEnunciado(ArrayList<Integer> calculo) {

		String enunciadoCalculo = "";

		for (int x = 0; x < calculo.size(); x++) {
			if(x == calculo.size() - 1) {
				enunciadoCalculo += calculo.get(x);
			} else {
				enunciadoCalculo += calculo.get(x) + " + ";
			}
		
		}
			

		return enunciadoCalculo;
	}

	public int getResultado(ArrayList<Integer> calculo) {

		int resultado = 0;

		for (int result : calculo) {
			resultado += result;
		}
			
		return resultado;
	}

	public int random(int min, int max) {
		int intervalo = max - min;
		return random.nextInt(intervalo) + min;
	}
}
