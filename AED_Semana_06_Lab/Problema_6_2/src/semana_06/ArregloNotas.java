package semana_06;

public class ArregloNotas {
	private int nota[]; 
	private int indice;
	
	public ArregloNotas() {
		nota = new int[10];
		indice = 0;

	}
	
	public int tamanio() {
		return indice;
	}
	
	public int obtener(int i) {
		return nota[i];
	}
	
	private void ampliarArreglo() {
		int aux[] = nota;
		nota = new int[indice + 10];
		for(int i = 0; i<indice; i++) {
			nota[i] = aux[i];
		}
	}
	
	public void adicionar(int e) {
		if (indice == nota.length)
			ampliarArreglo();
		nota[indice] = e;
		indice++;
	}
	
	public void eliminarFinal() {
		indice--;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public int posUltimaNotaDesaprobatoria() {		
		for(int i = indice-1; i>=0; i--) {
			if(nota[i] <13) {
				return i;
			}
		}
		return -1;
	}
	
	public void decrementarUltimaNotaDesaprobatoria() {
		int pos = posUltimaNotaDesaprobatoria();
		if(pos != -1) {
			nota[pos]-=2;
		}
		if(nota[pos] < 0) {
			nota[pos] = 0;
		}
	}
	
	public void remplazarUltimaNotaDesaprobatoria() {
	
		int pos = posUltimaNotaDesaprobatoria(); 
		int posU = indice-1;
		if(pos != -1) {
			nota[pos] = nota[posU];
		}
	}
	
}