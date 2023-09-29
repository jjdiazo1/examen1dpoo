package movimientoAjedrezLogica;

public class Pieza {
	
	public int posicionX;
	
	public int posicionY;


	public Pieza(int posicionX, int posicionY) {
		
		this.posicionX = posicionX;
		
		this.posicionY = posicionY;

	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
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
