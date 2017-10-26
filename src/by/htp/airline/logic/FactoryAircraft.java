package by.htp.airline.logic;

import by.htp.airline.domen.transport.aircraft.Aircraft;
import by.htp.airline.domen.transport.aircraft.CargoAirplane;
import by.htp.airline.domen.transport.aircraft.PassengerAirplane;

public class FactoryAircraft {
	public static Aircraft createAircraft(String aircraftParameters) {
		Aircraft aircraft = null;
		String[] mas = aircraftParameters.split(" ");

		switch (mas[0]) {
		case "CargoAirplane":
			aircraft = new CargoAirplane(mas[1], mas[2], Integer.parseInt(mas[3]), Float.parseFloat(mas[4]),
					Float.parseFloat(mas[5]), Float.parseFloat(mas[6]), Float.parseFloat(mas[7]),
					Float.parseFloat(mas[8]), Float.parseFloat(mas[9]), mas[10]);
			break;
		case "PassengerAirplane":
			aircraft = new PassengerAirplane(mas[1], mas[2], Integer.parseInt(mas[3]), Float.parseFloat(mas[4]),
					Float.parseFloat(mas[5]), Float.parseFloat(mas[6]), Float.parseFloat(mas[7]),
					Integer.parseInt(mas[8]), Integer.parseInt(mas[9]));
			break;
		}

		return aircraft;
	}
}
