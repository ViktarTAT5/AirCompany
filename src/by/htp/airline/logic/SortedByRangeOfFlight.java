package by.htp.airline.logic;

import java.util.Comparator;
import by.htp.airline.domen.aircraft.Aircraft;

public class SortedByRangeOfFlight implements Comparator<Aircraft> {

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		float rangeOfFlight1 = o1.getRangeOfFlight();
		float rangeOfFlight2 = o2.getRangeOfFlight();

		if (rangeOfFlight1 < rangeOfFlight2) {
			return -1;
		} else {
			if (rangeOfFlight1 > rangeOfFlight2) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
