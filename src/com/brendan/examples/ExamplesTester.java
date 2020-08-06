package com.brendan.examples;
import com.brendan.project.Human;

public class ExamplesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human steve = new Human("steve");
		Wizard gandalf = new Wizard("Gandalf");
		
		steve.sayName().showHealth();
		gandalf.sayName().showHealth();
		
		steve.takeAttack(gandalf);
		
		System.out.println(Human.totalHumans());
	}

}
