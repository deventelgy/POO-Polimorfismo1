public class Main {
    public static void main(String[] args)
    {
        //probar (new Vehiculo());
        probar (new Avion());
        probar(new BicicletaElectrica());
    }
    public static void probar(Vehiculo v){
        v.encender();
    }
}