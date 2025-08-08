// Clase base
class Vehiculo {
    private String marca;  // Atributo privado
    private String modelo; // Atributo privado

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método encender (virtual)
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

// Clase hija Auto
class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " está encendido.");
    }
}

// Clase hija Motocicleta
class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " está encendida.");
    }
}

// Clase principal
public class main {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Ford", "Raptor");
        Vehiculo miMoto = new Motocicleta("Pulsar", "RM200");

        miAuto.encender();  // Salida: El auto Ford Raptor está encendido.
        miMoto.encender();  // Salida: La motocicleta Pulsar RM200 está encendida.
    }
}
