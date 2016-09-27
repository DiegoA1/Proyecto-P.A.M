package v;

import java.awt.event.KeyEvent;

import c.ControlLogin;
/**
 * Esta clase contiene la gui de el login del programa
 * 
 * 
 */

public class Login extends javax.swing.JFrame {

	private static final long serialVersionUID = 289708761464425299L;
	/**JLabel crear usuario*/
	private javax.swing.JLabel crearUsuario;
	/**JTextField en el que se ingresa el usuario*/
	private javax.swing.JTextField fieldUsuario;
	/**JButton correspondiente a la accion de ingresar*/
	private javax.swing.JButton ingresar;
	private javax.swing.JInternalFrame jInternalFrame1;
	private javax.swing.JInternalFrame jInternalFrame2;
	/**JLabel usuario:*/
	private javax.swing.JLabel jLabel1;
	/**JLabel contraseña:*/
	private javax.swing.JLabel jLabel2;
	/**JLabel Bienvenido a P.A.M:*/
	private javax.swing.JLabel jLabel4;
	/**JPassField en el que se ingresa la contraseña*/
	private javax.swing.JPasswordField passField;
	/**JButton correspondiente a la accion de salir*/
	private javax.swing.JButton salir;

	/**
	 * Constructor que inicia los componentes
	 */
	public Login() {
		initComponents();
	}

	/**
	 * Inicia los componentes visuales y sus caracteristicas
	 */
	private void initComponents() {

		jInternalFrame1 = new javax.swing.JInternalFrame();
		jInternalFrame2 = new javax.swing.JInternalFrame();
		fieldUsuario = new javax.swing.JTextField();
		passField = new javax.swing.JPasswordField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		ingresar = new javax.swing.JButton();
		salir = new javax.swing.JButton();
		crearUsuario = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		jInternalFrame1.setVisible(true);

		javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(
				jInternalFrame1.getContentPane());
		jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
		jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 389, Short.MAX_VALUE));
		jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 273, Short.MAX_VALUE));

		jInternalFrame2.setVisible(true);

		javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(
				jInternalFrame2.getContentPane());
		jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
		jInternalFrame2Layout.setHorizontalGroup(jInternalFrame2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 365, Short.MAX_VALUE));
		jInternalFrame2Layout.setVerticalGroup(jInternalFrame2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 171, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("P.A.M Login");
		setAlwaysOnTop(false);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setResizable(false);

		fieldUsuario.setColumns(16);
		fieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				evKeyReleased(evt);
			}
		});

		passField.setColumns(16);
		passField.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				evKeyReleased(evt);
			}
		});

		jLabel1.setText("Usuario:");

		jLabel2.setText("Contraseña:");

		ingresar.setText("Ingresar");
		ingresar.setMaximumSize(new java.awt.Dimension(60, 27));
		ingresar.setMinimumSize(new java.awt.Dimension(60, 27));
		ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ingresarClick(evt);
			}
		});

		salir.setText("Salir");
		salir.setMaximumSize(new java.awt.Dimension(100, 27));
		salir.setMinimumSize(new java.awt.Dimension(100, 27));
		salir.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				salirClick(evt);
			}
		});

		crearUsuario.setBackground(new java.awt.Color(62, 167, 254));
		crearUsuario.setForeground(new java.awt.Color(62, 167, 254));
		crearUsuario.setText("Crear usuario nuevo");
		crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				crearUsuarioClick(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
		jLabel4.setText("Bienvenido a P.A.M");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(crearUsuario,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.Alignment.TRAILING))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														fieldUsuario,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														228,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														passField,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														228,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														228,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		ingresar,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		100,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		salir,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		100,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(58, 58, 58)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
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
												.addComponent(jLabel1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														passField,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														21,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														salir,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														ingresar,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(crearUsuario,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										15,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>

	/**
	 * Cierra todo el programa
	 * 
	 */
	private void salirClick(java.awt.event.MouseEvent evt) {
		this.setVisible(false);
		this.dispose();
	}

	/**
	 * Inicia la secuencia ingresar al hacer click en el JButton ingresar
	 * 
	 */
	private void ingresarClick(java.awt.event.MouseEvent evt) {
		secuenciaIngresar();
	}

	/**
	 * Inicia la ventana CrearUsuario y cierra La ventan Login
	 * 
	 */
	private void crearUsuarioClick(java.awt.event.MouseEvent evt) {
		CrearUsuario crear = new CrearUsuario();
		crear.setVisible(true);
		this.setVisible(false);
		this.dispose();
	}

	/**
	 * Metodo que inicia la secuencia ingresar cuando se presiona enter
	 * 
	 */
	private void evKeyReleased(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			secuenciaIngresar();
		}
	}

	/**
	 * Este metodo crea un objeto controlLogin el cual se inicializa con el
	 * texto en el JTextField y en el JPasswordField Luego atravez de un if
	 * comprueba\n 
	 * -Si ambos textos son mayores o iguales a 4 de largo\n
	 * -Si es true: muestra un mensaje de error diciendo que son demasiado cortos\n
	 * -Si es false: vuelve a otro if que comprueba atravez del ControlLogin\n
	 *  \tsi el usuario esta dentro de la base de datos\n
	 * -Si es true: Cierra la ventana de login y abre la ventana principal\n
	 * -Si es false: Envia un mensaje de error\n
	 * \tdiciendo que el usuario o contraseña son incorrectos\n
	 */
	private void secuenciaIngresar() {
		ControlLogin control = new ControlLogin(fieldUsuario.getText(),
				passField.getPassword());
		if (fieldUsuario.getText().length() <= 4
				|| passField.getPassword().length <= 4) {
			javax.swing.JOptionPane.showMessageDialog(this,
					"Usuario/Contraseña demasiado cortos", null,
					javax.swing.JOptionPane.ERROR_MESSAGE, null);
		} else if (control.compUser()) {
			Principal ventana = new Principal(fieldUsuario.getText());
			ventana.setVisible(true);
			this.setVisible(false);
			this.dispose();
		} else {
			javax.swing.JOptionPane.showMessageDialog(this,
					"Usuario/Contraseña Incorrectos", null,
					javax.swing.JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
