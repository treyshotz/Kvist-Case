package models;

import lombok.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

@AllArgsConstructor
@Getter
@Setter
public class AirUnit implements Unit{
	
	private int humidity;
	private PropertyChangeSupport changeSupport;
	
	public AirUnit() {
		changeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		changeSupport.addPropertyChangeListener(pcl);
	}
	
	public void deletePropertyChangeListener(PropertyChangeListener pcl) {
		changeSupport.removePropertyChangeListener(pcl);
	}
	
	/**
	 * Notifies observer if the humidity is beneath 10
	 * @param humidity
	 */
	public void setHumidity(int humidity) {
		if(humidity < 10)
			changeSupport.firePropertyChange("humidity", this.humidity, humidity);
		this.humidity = humidity;
	}
}
