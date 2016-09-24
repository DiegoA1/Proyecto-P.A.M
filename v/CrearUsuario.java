package v;
import java.awt.event.KeyEvent;

import c.*;
public class CrearUsuario extends javax.swing.JFrame {
	private static final long serialVersionUID = 597936362306316356L;
	private javax.swing.JButton cancelar;
	private javax.swing.JButton crear;
	private javax.swing.JTextField fieldUsuario;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPasswordField passField;
	private javax.swing.JPasswordField passField2;

	public CrearUsuario() {
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		fieldUsuario = new javax.swing.JTextField();
		passField = new javax.swing.JPasswordField();
		jLabel3 = new javax.swing.JLabel();
		passField2 = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		crear = new javax.swing.JButton();
		cancelar = new javax.swing.JButton();

		setAlwaysOnTop(true);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		jLabel1.setText("Crear Usuario");

		jLabel2.setText("Usuario:");

		fieldUsuario.setColumns(16);
		fieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterKeyPressed(evt);
            }
        });

		passField.setColumns(16);
		passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	enterKeyPressed(evt);
            }
        });
		
		jLabel3.setText("Contraseña:");

		passField2.setColumns(16);
		passField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	enterKeyPressed(evt);
            }
        });
		jLabel4.setText("Vuelva a ingresar Contraseña:");

		crear.setText("Crear");
		crear.setMaximumSize(new java.awt.Dimension(60, 27));
		crear.setMinimumSize(new java.awt.Dimension(60, 27));
		crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });
		
		cancelar.setText("Cancelar");
		cancelar.setMaximumSize(new java.awt.Dimension(60, 27));
		cancelar.setMinimumSize(new java.awt.Dimension(60, 27));
		cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelarMouseClicked(evt);
			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		passField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		228,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel4)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										crear,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										100,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										cancelar,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										100,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						passField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						228,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						fieldUsuario,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						228,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(36, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														fieldUsuario,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														passField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														21,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														passField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														21,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(20, 20, 20)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														crear,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														cancelar,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		cancelar.getAccessibleContext().setAccessibleDescription("");

		pack();
	}

	private void crearMouseClicked(java.awt.event.MouseEvent evt) {
		secuenciaUsuario();
	}
	private void enterKeyPressed(java.awt.event.KeyEvent evt) {                                         
		if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        	secuenciaUsuario();
    	}
    }                                        
	
	private void cancelarMouseClicked(java.awt.event.MouseEvent evt){
		Login ventana = new Login();
		ventana.setVisible(true);
		this.setVisible(false);
		this.dispose();
	}
	
	private void secuenciaUsuario(){
		ControlLogin control = new ControlLogin(fieldUsuario.getText(),passField.getPassword(),passField2.getPassword());
		if(control.comprobarDatos()){
			control.guardarUser();
			Login ventana = new Login();
			ventana.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
	}
}
