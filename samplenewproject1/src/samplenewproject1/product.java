package samplenewproject1;

public class product {
	private String ID;
	private String name;
	private String type;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "product [ID=" + ID + ", name=" + name + ", type=" + type + "]";
	}
	
}
