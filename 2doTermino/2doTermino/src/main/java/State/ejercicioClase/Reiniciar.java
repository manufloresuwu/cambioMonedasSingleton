package State.ejercicioClase;

public class Reiniciar implements IStateComputadora{

    public Reiniciar(){}

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando **");
        //int random = (int)(Math. random()*10+1);
        computadora.setMemoriaRam(new MemoriaRam(0));
        computadora.setCpu(new Cpu(0));
        computadora.setProgramas(new ProgramasAbiertos(0));
        System.out.println("%CPU:"+computadora.getCpu().getPercentageUse());
        System.out.println("%Memoria:"+computadora.getMemoriaRam().getPercentageUse());
        System.out.println("Programas abiertos:"+computadora.getProgramas().getNumero());
        System.out.println("********");
    }

}
