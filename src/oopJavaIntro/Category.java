package oopJavaIntro;

public class Category {
	
	private int id;
	private String name;
	
	
	public Category(){
		
		this.id = id;
		this.name = name;
	}
	

	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return this.id; 
	};
	
	public void setId(int id) {
		this.id = id;
	};
	
	
	public String getName() {
		return name + "!";
	};
	
	public void setName(String name) {
		this.name = name;
	};
}
 