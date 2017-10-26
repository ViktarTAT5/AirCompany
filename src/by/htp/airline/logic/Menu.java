package by.htp.airline.logic;

import java.util.Scanner;

import by.htp.airline.domen.Company;
import by.htp.airline.util.Print;

public class Menu {
	private Company company;
	private boolean flag = true;
	private int numberCommand;
	Dispatcher dispatcher;
	Scanner sc = new Scanner(System.in);

	public Menu(Company company) {
		this.company = company;
		this.dispatcher = company.getDispatcher();
	}

	public boolean isFlag() {
		return flag;
	}

	public void askCommand() {

		Print.print("Select a command:");
		Print.print("1: Show all transports");
		Print.print("2: To count total carrying capasity and capacity cargo");
		Print.print("3: Sort by flight range");
		Print.print("4: Search by fuel consumption");
		Print.print("5: Exit");

		do {
			if (sc.hasNextInt()) {
				numberCommand = sc.nextInt();
				if (numberCommand > 0 && numberCommand < 6) {
					return;
				}
			}
			Print.print("Invalid character");
		} while (true);
	}

	public void handlerComand() {
		switch (numberCommand) {
		case 1:
			dispatcher.showListTransport();
			break;
		case 2:
			dispatcher.totalCapacityCargoAndCarrying();
			break;
		case 3:
			dispatcher.sortedByRangeOfFlight();
			break;
		case 4:
			float minFuelConsumption = askMinFuelConsumption();
			float maxFuelConsumption = askMaxFuelConsumption(minFuelConsumption);
			dispatcher.searchByParameters(minFuelConsumption, maxFuelConsumption);
			break;
		case 5:
			flag = false;
			break;
		}
	}

	private float askMinFuelConsumption() {
		Print.print("Enter min fuel consumption");
		float minFuelConsumption;
		do {
			if (sc.hasNextFloat()) {
				minFuelConsumption = sc.nextFloat();
				if (minFuelConsumption > 0 && minFuelConsumption < 100) {
					return minFuelConsumption;
				}
			}
			Print.print("Invalid character");
		} while (true);
	}

	private float askMaxFuelConsumption(float minFuelConsumption) {
		Print.print("Enter max fuel consumption");
		float maxFuelConsumption;
		do {
			if (sc.hasNextFloat()) {
				maxFuelConsumption = sc.nextFloat();
				if (maxFuelConsumption > 0 && maxFuelConsumption < 100) {
					if (maxFuelConsumption > minFuelConsumption) {
						return maxFuelConsumption;
					} else {
						Print.print("minFuelConsumption more maxFuelConsumption");
						continue;
					}
				}
			}
			Print.print("Invalid character");
		} while (true);
	}
}
