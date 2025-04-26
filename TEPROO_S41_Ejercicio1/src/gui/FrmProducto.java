package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class FrmProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblCategoria;
	private JComboBox cboCategoria;
	private JLabel lblStock;
	private JTextField txtStock;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JButton btnNuevo;
	private JScrollPane scrollPane;
	private JTable jtbProductos;
	private JCheckBox chkEstado;
	private JLabel lblActivo;
	private JRadioButton rdbOpcion1;
	private JRadioButton rdbOpcion2;
	private JRadioButton rdbOpcion3;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProducto frame = new FrmProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmProducto() {
		initComponents();
	}
	private void initComponents() {
		setTitle("Formulario de Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 431);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.lblCodigo = new JLabel("Código");
		this.lblCodigo.setBounds(18, 13, 60, 13);
		this.contentPane.add(this.lblCodigo);
		
		this.txtCodigo = new JTextField();
		this.txtCodigo.setBounds(88, 10, 124, 19);
		this.contentPane.add(this.txtCodigo);
		this.txtCodigo.setColumns(10);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(18, 42, 60, 13);
		this.contentPane.add(this.lblNombre);
		
		this.txtNombre = new JTextField();
		this.txtNombre.setBounds(88, 39, 124, 19);
		this.contentPane.add(this.txtNombre);
		this.txtNombre.setColumns(10);
		
		this.lblCategoria = new JLabel("Categoría");
		this.lblCategoria.setBounds(18, 72, 60, 13);
		this.contentPane.add(this.lblCategoria);
		
		this.cboCategoria = new JComboBox();
		this.cboCategoria.setModel(new DefaultComboBoxModel(new String[] {"Abarrotes", "Bebidas", "Enlatados", "Frutas", "Verduras"}));
		this.cboCategoria.setBounds(88, 68, 124, 21);
		this.contentPane.add(this.cboCategoria);
		
		this.lblStock = new JLabel("Stock");
		this.lblStock.setBounds(18, 104, 60, 13);
		this.contentPane.add(this.lblStock);
		
		this.txtStock = new JTextField();
		this.txtStock.setBounds(88, 101, 124, 19);
		this.contentPane.add(this.txtStock);
		this.txtStock.setColumns(10);
		
		this.lblPrecio = new JLabel("Precio");
		this.lblPrecio.setBounds(18, 133, 60, 13);
		this.contentPane.add(this.lblPrecio);
		
		this.txtPrecio = new JTextField();
		this.txtPrecio.setBounds(88, 130, 124, 19);
		this.contentPane.add(this.txtPrecio);
		this.txtPrecio.setColumns(10);
		
		this.btnNuevo = new JButton("Nuevo");
		this.btnNuevo.setBounds(243, 9, 85, 21);
		this.contentPane.add(this.btnNuevo);
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBounds(18, 202, 464, 182);
		this.contentPane.add(this.scrollPane);
		
		this.jtbProductos = new JTable();
		this.jtbProductos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Stock", "Categor\u00EDa", "Nombre", "Precio"
			}
		));
		this.scrollPane.setViewportView(this.jtbProductos);
		
		this.chkEstado = new JCheckBox("Activo");
		this.chkEstado.setBounds(88, 155, 93, 21);
		this.contentPane.add(this.chkEstado);
		
		this.lblActivo = new JLabel("Activo");
		this.lblActivo.setBounds(28, 159, 45, 13);
		this.contentPane.add(this.lblActivo);
		
		ButtonGroup grupo = new ButtonGroup();
		
		this.panel = new JPanel();
		this.panel.setBounds(331, 42, 143, 94);
		this.contentPane.add(this.panel);
		this.rdbOpcion1 = new JRadioButton("New radio button");
		this.panel.add(this.rdbOpcion1);
		grupo.add(rdbOpcion1);
		
		this.rdbOpcion2 = new JRadioButton("New radio button");
		this.panel.add(this.rdbOpcion2);
		grupo.add(rdbOpcion2);
		
		this.rdbOpcion3 = new JRadioButton("New radio button");
		this.panel.add(this.rdbOpcion3);
		grupo.add(rdbOpcion3);
	}
}
