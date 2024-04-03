public class Main {
  public static void main(String[] args) {
    double temperature = 20;
    
    if (temperature <= 5) {
      System.out.println("You need wear super warm");
    }
    else if (temperature <= 5){
      System.out.println("You need wear warm");
    }
    else if (temperature <= 15){
      System.out.println("You need wear normal");      
    }
    else if (temperature <= 30 ){
      System.out.println("You need cooling");
    }
    else{
      System.out.println("Invalid data");
    }
  }
}
