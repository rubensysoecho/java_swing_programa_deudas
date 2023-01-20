package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField tf_motivo;
	private JTextField tf_importe;
	private JTextField textField_1;
	
	public void insertarDatos(DefaultTableModel modelo)	{
		for (int i = 0; i < Shared.numDeudas(); i++) {
			Deuda deuda = Shared.seleccionarDeuda(i);
			Object[] objs = {deuda.getId(), deuda.getNombre(), deuda.getMotivoDeuda(), deuda.getDeuda()};
			modelo.addRow(objs);
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setVisible(true);
		setTitle("Gestor de deudas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		String[] nombresColumna = { "ID", "Nombre", "Motivo", "Importe" };
		DefaultTableModel modeloTabla = new DefaultTableModel(null, nombresColumna);
		insertarDatos(modeloTabla);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(145, 249, 452, 238);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setEnabled(false);
		table.setModel(modeloTabla);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
		lblNewLabel = new JLabel("Deudor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 42, 59, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox cb_deudor = new JComboBox();
		cb_deudor.setBounds(117, 40, 129, 22);
		contentPane.add(cb_deudor);
		
		JLabel lblNewLabel_1 = new JLabel("Motivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(48, 88, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		tf_motivo = new JTextField();
		tf_motivo.setBounds(117, 87, 181, 20);
		contentPane.add(tf_motivo);
		tf_motivo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Importe");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(48, 137, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		tf_importe = new JTextField();
		tf_importe.setHorizontalAlignment(SwingConstants.CENTER);
		tf_importe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_importe.setBounds(117, 133, 97, 22);
		contentPane.add(tf_importe);
		tf_importe.setColumns(10);
		
		JButton btn_nuevadeuda = new JButton("Nueva deuda");
		btn_nuevadeuda.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nuevadeuda.setBounds(117, 178, 136, 38);
		contentPane.add(btn_nuevadeuda);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(431, 88, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(511, 87, 121, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel((String) null);
		lblNewLabel_4.setBounds(431, 121, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btn_nuevodeudor = new JButton("Nuevo deudor");
		btn_nuevodeudor.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nuevodeudor.setBounds(468, 178, 129, 38);
		contentPane.add(btn_nuevodeudor);
	}
}
