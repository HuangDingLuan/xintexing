package ������;

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
	  @Override
	    public String toString() {
	        return "ƻ��{" +"��ɫ='" + color + '\'' + ", ����=" + weight +'}';            
	    }
	
	 public static void consumerApple(apple[] apples, Consumer<apple> consumer) {
	        for (apple apple : apples) {
	            consumer.accept(apple);
	        }
	    }

	    public static void main(String[] args) {
	        apple[] apples = {new apple("red", 4)};
	        // �ڲ���
	        consumerApple(apples, new Consumer<apple>() {
	            @Override
	            public void accept(apple apple) {
	                System.out.println(apple);
	            }
	        });
	        // ʹ��lambda���ʽ
	        consumerApple(apples, (apple) -> System.out.println(apple));


	    }
	}
