public class BicicletaElectrica extends Vehiculo{

    public void prenderPantalla(){
        System.out.println("Pantalla encendida");
    }
    public void energizarMotor(){
        System.out.println("Motor listo");
    }
    @Override
    public void encender(){
        System.out.println("BicicletaElectrica encendido");
    }

}
