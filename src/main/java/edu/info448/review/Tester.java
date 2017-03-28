package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

		Husky myHusky = new Husky("uw");
		myHusky.bark();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

//		Dog v1 = new Husky();
//		Husky v2 = (Husky) new Dog();
//		Huggable v2 = new Husky();
//		Huggable v3 = (Husky) new TeddyBear();
//		Husky v4 = new TeddyBear();

		Dog v1 = new Husky("uwHusky");
		Husky v2 = (Husky)v1; //legal casting
	}
}