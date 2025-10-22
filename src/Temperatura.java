package atividade01T02;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("A temperatura não pode ser menor que -273.15°C (zero absoluto)!");
        }
        this.celsius = celsius;
    }

    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double paraKelvin() {
        return celsius + 273.15;
    }

    public void mostrarConversoes() {
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + paraFahrenheit() + "°F");
        System.out.println("Temperatura em Kelvin: " + paraKelvin() + "K");
    }

}
