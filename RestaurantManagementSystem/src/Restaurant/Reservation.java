package Restaurant;

public class Reservation {
	
	//table number
	private String id;
	
	//table type
	private String type;
	
	//Available or not
	private boolean isUse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUse() {
		return isUse;
	}

	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}

	public Reservation(String id, String type, boolean isUse) {
		super();
		this.id = id;
		this.type = type;
		this.isUse = isUse;
	}
	
	

	@Override
	public String toString() {
		return  "["+id + " "+"type: " + type + " "+"situation: " + (isUse?"Unavailable" : "Available")+"]";
	}
	
	
}
