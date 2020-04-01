
package figura;

public class circulo { // definimos las 3 variables que vamos a necesitar que son de tipo  double.
    private double centrox;
    private double centroy;
    private double radio;
    
    public circulo(){
    
    }
    
    public circulo (double centrox,double centroy,double radio){
    this.centrox = centrox;
    this.centroy = centroy;
    this.radio = radio;
    }
    public double getcentrox(){ //creamos la varaible  get
    return centrox;
    }
    public void setcentrox(double centrox){//creamos la varaible  set
    this.centrox = centrox;
    }
    public double getcentroy(){ //creamos la varaible  get de centro y
    return centroy;
    }
    
    public void setcentroy(double centroy){ //creamos la varaible  set de centro y
    this.centroy =centroy;
    }
    
    public double getRadio(){ //creamos la varaible  get de radio
    return radio;
    }
    
    public void setRadio(double radio){ //creamos la varaible  set de radio
    this.radio = radio;
    }
    
    @Override
    public String toString(){
    return "Circulo (" + "centrox" +centrox + ", centroy" +centroy+", radio"+radio +")"; //concatenamos para ppoder ver el resultado mejor posteriormente.
    }
    
    public double perimetroCirculo(){  //calculamos el perimetro
    return 2 * Math.PI * this.radio;
    }
    
    public double areaCirculo(){ //calculamos el area
    return Math.PI * Math.pow (this.radio,2);
    }
    
    public void movercirculo(double deltax,double deltay){
    this.centrox = this.centrox +deltax;
    this.centroy =this.centroy +deltay;
    } //hacemnso al funcion de mover el circulo
    public void escalaCirculo (double s){ // y l mas importante la de escalarq ue nso pide en el enunciado
    this.radio =this.radio * s;
    }
    
}

