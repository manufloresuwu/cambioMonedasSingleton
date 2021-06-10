package State.ejercicioClase;

public class Prendido implements IStateComputadora{

    public Prendido(){}

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Prendido **");
        int random = (int)(Math. random()*10+1);
        computadora.setMemoriaRam(new MemoriaRam(random * 5));
        computadora.setCpu(new Cpu(random * 5));
        computadora.setProgramas(new ProgramasAbiertos(random));
        System.out.println("%CPU:"+computadora.getCpu().getPercentageUse());
        System.out.println("%Memoria:"+computadora.getMemoriaRam().getPercentageUse());
        System.out.println("Programas abiertos:"+computadora.getProgramas().getNumero());
        System.out.println("********");
    }

}
