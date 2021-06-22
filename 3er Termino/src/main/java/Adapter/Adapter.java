package Adapter;

public class Adapter implements IAdapterEmp1 {

    public Adapter(IAdapterEmp2 adapter) {
        super();
        this.adapter = adapter;
    }

    IAdapterEmp2 adapter;

    public IAdapterEmp2 getAdapter() {
        return adapter;
    }

    public void setAdapter(IAdapterEmp2 adapter) {
        this.adapter = adapter;
    }

    @Override
    public void precio() {
        System.out.println("Adaptando el costo a precio...");
        adapter.costo();
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Adaptando la garantía al tiempo de vida del producto...");
        adapter.costo();
    }

}