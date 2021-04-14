package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	// ATRIBUTOS
	String nombre;
	String ubicacion;
	ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	// CONSTRUCTOR
	public Zoologico(){}
	
	public Zoologico(String nombre,String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.ubicacion = ubicacion;
	}
	
	// MÉTODOS
	public int cantidadTotalAnimales(){
		int totalanimales = 0;
		
		for (Zona zona: zonas) {
			totalanimales += zona.getAnimales().size();
			}
		
		return totalanimales;	
	}
	
	public void agregarZonas(Zona zone) {this.zonas.add(zone);}
	
	// GETTERS Y SETTERS
	public String getNombre() {return this.nombre;}

	public ArrayList<Zona> getZona() {return zonas;}
}
