public class Main {

  public static void main(String[] args) {
    // FinalClassPrivateConstructor fcpc = new FinalClassPrivateConstructor(); // error
    FinalClassPrivateConstructor fcpc = new FinalClassPrivateConstructor.JailBreak();
    System.out.println(fcpc.test());
  }
}
