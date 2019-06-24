package ÐÂÌØÐÔ;

import java.util.function.Consumer;

public class apple {
	private static String color;
	private static float weight;
	
	public apple(String color, float weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	public static void main(String[] args) {
		System.out.println("apple:"+color+"/"+weight);
	}




	public static void ConsumerApple(apple[] apps,Consumer<apple> c){
		 for(apple app:apps){
			 c.accept(app);
		 }
	 }

}
