import java.util.Stack;
import java.util.Vector;

public class Grafo {
	private Vector<Vertice> graffo;

	public Grafo() {
		graffo = new Vector<Vertice>();
	}

	public void addGraffo(Vertice v) {
		graffo.addElement(v);
	}

	public Vertice getVertice(int pos) {
		return graffo.elementAt(pos);
	}

	public void DFS_recursivo() {
		Estado estados[] = new Estado[this.graffo.size()];
		int tiempoInicial[] = new int[this.graffo.size()];
		int tiempoFinales[] = new int[this.graffo.size()];

		for (int i = 0; i < this.graffo.size(); i++) {
			estados[i] = Estado.No_Visitado;
		}
		int tiempo = 0;
		//
		for (int i = 0; i <this.graffo.size() ; i++) {
			if (estados[i] == Estado.No_Visitado) {
				DFS_Visitado(estados, tiempoInicial, tiempoFinales,tiempo,i);
			}
			
		}

	}
	
	public void DFS_Visitado(Estado estados[],int tiempoInicial[],int tiempoFinales[],int tiempo,int i){
		System.out.print(i);//lo dejo para comprobar el recorrido 
		estados[i]=Estado.Visitandose;
		tiempo++;
		tiempoInicial[i]=tiempo;
		Vector<Vertice> adyacentesAI= graffo.elementAt(i).adyacentes;
		for (int j = 0; j <adyacentesAI.size() ; j++) {
			Vertice v = adyacentesAI.get(j);
			if(estados[v.getValor()]==Estado.No_Visitado){
				DFS_Visitado(estados,tiempoInicial,tiempoFinales,tiempo,v.getValor());
			}			
		}
		estados[i]=Estado.Visitado;
		tiempo++;
		tiempoFinales[i]=tiempo;		
	}
			

}
