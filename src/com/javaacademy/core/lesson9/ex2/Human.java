package com.javaacademy.core.lesson9.ex2;

public class Human {
    private Hand leftHand = new Hand();
    private Hand rightHand = new Hand();

//    public Human(Hand leftHand, Hand rightHand) {
//        this.leftHand = leftHand;
//        this.rightHand = rightHand;
//    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public class Hand {

    }

    @Override
    public String toString() {
        return "Human{" + "leftHand=" + leftHand + ", rightHand=" + rightHand + '}';
    }
}
