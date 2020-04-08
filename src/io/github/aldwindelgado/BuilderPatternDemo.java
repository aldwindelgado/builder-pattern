package io.github.aldwindelgado;

/**
 * This is a sample demonstration of how to apply the builder pattern
 *
 * @author Aldwin Delgado on Apr 08, 2020
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        // write your code here
        BuilderPattern.Builder builder = new BuilderPattern.Builder();

        BuilderPattern constructedBuilder = builder
            .setBread("Wheat")
            .setCondiments("Lettuce")
            .setDressing("Mayo")
            .setMeat("Turkey")
            .build();

        System.out.println(constructedBuilder.getBread());
        System.out.println(constructedBuilder.getCondiments());
        System.out.println(constructedBuilder.getDressing());
        System.out.println(constructedBuilder.getMeat());
    }
}
