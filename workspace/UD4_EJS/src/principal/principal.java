package principal;

import com.iescomercio.prog.ud4.ej7.maquinaria.Tren;
import com.iescomercio.prog.ud4.ej7.personal.EspecialidadMecanico;
import com.iescomercio.prog.ud4.ej7.personal.Mecanico;

public class principal {

	public static void main(String[] args) {
		
		Mecanico m = new Mecanico("Nico","49875987",EspecialidadMecanico.FRENOS);
		
		System.out.println(m.getEspecialidad());
		
		
		Tren t = new Tren();
		t.aniadirVagon(123,100.0, "dangerous");
	}

}
