package ru.mirea.practice.s23L0908.task9.task11;

class CelsiusToKelvin implements Convertable {
    private static final double KELVIN_OFFSET = 273.15;

    @Override
    public double convert(double temperature) {
        return temperature + KELVIN_OFFSET;
    }
}
