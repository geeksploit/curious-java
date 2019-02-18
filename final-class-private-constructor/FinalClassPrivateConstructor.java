/**
 * A private constructor may seem just enough to prevent instantiation.
 * It turns out, a class must also be 'final' to prohibit inheritance.
 * This is important because nested subclasses may instantiate superclass
 * and override its behavior effectively ignoring private constructor.
 * 
 * Declare this class 'final' to see the difference.
 */
class FinalClassPrivateConstructor {

  private FinalClassPrivateConstructor() {}
  
  public String test() {
    return "I honestly believe I am safe from instantiation and overriding by a child class.";
  }
  
  public static class JailBreak extends FinalClassPrivateConstructor {
  
    public JailBreak() {}

    public String test() {
      return super.test()
        + "\nBut in fact I can be instantiated and overriden."
        + "\nThat's why I need to be declared 'final' in the first place.";
    }
  }
}
