package c;

public class ControlLogin {
	private String user;
	private String pass;
	private String pass2;
	private Archivo archivo;
	private String[] base;
	public ControlLogin(String user,char[] pass){
		this.pass = charString(pass);
		this.pass2 = this.pass;
		archivo = new Archivo("/home/ryuuji/workspace/P.A.M/src/archivos/users");
		base = archivo.entregarProcesado();
		this.user = user;
	}
	public ControlLogin(String user, char[] pass1, char[] pass2){
		this.pass = charString(pass1);
		this.pass2 = charString(pass2);
		this.user = user;
		archivo = new Archivo("/home/ryuuji/workspace/P.A.M/src/archivos/users");
		base = archivo.entregarProcesado();
	}
	public boolean compUser(){
		for(int x = 0; x < base.length; x +=3){
			if(base[x].equals(user)&&base[x+1].equals(pass)){
				return true;
			}
		}
		return false;
	}
	private String charString(char[] text){
		String resultado = "";
		for(int x = 0; x < text.length; x++){
			resultado+=text[x];
		}
		return resultado;
	}
	public boolean comprobarDatos(){
		if(pass.equals(pass2)&&(user.length()>4 && pass.length()>4)&&!buscarUser()){
			return true;
		}else if(!pass.equals(pass2)){
			javax.swing.JOptionPane.showMessageDialog(null, "Las contraseñas son distintas",null,javax.swing.JOptionPane.ERROR_MESSAGE);
		}else if(user.length()<=4){
			javax.swing.JOptionPane.showMessageDialog(null, "El usuario es muy corto",null,javax.swing.JOptionPane.ERROR_MESSAGE);
		}else if(pass.length()<=4){
			javax.swing.JOptionPane.showMessageDialog(null, "La contraseña es muy corta",null,javax.swing.JOptionPane.ERROR_MESSAGE);
		}else if(buscarUser()){
			javax.swing.JOptionPane.showMessageDialog(null, "El usuario ya existe", null, javax.swing.JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
	public boolean buscarUser(){
		for(int x = 0; x < base.length;x+=3){
			if(base[x].equals(user)){
				return true;
			}
		}
		return false;
	}
	public void guardarUser(){
		String lista = archivo.leerArchivo();
		lista += user +"\n"+ pass + "\n-\n";
		archivo.escribirArchivo(lista);
		
	}
}
