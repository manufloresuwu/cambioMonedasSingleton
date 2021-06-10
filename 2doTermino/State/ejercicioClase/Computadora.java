package State.ejercicioClase;

public class Computadora {

    private IStateComputadora state;
    private ProgramasAbiertos programas;
    private MemoriaRam memoriaRam;
    private Cpu cpu;

    public void lista(){
        programas.listaProgramas();
    }

    public void request(){
        this.state.handler(this);
    }

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public String[] getListaProgramas(){
        return programas.getListaProgramas();
    }

    public ProgramasAbiertos getProgramas(){
        return programas;
    }

    public void setProgramas(ProgramasAbiertos programas) {
        this.programas = programas;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
