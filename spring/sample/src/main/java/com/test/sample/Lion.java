package com.test.sample;

public class Lion implements Animal {
   
        private String name;
        private int num;
     public Lion(){
     System.out.println("I am Lion");
    }
     public Lion(String string, int id){
      this.name=string;
      this.num=id;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
       
    }

    @Override
    public int getNum() {
        // TODO Auto-generated method stub
       return 23;
    }

    @Override
    public void setNum(int num) {
        // TODO Auto-generated method stub

    }
        public void behavior(){
            System.out.println("behvavior hunting");
    }
}
