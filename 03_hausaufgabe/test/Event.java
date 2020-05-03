package test;

import java.util.Calendar;

public class Event {

	private String eventName;
	private String eventOrt;
	private Calendar eventDatum;

	public Event(String eventName, String eventOrt, Calendar eventDatum) {
		super();
		this.eventName = eventName;
		this.eventOrt = eventOrt;
		this.eventDatum = eventDatum;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOrt() {
		return eventOrt;
	}

	public void setEventOrt(String eventOrt) {
		this.eventOrt = eventOrt;
	}

	public Calendar getEventStart() {
		return eventDatum;
	}

	public void setEventStart(Calendar eventDatum) {
		this.eventDatum = eventDatum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;

		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventOrt == null) {
			if (other.eventOrt != null)
				return false;
		} else if (!eventOrt.equals(other.eventOrt))
			return false;
		if (eventDatum == null) {
			if (other.eventDatum != null)
				return false;
		} else if (!eventDatum.equals(other.eventDatum))
			return false;
		return true;
	}

}
