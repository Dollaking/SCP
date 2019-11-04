package me.dollaking;

public abstract class Turn {
	String description;
	
	public Turn(String desc){
		setDesc(desc);
	}
	
	public String getDesc(){
		return this.description;
	}
	
	public void setDesc(String desc){
		this.description = desc;
	}
	
	
	
	/**
	 * Cant Figure How to use polymorphism for this :(
	 * @param s
	 * @return
	 */
	public abstract String match(Scissors s);
	public abstract String match(Paper p);
	public abstract String match(Rock r);

}
