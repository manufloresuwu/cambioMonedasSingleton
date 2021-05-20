public class Cliente {

    public static void main(String[] args) {

        CelularSamsungR10 celularSamsungR10 = new CelularSamsungR10();
        celularSamsungR10.setTamanio("Grande");
        celularSamsungR10.setCpu("Snapdragon 905");
        celularSamsungR10.setMemory(64);
        celularSamsungR10.setSim(new Sim("Viva", 76890644));
        celularSamsungR10.setVersionAndroid("Oreo");
        celularSamsungR10.setCamara("Solo frontal");
        celularSamsungR10.setBluetooth("9.2");
        celularSamsungR10.setCantidadMemoriasExternas(128);
        celularSamsungR10.setTipoBateria("Litio no reciclable");
        celularSamsungR10.setAccesorios(new Accesorios(true, true, false));

        CelularSamsungR10 celular1 = (CelularSamsungR10) celularSamsungR10.clone();
        celularSamsungR10.setTamanio("Mediano");
        celularSamsungR10.setCpu("Snapdragon 855");
        celularSamsungR10.setMemory(8);
        celular1.setSim(new Sim("Tigo", 65789433));
        celularSamsungR10.setVersionAndroid("Kitkat");
        celularSamsungR10.setCamara("Ambas");
        celularSamsungR10.setBluetooth("9.4");
        celular1.setCantidadMemoriasExternas(512);
        celularSamsungR10.setTipoBateria("Litio biodegradable");
        celular1.setAccesorios(new Accesorios(true, true, true));

        CelularSamsungR10 celular2 = (CelularSamsungR10) celularSamsungR10.clone();
        celularSamsungR10.setTamanio("Mediano");
        celularSamsungR10.setCpu("Snapdragon 705");
        celularSamsungR10.setMemory(8);
        celular2.setSim(new Sim("Entel", 70098361));
        celular2.setVersionAndroid("Marshmallow");
        celularSamsungR10.setCamara("Solo trasera");
        celularSamsungR10.setBluetooth("7.0");
        celular2.setCantidadMemoriasExternas(16);
        celularSamsungR10.setTipoBateria("Litio reciclable");
        celular2.setAccesorios(new Accesorios(true, true, true));

        CelularSamsungR10 celular3 = (CelularSamsungR10) celularSamsungR10.clone();
        celularSamsungR10.setTamanio("Pequenio");
        celularSamsungR10.setCpu("Snapdragon 755");
        celularSamsungR10.setMemory(32);
        celular3.setSim(new Sim("Viva", 62379077));
        celular3.setVersionAndroid("KitKat");
        celularSamsungR10.setCamara("Solo trasera");
        celularSamsungR10.setBluetooth("4.3");
        celular3.setCantidadMemoriasExternas(8);
        celularSamsungR10.setTipoBateria("Litio");
        celular3.setAccesorios(new Accesorios(false, true, false));

        celular1.mostrarInfo();
        celular2.mostrarInfo();
        celular3.mostrarInfo();

    }
    
}