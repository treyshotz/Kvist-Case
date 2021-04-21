package models;

import lombok.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

@AllArgsConstructor
@Getter
@Setter
public class WaterUnit {
	private int temperature;
	
	private PropertyChangeSupport changeSupport;
	
	public WaterUnit() {
		this.changeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		changeSupport.addPropertyChangeListener(pcl);
	}
	
	public void deletePropertyChangeListener(PropertyChangeListener pcl) {
		changeSupport.removePropertyChangeListener(pcl);
	}
	
	/**
	 * Notifies the observer if the temperature is above 6 degrees
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		if(temperature > 6)
			changeSupport.firePropertyChange("temperature", this.temperature, temperature );
		this.temperature = temperature;
	}
}
