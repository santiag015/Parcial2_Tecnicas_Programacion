public class Vuelo {
    //Atributos
    private String origen; 
    private String destino;
    private int numVuelo;  
    private int fecha; 
    private int horaSalida; 
    private int pasajeros ; 
    //Atributos
    
    public Vuelo (String origen, String destino){
        this.origen=origen;
        this.destino=destino;
    }
    
    public Vuelo (int numVuelo, int fecha, int horaSalida, int pasajeros){
        this.numVuelo=numVuelo;
        this.fecha=fecha;
        this.horaSalida=horaSalida;
        this.pasajeros=pasajeros;
        
    }
    
    
    
    
    
    
    
    
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
 
    
    
    
    
    
}
