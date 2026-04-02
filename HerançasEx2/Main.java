package HerançasEx2;

class Veiculo{
    String marca;
    String modelo;
}

class Carro extends Veiculo{ 
    int portas;
}

class Moto extends Veiculo{
    int cilindradas;
}


public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        Moto mot = new Moto();

        car.marca = "BMW";
        car.modelo = "M8";
        car.portas = 2;

        mot.marca = "DUCATI";
        mot.modelo = "MONSTER";
        mot.cilindradas = 937;

        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.portas);
        System.out.println("");
        System.out.println(mot.marca);
        System.out.println(mot.modelo);
        System.out.println(mot.cilindradas);

    }
}
