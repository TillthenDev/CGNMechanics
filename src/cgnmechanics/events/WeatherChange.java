package cgnmechanics.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChange implements Listener {
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onWeatherChange(WeatherChangeEvent e) {
		e.setCancelled(true);
	}
	
}
