package com.example.demo.interfaces;

/**
 * Java interfaces provide a way to define a contract or blueprint for classes to implement. In addition to methods, interfaces can also include variables.
 * variable is implicitly public, static, and final.So need to assign a value
 * An interface can contain methods without a body : Abstract Methods
 * An interface can have static methods
 * An interface with exactly one abstract method is called a functional interface.
 * Interfaces can extend other interfaces, inheriting their abstract methods.
 * Interfaces cannot have constructors because they cannot be instantiated directly.
 * Marker interfaces contain no methods and serve as a single or metadata : Example: Serializable, Cloneable
 */
public class InterfaceUsage {

    public static void main(String[] args) {
        Currency dollar = new Dollar();
        Currency euro = new Euro();

        double amount = 100;
        System.out.println("Amount in dollars: " + dollar.convertToUSD(amount) + Currency.SYMBOL);
        System.out.println("Amount in euros: " + euro.convertToUSD(amount) + Currency.SYMBOL);
    }
}
