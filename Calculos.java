public class Calculos {
    private float suma;
    private float resta;
    private float multi;
    private float dividir;
    private float porcentaje;

    public Calculos(float a, float b) {
        this.suma = a + b;
        this.resta = a - b;
        this.multi = a * b;
        this.dividir = (b != 0) ? (a / b) : 0;
        this.porcentaje = (a * b) / 100;
    }

    public float getsuma() {
        return suma;
    }

    public float getresta() {
        return resta;
    }

    public float getmulti() {
        return multi;
    }

    public float getdividir() {
        return dividir;
    }

    public float getporcentaje() {
        return porcentaje;
    }

   
    public static void main(String[] args) {
        // Creamos un objeto mandando los numeros
        Calculos calc = new Calculos(10, 5);

        System.out.println("Suma: " + calc.getsuma());
        System.out.println("Resta: " + calc.getresta());
        System.out.println("Multiplicación: " + calc.getmulti());
        System.out.println("División: " + calc.getdividir());
        System.out.println("Porcentaje: " + calc.getporcentaje());
    }
}