package edu.info448.review;

/**
 * Created by Leon on 3/28/17.
 */

public class Husky extends Dog implements Huggable {
    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {
        System.out.println("pullSled!!");
    }

    public void hug() {
        System.out.println("Hug!!");

    }

    public void bark() {
        System.out.println(this +" says: woof!");
    }
}
