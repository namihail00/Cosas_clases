package T2Ej10;

/**
 * cigarParty ejercicios extra
 */
public class T2Ej10 {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return cigars >= 40 || cigars >= 60;

		} else {
			isWeekend = !false;
			return cigars >= 40 && cigars <= 60;
		}
	}
}
