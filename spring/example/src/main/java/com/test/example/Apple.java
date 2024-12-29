package com.test.example;



public class Apple implements Fruit {
    public Apple(){
        System.out.println("Apple is a fruit");
    }
    private Vegetable vegetable;
    private Tomato tomato;
   
    

    public Vegetable getVegetable() {
        return vegetable;
    }

    public void setVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
    }
    public void Color(){
        tomato.dis();
        vegetable.sim();
        System.out.println("Apple color is red");
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
        
    }
}
