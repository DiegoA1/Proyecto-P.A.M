package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {
	private Connection con;
	private ResultSet rs;
	private Statement cmd;
	private String usuario;

	public BaseDatos(String usuario) {
		this.usuario = usuario;
		conectar();
		try {
			cmd.executeUpdate("CREATE TABLE IF NOT EXISTS "+usuario+" (" +
					"id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
					" descripcion VARCHAR(50), " +
					"destino VARCHAR(20), " +
					"ingreso INT, " +
					"egreso INT, " +
					"saldo INT);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}

	private void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/datos?",
					"root", "daniel980");
			cmd = con.createStatement();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		} catch (InstantiationException e) {
			System.err.print("Can't instance");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.err.print("Illegal Access");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.print("Not found");
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (cmd != null) {
				cmd.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void añadeDatos(String desc, String dest, int ingreso, int egreso) {
		int saldo = 0;
		conectar();
		try {
			rs = cmd.executeQuery("SELECT saldo FROM " + usuario + ";");
			if (rs.next()) {
				rs.absolute(-1);
				saldo = rs.getInt("saldo");
			}
			saldo += ingreso;
			saldo -= egreso;
			cmd.executeUpdate("INSERT INTO "+usuario
					+ "(descripcion,destino,ingreso,egreso,saldo)"
					+ "VALUES ('" + desc + "','" + dest + "','" + ingreso
					+ "','" + egreso + "','" + saldo + "');");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}

	public void eliminarFila(int id) {
		conectar();
		try {
			cmd.executeUpdate("DELETE FROM "+usuario+" WHERE id = " + id + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}
	public int lastSaldo(){
		int lastSaldo = 0;
		if(getCantFilas()!=0){
			conectar();
			try {
				rs = cmd.executeQuery("SELECT id, saldo FROM "+usuario+" ORDER BY id DESC LIMIT 1");
				rs.next();
				lastSaldo = rs.getInt("saldo");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close();
		}
		return lastSaldo;
	}
	public Object[] entregarFila(int id){
		String desc=null;
		String dest=null;
		String ingreso=null;
		String egreso=null;
		String saldo=null;
		conectar();
		try {
			rs = cmd.executeQuery("SELECT * FROM "+usuario+";");
			rs.first();
			rs.absolute(id+1);
			desc = rs.getString("descripcion");
			dest = rs.getString("destino");
			ingreso = rs.getString("ingreso");
			egreso = rs.getString("egreso");
			saldo = rs.getString("saldo");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(desc.equals("null")){
			desc = "";
		}
		if(dest.equals("null")){
			dest = "";
		}
		Object[] objeto = {desc,dest,ingreso,egreso,saldo};
		close();
		return objeto;
	}
	public int getCantFilas(){
		conectar();
		int x = 0;
		try {
			rs = cmd.executeQuery("SELECT COUNT(*) FROM "+ usuario+";");
			rs.next();
			x = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return x;
	}
}
