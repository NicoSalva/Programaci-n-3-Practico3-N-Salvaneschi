import java.util.Vector;

public class main {

	public static void main(String[] args) {
		
		Grafo g=new Grafo();
		Vertice a=new Vertice(0);
		Vertice b=new Vertice(1);
		Vertice c=new Vertice(2);
		Vertice d=new Vertice(3);
		Vertice e=new Vertice(4);
		
		//adyacentes de a
		a.addAdyacente(c);
		a.addAdyacente(d);
		
		//adyacentes de b
		b.addAdyacente(c);
		
		//adyacentes de c
		c.addAdyacente(d);
		c.addAdyacente(e);
		
		//adyacentes de d
		d.addAdyacente(e);
		
		//adyacentes de e
		e.addAdyacente(d);
		
		//agrego vertices al grafo
		g.addGraffo(a);
		g.addGraffo(b);
		g.addGraffo(c);
		g.addGraffo(d);
		g.addGraffo(e);
		
		//System.out.println(g.getVertice(0).getValor());//a
		//System.out.println(g.getVertice(1).getValor());//b
		//System.out.println(g.getVertice(2).getValor());//c
		//System.out.println(g.getVertice(3).getValor());//d
		//System.out.println(g.getVertice(4).getValor());//e
		
		//Vector<Vertice> aux=new Vector<Vertice>();
		//aux=g.getVertice(1).getAdyacentes();
		
		
		//System.out.println("adyacentes vertice a");
		//System.out.println(aux.elementAt(0).getValor());
		//System.out.println(aux.elementAt(1).getValor());
		
		g.DFS_recursivo();
	}

}
