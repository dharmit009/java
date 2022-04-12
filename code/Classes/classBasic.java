class Test {
  public void display(String name){
    System.out.println("Hello, " + name + "!!");
  }
}

class classBasic{
  public static void main(String args[]){
    Test t1 = new Test();
    t1.display("Tester");

    Test t2 = new Test();
    t2.display("Examiner");
  }
}
