package org.test.polymorfism;

public class Passport extends Document {
    void doPrint(){
        System.out.println("method from class org.test.Passport");
    }
    public static void main(String[] args) {
        Document d = new Passport();
        d.doPrint();
    }
}
