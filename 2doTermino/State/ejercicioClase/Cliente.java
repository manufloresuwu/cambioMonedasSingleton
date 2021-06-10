package State.ejercicioClase;

public class Cliente {

    public static void main(String []args){

        IStateComputadora state = new Apagado();
        Computadora computadora = new Computadora();
        IStateComputadora state1 = new Prendido();

        computadora.setState(state);
        computadora.request();
        computadora.setState(state1);
        computadora.request();
    }

}
