package m;

import c.Archivo;

public class Prueba {
	public static void main(String[] args) {
		Archivo arch = new Archivo("/home/ryuuji/workspace/P.A.M/src/general/archivos/archivo");
		String archivo = arch.leerArchivo();
		String[] datos = archivo.split("\n");
		System.out.println("|descripcion|motivo|ingreso|egreso|saldo|");
		for(int x = 0; x <datos.length; x++){
			if(!datos[x].equals("-")){
				System.out.print("|"+datos[x]);
			}else{
				System.out.println("|");
			}
		}
	}
}
