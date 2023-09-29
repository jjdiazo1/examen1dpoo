package movimientoAjedrezLogica;

public class Peon extends Pieza implements Movimiento {
	

	public Peon(int posicionX, int posicionY) {
		super(posicionX, posicionY);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void hallarCasillasDisponibles() {
		// TODO Auto-generated method stub
		
		if (estaPuntoComienzo(posicionY)){
			
			System.out.println("El peon solo puede moverse a 2 casillas");
			
		}
		
		else if (estaPuntoLlegada(posicionY) == true) {
			
			System.out.println("El peon no tiene a donde moverse pues va a coronar");
			
		}
		
		else{
			
			System.out.println("El peon solo puede moverse a 1 casilla");		
		}
	}
	
	private boolean estaPuntoComienzo(int posicionY) {
		
		boolean esPuntoComienzo;
		
		if ( (posicionY == 2 ))
			
			esPuntoComienzo = true;
		
		else {
			esPuntoComienzo = false;
		}
		
		return esPuntoComienzo;
	}
	
private boolean estaPuntoLlegada(int posicionY) {
		
		boolean esPuntoLlegada;
		
		if ( (posicionY == 8 ))
			
			esPuntoLlegada = true;
		
		else {
			esPuntoLlegada = false;
		}
		
		return esPuntoLlegada;
	}
}
