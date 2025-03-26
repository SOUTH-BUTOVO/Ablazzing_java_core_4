package com.javaacademy.core.lesson9.ex2;

public class Runner {
    public static void main(String[] args) {
//        Hand leftHand = new Hand();
//        Hand rightHand = new Hand();

//        Human human = new Human(leftHand, rightHand);
        Human human = new Human();
        Human.Hand leftHand = human.getLeftHand();
        human = null;
        System.out.println(leftHand);
    }
}
