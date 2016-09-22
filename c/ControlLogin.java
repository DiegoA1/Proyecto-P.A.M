package c;

public class ControlLogin {
	private String user;
	private String pass;
	private Archivo archivo;
	private String[] base;
	public ControlLogin(String user,char[] pass){
		this.pass = charString(pass);
		archivo = new Archivo("/home/ryuuji/workspace/P.A.M/src/archivos/users");
		base = archivo.entregarProcesado();
		this.user = user;
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

}
