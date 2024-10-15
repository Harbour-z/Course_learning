public class  FooCorporation{
  public static void main(String[] args) {
    double[] base_pay = {7.50, 8.20, 10.00};
    int[] hours = {35, 47, 73};
    for(int i=0;i<=2;i++){
      paid(base_pay[i], hours[i]);
    }
  }
  public static void paid(double base_pay, int hours) {
    double pay;
    if(base_pay < 8.00 || hours >60){
      System.out.println("error");
    }
    else if(hours >40){
      pay = base_pay * 40 +1.5*base_pay*(hours-40);
      System.out.println(pay);
    }
    else{
      pay = base_pay * hours;
      System.out.println(pay);
    }
  }
}
