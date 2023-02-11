package dhbw;

import java.math.BigInteger;

public class Calculator1 {

  /**
   * Add two numbers
   * @param a
   * @param b
   * @return
   */
  public BigInteger add(BigInteger a, BigInteger b) {
    BigInteger result = BigInteger.valueOf(0);
    try {
      result = a.add(b);
    } catch (ArithmeticException ex) {
      throw new ArithmeticException("Can't add values " + a + " and " + b);
    } catch (NullPointerException ex) {
      throw new NullPointerException("Can't add with null values");
    }
    return result;
  }

  /**
   * Substract two numbers
   * @param a
   * @param b
   * @return
   */
  public int substract(int a, int b) {
    return a-b;
  }

  /**
   * Divide two numbers
   * @param a
   * @param b
   * @return
   */
  public int divide(int a, int b) {
    return a/b;
  }

  /**
   * Multiply two numbers
   * @param a
   * @param b
   * @return
   */
  public int multiply(int a, int b) {
    return a*b;
  }

}
