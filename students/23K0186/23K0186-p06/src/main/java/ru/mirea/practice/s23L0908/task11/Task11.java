package ru.mirea.practice.s23L0908.task11;

public abstract class Task11  {
    public static void main(String[] args) {
        Converter cvt = new Converter();
        double celsius = 20.0;
        System.out.println("Celsius=" + celsius);
        System.out.println("Celsius=" + cvt.kelvin(celsius));
        System.out.println("Celsius=" + cvt.farenheit(celsius));
    }
}
