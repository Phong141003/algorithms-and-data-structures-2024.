package ru.mirea.practice.s23L0908.prog3;

public abstract class Main {
    public static void main(String[] args) {
        Cars car = new Cars("VAG", "Black");
        System.out.println(car);

        car.getName();

        System.out.println(car.getColor()); // непосредственный вызов
        car.setColor("white");
        System.out.println(car.color); // так как полепубличное, то доступен вызов из другх классов
    }
}
