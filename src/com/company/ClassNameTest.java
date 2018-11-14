package com.company;

public class ClassNameTest {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[] { "Cab1011G", "Acc1234H", "Pabc5555I"};
    public static final String[] invalidClassName = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Account is " + className +" is valid: "+ isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Account is " + className +" is valid: "+ isvalid);
        }
    }
}
