package semana_06;

public class ArregloTemperaturas {
	
	private double temperatura[];
	private int indice;
	
	public ArregloTemperaturas() {

	temperatura = new double[10];
	indice = 0;
	}
	
	public int tamanio() {
		return indice;
	}
	
	public double obtener(int i) {
		return temperatura[i];
	}
	
	private void ampliarArreglo() {
		double aux[] = temperatura;
		temperatura = new double[indice + 10];
		for(int i = 0; i<indice-1; i++) {
			temperatura[i] = aux[i];
		}
	}
	
	public void adicionar(double i) {
		if(indice == temperatura.length) {
			ampliarArreglo();
		}
		temperatura[indice] = i;
		indice++;
	}
	
	public void eliminarAlFinal() {
		indice--;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public double temperaturaMenor() {
		double menor = temperatura[0];
		for (int i = 1; i<indice; i++) {
			if(temperatura[i] < menor) {
				menor = temperatura[i];
			}
		}
		return menor;
	}
	
	public int posPrimeraTemperaturaNormal() {
		
		int i = 0;
		
		for(double valor:temperatura) {
			if(valor >= 36.1 && valor<= 37.2) {
				return i;
			}
			i++;
		}
		return -1;	
	}
	
	public void remplazarPrimeraTemperaturaNormal() {
		int pos1 = posPrimeraTemperaturaNormal();
		if(pos1 != -1) {
			temperatura[pos1] = temperaturaMenor();
		}
	}
	
	public void incrementarTemperaturas() {
		for(int i = 0; i<indice; i++) {
			temperatura[i]+=0.2;
		}
	}
	
}