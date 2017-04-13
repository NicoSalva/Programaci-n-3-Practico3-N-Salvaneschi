
public class Pila {
	private Lista l1;
	
	public Pila(){		
	l1=new Lista();
	}
	
	
	
	public int verTope(){
		return l1.at(0);
	}
	
	public void apilar(int i){
		l1.addElemento(i);
	}
	
	public void desapilar(){
		l1.Eliminar();
	}
	
	public boolean estaVacia(){
		return (l1.getTamaño()==0);
			
	}
	
}
