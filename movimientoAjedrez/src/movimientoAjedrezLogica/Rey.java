package movimientoAjedrezLogica;

	
public class Rey extends Pieza implements Movimiento {
	

	public Rey(int posicionX, int posicionY) {
		super(posicionX, posicionY);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void hallarCasillasDisponibles() {
		// TODO Auto-generated method stub
		
		if ( (posicionX == 1 && posicionY == 8) || (posicionX == 1 && posicionY == 1) 
				|| (posicionX == 8 && posicionY == 1) || (posicionX == 8 && posicionY == 8) ){
			
			System.out.println("El rey solo puede moverse a 3 casillas");
			
		}
		
		else if (esPosicionBorde(posicionX, posicionY) == true) {
			
			System.out.println("El rey solo puede moverse a 5 casillas");
			
		}
		
		else{
			
			System.out.println("El rey solo puede moverse a 8 casillas");		
		}
	}
	public boolean esPosicionBorde(int posicionX, int posicionY) {
		
		boolean esPosicion;
		
		if ( (posicionX == 1 && (posicionY != 8 && posicionY != 1)) ||
			  posicionX == 8 && (posicionY != 8 && posicionY != 1))
			
			esPosicion = true;
		
		else {
			esPosicion = false;
		}
		
		return esPosicion;
	}
	}