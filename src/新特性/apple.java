package 新特性;

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
		// 匿名内部类形式
				System.out.println("匿名内部类形式:");
				Object apples = null;
				ConsumerApple(apples, new Consumer<apple>() {

					
					@Override
					public void accept(apple t) {
						// TODO Auto-generated method stub
						//匿名内部类形式
						System.out.println(t);
					}
					

				});
	}
	private static void ConsumerApple(Object apples, Consumer<apple> consumer) {
		// TODO Auto-generated method stub
		
	}
}
