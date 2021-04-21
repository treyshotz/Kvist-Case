import models.AirUnit;
import models.WaterUnit;
import models.WeatherStation;

public class main {
	public static void main(String[] args) {
		WeatherStation system = new WeatherStation();
		WaterUnit waterUnit = new WaterUnit();
		AirUnit airUnit = new AirUnit();
		waterUnit.addPropertyChangeListener(system);
		airUnit.addPropertyChangeListener(system);
		
		waterUnit.setTemperature(3);
		airUnit.setHumidity(4);
		waterUnit.setTemperature(8); //Log
		airUnit.setHumidity(12); //Log
		airUnit.setHumidity(9);
		airUnit.setHumidity(10); //Log
		waterUnit.setTemperature(12); //Log
		waterUnit.setTemperature(2);
		waterUnit.setTemperature(6);
		waterUnit.setTemperature(7); //Log

	}
}
