package nosi.ak.shoppingbackend.dto;

public class Category {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagURL() {
		return imagURL;
	}
	public void setImagURL(String imagURL) {
		this.imagURL = imagURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
/*
 * Private fields	
 **/
	private int id;
	private String name;
	private String description;
	private String imagURL;
	private boolean active = true;
	
	
	
}
