package ru.mirea.practice.s23L0908.task5;

public abstract class Main {
    public static void main(String[] args) {
        StringManipulator sm = new StringManipulatorClass();


        String testString = "Hello, World!";

        int charCount = sm.countCharacters(testString);
        System.out.println("Количество символов в строке: " + charCount);

        String oddPositionChars = sm.getOddPositionCharacters(testString);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = sm.reverseString(testString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
