public class Wolf{
	
	private String sex = "man";
	private String name ="Volk";
	private int age = 5;
	private String colour="red";
	public String getWolfSex(){
		return sex;
	}
	public String getWolfName(){
		return name;
	}
	public int getWolfAge(){
		return age;
	}
	public String getWolfColour(){
		return colour;
	}
	public void setWolfSex(String sex){
		this.sex=sex;
	}
	public void setWolfName(String name){
		this.name=name;
	}
	public void setWolfAge(int age){
		if(age>8){
			System.out.println("age is incorrect");
		} else{
			this.age=age;
		}
	}
	public void setWolfColour(String colour){
		this.colour=colour;
	}
	public void go(){
		System.out.println("Wolf goes");
	}
	public void sit(){
		System.out.println("Wolf sits");
	}
	public void run(){
		System.out.println("Wolf runs");		
	}
	public void vow(){
		System.out.println("Wolf vows");		
	}
	public void hunt(){
		System.out.println("Wolf hunts");		
	}
}