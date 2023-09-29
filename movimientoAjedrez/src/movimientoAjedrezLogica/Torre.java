

package movimientoAjedrezLogica;

public class Torre extends Pieza implements Movimiento {
	

	public Torre(int posicionX, int posicionY) {
		super(posicionX, posicionY);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void hallarCasillasDisponibles() {
		// TODO Auto-generated method stub
		
		int movimientosEnX = Math.abs((posicionX) - 8);
		int movimientosEnY = Math.abs(movimientosEnX - 8);
		
		int casillasDisponibles = (movimientosEnX + movimientosEnY);

		System.out.println("La torre solo puede moverse a" + String.valueOf(casillasDisponibles) + "casillas");
	
	}
	
}