package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;

public class EventMain {

	public static void main(String[] args) {

		HashSet<Event> events = new HashSet<>();

		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");

		Calendar eventDatum01 = Calendar.getInstance();
		eventDatum01.set(2012, 11, 12);

		Calendar eventDatum02 = Calendar.getInstance();
		eventDatum02.set(2020, 5, 3);

		Event event01 = new Event("Party XY", "Hamburg", eventDatum01);
		events.add(event01);
		Event event02 = new Event("Party in L.A.", "Hamburg", eventDatum01);
		events.add(event02);
		Event event03 = new Event("Gabs Geburtstag", "Hamburg", eventDatum02);
		events.add(event03);

		try {
			
			for(Event evt: events) {
				System.out.println(evt.getEventName() + "\n" + evt.getEventOrt() + "\n" + date.format(evt.getEventStart().getTime())
				+ "\n" + time.format(evt.getEventStart().getTime()));
				System.out.println("");
			}
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
