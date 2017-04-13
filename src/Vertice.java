import java.util.Vector;

public class Vertice {
		private int valor;
		Vector<Vertice> adyacentes;
		
		public Vertice(){
			adyacentes=new Vector<Vertice>();
		}
		
		public Vertice(int val){
			valor=val;
			adyacentes=new Vector<Vertice>();
		}
		
		public void setVertice(int val){
			valor=val;
		}
		
		public void addAdyacente(Vertice v){
			adyacentes.add(v);			
		}
		
		public int getValor(){
			return valor;
		}
		
		public Vector<Vertice> getAdyacentes(){
			return adyacentes;
		}		
}

