public class Outer{

    String  name = "Jau";
    public void print() {
        System.out.println("My name is \t"+name);

    }

 /* public static class  Inner{
        public void println(){
            System.out.println("This is an inner class");
        }
  }*/
 public  class  Inner {
     public void println() {
         System.out.println("This is an inner class");
     }
  }

}
class Main{
public static void main(String[] args){
    Outer  m =new Outer();
    m.print();
    Outer.Inner  y=m.new  Inner();
    y.println();

   }
}