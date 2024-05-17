package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// sets up the file input and organizes how the output is suppose to look like from the toString
public class Main {
	public static void main(String[] args) throws IOException {
		String inputFile = null;

		if (args.length > 0) {
			inputFile = args[0];
		} else {
			System.exit(1);
		}
		ArrayList<Dwelling> dwellings = new ArrayList<>();

		List<String> lines = Files.readAllLines(Paths.get(inputFile));
		int lineIndex = 0;
		while (lineIndex < lines.size()) {
			String type = lines.get(lineIndex++).trim();
			switch (type) {
			// identifies the H in the inputData since i didn't know how to find a line index for this. as well as A.
			case "H":
				House house = new House();
				house.setStreetAddress(lines.get(lineIndex++));
				house.setCity(lines.get(lineIndex++));
				house.setState(lines.get(lineIndex++));
				house.setZip(lines.get(lineIndex++));
				house.setBedrooms(Integer.parseInt(lines.get(lineIndex++)));
				house.setBathrooms(Double.parseDouble(lines.get(lineIndex++)));
				house.setAcreage(Double.parseDouble(lines.get(lineIndex++)));
				house.setGarageSize(Integer.parseInt(lines.get(lineIndex++)));
				dwellings.add(house);
				break;
			case "A":
				Apartment apartment = new Apartment();
				apartment.setStreetAddress(lines.get(lineIndex++));
				apartment.setCity(lines.get(lineIndex++));
				apartment.setState(lines.get(lineIndex++));
				apartment.setZip(lines.get(lineIndex++));
				apartment.setBedrooms(Integer.parseInt(lines.get(lineIndex++)));
				apartment.setBathrooms(Double.parseDouble(lines.get(lineIndex++)));
				apartment.setApptNum(lines.get(lineIndex++));
				apartment.setLaundry(Integer.parseInt(lines.get(lineIndex++)) == 1);
				dwellings.add(apartment);
				break;
			}
		}
		output(dwellings);
	}

	public static void output(ArrayList<Dwelling> dwellings) throws IOException {
		List<String> lines = new ArrayList<>();
		for (Dwelling dwelling : dwellings) {
			System.out.println(dwelling);
			lines.add(dwelling.toString());
		}
		Files.write(Paths.get("output"), lines);
	}

}
