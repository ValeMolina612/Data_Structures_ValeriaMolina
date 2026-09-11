public class Calculos {
    private float suma;
    private float resta;
    private float multi;
    private float dividir;
    private float porcentaje;

    public Calculos(float suma,float resta,float multi ,float dividir ,float porcentaje ){
        this.suma = suma;
        this.resta = resta;
        this.multi = multi;
        this.dividir = dividir;
        this.porcentaje = porcentaje;
    }

    public float getsuma(){
        return suma;
    }

    public float getresta(){
        return resta;
    }

    public float getmulti(){
        return multi;
    }

    public float getdividir(){
        return dividir;
    }

    public float getporcentaje(){
        return porcentaje;
    }
}