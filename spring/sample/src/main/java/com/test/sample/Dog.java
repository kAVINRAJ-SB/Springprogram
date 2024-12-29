package com.test.sample;

public class Dog implements Animal {

  private String name;
  private int num;
  private Myclass myclass;

  public Dog() {
    System.out.println("I am Dog");
  }

  public Dog(String string, int id) {
    this.name = string;
    this.num = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Myclass getMyclass() {
    return myclass;
  }

  public void setMyclass(Myclass myclass) {
    this.myclass = myclass;
  }

  public void behavior() {
    myclass.display();
    System.out.println("behavior protect the trainer");
  }
}
