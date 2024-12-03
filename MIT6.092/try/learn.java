public class learn {
  public class  Baby {
    static int numBabie=0;
    String name;
    
  }
  static void doSomething(int x, int[] ys, Baby b) { 
    x = 99;
    ys[0] = 99;
    b.name = "99";
  }
  public static void main(String[] args) {
    learn a = new learn();
    int i=0;
    int[] j={0};
    Baby k = a.new Baby();
    doSomething(i,j,k);
    System.out.println(i);
    System.out.println(j[0]);
    System.out.println(k);
    int x=Integer.MAX_VALUE;
    System.out.println(
      x
    );
  }

  
  
}