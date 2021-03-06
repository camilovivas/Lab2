package model;
public class Ambiente{
	
	//Atributos
	private double area;
	
	//relaciones
	private Canguro c1;
	private Canguro c2;
	private Canguro c3;
	
	//Metodos
	public Ambiente (double area, Canguro c1, Canguro c2, Canguro c3) {
		this.area = area;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		
	}
	
	public double getArea() {
		return getC1().getAreaCanguro() + getC2().getAreaCanguro() + getC3().getAreaCanguro();   //getC2().getHeight()*8 getC3().getHeight()*8
	}
	public void setArea (double area) {
		this.area = area;
	}
	
	
	public Canguro getC1() {
		return c1;
	}
	public void setC1 (Canguro c1){
		this.c1 = c1;
	}
	
	
	public Canguro getC2() {
		return c2;
	}
	public void setC2 (Canguro c2){
		this.c2 = c2;
	}
	
	
	public Canguro getC3() {
		return c3;
	}
	public void setC3 (Canguro c3){
		this.c3 = c3;
	}
	public String showinfoAmbiente(){
		String mensaje = ("");
		
		mensaje += ("el area del ambiente es:"+"\n"+getArea());
		
		
		return mensaje;
		
	}
	public boolean verificarSiExiten(){
		boolean existe = false;
		if (getC1() != null || getC2() != null || getC3() != null ){
			existe = true;
		}
	return existe;
	}
	public String vCanguro(){
		String mensaje= (" ");
			
		mensaje += getC1().printName();
		mensaje += getC2().printName();
		mensaje += getC3().printName();
		
		return mensaje;

	}
	public double comida(){
		double eat = 0;
		eat += getC1().calcularComida();
		eat += getC2().calcularComida();
		eat += getC3().calcularComida();
		return eat;
	}
	
}