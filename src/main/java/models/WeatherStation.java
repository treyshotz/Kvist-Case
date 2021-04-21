package models;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Setter
@Getter
public class WeatherStation implements PropertyChangeListener {
	
	Logger log = LoggerFactory.getLogger(WeatherStation.class);
	
 	private int temperature = 0;
	int humidity = 0;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("humidity")) {
			this.setHumidity((int) evt.getNewValue());
			log.info("Property {} set to {}", evt.getPropertyName(), evt.getNewValue());
		} else if(evt.getPropertyName().equals("temperature")) {
			this.setTemperature((int) evt.getNewValue());
			log.info("Property {} set to {}", evt.getPropertyName(), evt.getNewValue());
		} else {
			log.error("Property {} not found", evt.getPropertyName());
		}
	}
}
