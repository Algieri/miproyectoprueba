package com.prueba;

public class Prueba {
	String nombre;
	int id;
	
	public Prueba(String nombre, int id){
		this.nombre = nombre;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		java.util.ArrayList<Prueba>array = new java.util.ArrayList<Prueba>();
		array.add(new Prueba("Algieri", 21));
		array.add(new Prueba("Caballo", 27));
		
		for (int i = 0; i < array.size(); i++) //wtf¿¿¿¿ esta vaina si esta fuckup no me aguanta esa sentencia
			System.out.println("Hello, bussines es bussiness ja" + array.get(i).getNombre());
	}
}
