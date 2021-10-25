
//Estado
public class coche {
    private String color;
    private int velocidad;  
    private float tamano;   
    private Rueda [] ruedas;
    private Motor motor;

//constructor
    
    public String getcolor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getvelocidad(){
        return velocidad;
    }
    public void setVelocidad (int velocidad){
        this.velocidad = velocidad;
    }
    public float  gettamano (){
        return tamano;
    }
    public void setTamano (float tamano){
        this.tamano = tamano;
    }
    public Rueda[] getRuedas (){
        return ruedas;
    }
    public void  setRuedas (Rueda[] ruedas){
        this.ruedas = ruedas;
    }
    public coche (String color, int velocidad, float tamano, Rueda [] ruedas, Motor motor){
        this.color = color;
        this.velocidad = velocidad;
        this.tamano = tamano;    
        this.ruedas = ruedas;
        this.motor = motor;
    }

// comportamiento
    public void avanzar (){
        motor.inyectarCarburante(); 
        for (int i= 0; i < ruedas.length; i++) {
            ruedas[i].girar();
            
        }
    }
    public void girarIzquierda (){}
    public void parar (){}
    public void girarDerecha (){}  
//    
    public static void main(String[] args) {
        Rueda [] ruedas =   {
            new Rueda(20, "Dunlop"),
            new Rueda(21, "Dunlop"),
            new Rueda(22, "Dunlop"),
            new Rueda(23, "Dunlop")};
            
        coche micoche = new coche ("verde", 80 ,3.2f, ruedas, new Motor("Diesel", 100) );         
        
    System.out.println(micoche.getcolor());
    System.out.println(micoche.gettamano());
    System.out.println(micoche.getvelocidad());
    System.out.println(micoche.getRuedas());
    ;
    }
}


