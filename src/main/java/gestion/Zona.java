package gestion;

import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	
	// ATRIBUTOS
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	// CONSTRUCTOR
	public Zona(){}
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	
	// MÉTODOS
	public ArrayList<Animal> getAnimales() {return animales;}
	
	public int cantidadAnimales(){return animales.size();}
	
	public void agregarAnimales(Animal anim) {animales.add(anim);}
	
	// GETTERS Y SETTERS
	public String getNombre() {return this.nombre;}
	
	public Zoologico getZoo() {return this.zoo.get(0);}
}
