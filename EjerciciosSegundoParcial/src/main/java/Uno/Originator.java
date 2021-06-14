package Uno;

public class Originator {

    private Tesis state;

    public void setState(Tesis state) {
        System.out.println("**** Set State *****");
        state.mostrarInfo();
        this.state = state;
    }

    public Version createVersion(){
        System.out.println("**** Create State *****");
        state.mostrarInfo();;
        return new Version(this.state) ;
    }

    public void restoreFromMemento(Version version){
        this.state=version.getState();
        System.out.println("**** State Restored *****");
        this.state.mostrarInfo();
    }

}
