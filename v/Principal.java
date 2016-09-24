package v;
import java.awt.event.KeyEvent;

import c.*;

public class Principal extends javax.swing.JFrame {
	
	private static final long serialVersionUID = -3954463658555150701L;
	private String usuario;
	private BaseDatos db;      
    private javax.swing.JScrollPane jScrollPane2;            
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JTable Tabla;
    private javax.swing.table.DefaultTableModel modelo;
	public Principal(String usuario) {
		this.usuario = usuario;
		db = new BaseDatos(this.usuario);
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Tabla.getModel();
        setModel();
    }
	@SuppressWarnings("serial")
	private void initComponents() {

        TabPanel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                    "Descripcion", "Fuente/Destino", "Ingreso", "Egreso", "Saldo"
                }	
            ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            
        });
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);
        Tabla.getAccessibleContext().setAccessibleDescription("");

        TabPanel.addTab("Manejo Saldo", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        TabPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void TablaKeyReleased(java.awt.event.KeyEvent evt) {   
    	if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    		añadirADb();
    		crearFila();
    	}
    }
    private void añadirADb(){
    	String desc = String.valueOf(Tabla.getModel().getValueAt(Tabla.getRowCount()-1, 0));
    	String dest = String.valueOf(Tabla.getModel().getValueAt(Tabla.getRowCount()-1, 1));
    	String ingreso = String.valueOf(Tabla.getModel().getValueAt(Tabla.getRowCount()-1, 2));
    	String egreso =  String.valueOf(Tabla.getModel().getValueAt(Tabla.getRowCount()-1, 3));
		db.añadeDatos(desc, dest,  Integer.parseInt(ingreso), Integer.parseInt(egreso));
    }
    private void crearFila(){
    	modelo.addRow(new Object[]{null,null,0,0,db.lastSaldo()});
    }
    private void setModel(){
    	for(int x=0;x<db.getCantFilas();x++){
    		modelo.addRow(db.entregarFila(x));
    	}
    }
}
