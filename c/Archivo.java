package c;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Archivo {
	private RandomAccessFile arch;
	private String ruta;
	private Cifrador cifrador;
	public Archivo(String ruta){
		this.ruta = ruta;
		cifrador = Cifrador.getInstance();
	}
	public RandomAccessFile getArch() {
		return arch;
	}
	public void setArch(RandomAccessFile arch) {
		this.arch = arch;
	}
	public String leerArchivo(){
		String cadena;
		String cadenaFinal = "";
		try {
			arch = new RandomAccessFile(ruta,"rw");
		} catch (FileNotFoundException e) {
			System.out.println("error al crear");
		}
		try {
			while((cadena = arch.readLine())!=null)	{
				cadenaFinal += cadena+"\n";
			}
			arch.close();
		} catch (IOException e) {
			System.out.println("error al leer");
		}
		cadenaFinal = cifrador.descifrar("1923", cadenaFinal);
		return cadenaFinal;
	}
	public void escribirArchivo(String linea){
		try {
			arch = new RandomAccessFile(ruta,"rw");
		} catch (FileNotFoundException e) {
			System.out.println("error al crear");
		}
		try {
			arch.setLength(0);
			linea = cifrador.cifrar("1923", linea);
			arch.writeBytes(linea);
			arch.close();
		} catch (Exception e) {
			System.out.println("error al escribir");
		} 
	}
	public String[] entregarProcesado(){
		String texto = this.leerArchivo();
		String[] datos = texto.split("\n");
		return datos;
	}
}
