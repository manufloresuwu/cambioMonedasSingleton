public class CelularSamsungR10 implements ICelularSamsungR10{

    private String tamanio;
    private String cpu;
    private int memory;
    private Sim sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private int cantidadMemoriasExternas;
    private String tipoBateria;
    private Accesorios accesorios;

    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public Sim getSim() {
        return sim;
    }
    public void setSim(Sim sim) {
        this.sim = sim;
    }
    public String getVersionAndroid() {
        return versionAndroid;
    }
    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }
    public String getCamara() {
        return camara;
    }
    public void setCamara(String cámara) {
        this.camara = cámara;
    }
    public String getBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    public int getCantidadMemoriasExternas() {
        return cantidadMemoriasExternas;
    }
    public void setCantidadMemoriasExternas(int cantidadMemoriasExternas) {
        this.cantidadMemoriasExternas = cantidadMemoriasExternas;
    }
    public String getTipoBateria() {
        return tipoBateria;
    }
    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }
    public Accesorios getAccesorios() {
        return accesorios;
    }
    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        CelularSamsungR10 objClone = new CelularSamsungR10();
        objClone.setTamanio(this.tamanio);
        objClone.setCpu(this.cpu);
        objClone.setMemory(this.memory);
        objClone.setSim(this.sim);
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setCamara(this.camara);
        objClone.setBluetooth(this.bluetooth);
        objClone.setCantidadMemoriasExternas(this.cantidadMemoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.setAccesorios(this.accesorios);
        return objClone;
    }

    public void mostrarInfo() {
        System.out.println("Caracteristicas");
        System.out.println("Tamaño: " + tamanio);
        System.out.println("CPU: " + cpu);
        System.out.println("Memoria: " + memory + " GB");
        System.out.println("Numero de telefono: " + sim.getNumeroTelefono());
        System.out.println("Empresa telefonica: " + sim.getEmpresa());
        System.out.println("Version de Android: " + versionAndroid);
        System.out.println("Camara: " + camara + " Megapixeles");
        System.out.println("Version de Bluetooth: "+ bluetooth);
        System.out.println("Memorias externas: " + cantidadMemoriasExternas + " GB");
        System.out.println("Tipo de bateria: " + tipoBateria);

        if (accesorios.getAudifono()) {
            System.out.println("Viene con audifono");
        } else {
            System.out.println("No viene audifono");
        }

        if (accesorios.getCargador()) {
            System.out.println("Viene con cargador");
        } else {
            System.out.println("No viene cargador");
        }

        if (accesorios.getEstuche()) {
            System.out.println("Viene con estuche");
        } else {
            System.out.println("No viene estuche");
        }

    }

}