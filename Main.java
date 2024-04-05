abstract class Monster {
 public abstract void attack();
 public abstract void defend();
}
class Godzilla extends Monster{
 public void attack(){
  System.out.println("Godzilla attacks with blue blast!");
 }
 public void defend(){
  System.out.println("Godzilla defends with its feet!");
 }
}
class Main{
  public static void main(String[] args){
   Godzilla sean = new Godzilla();
   sean.attack();
   sean.defend();
 }
}


//
