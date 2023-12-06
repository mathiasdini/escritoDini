package Grafica;
import java.util.ArrayList;
import Logica.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JfrmGrafica extends JFrame {
	   
    ListaAutos ingreso = new ListaAutos();
Auto a=new Auto();
	 
	private JPanel contentPane;
	private JTextField txtCilindrada;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtPrecio;

	int cilindrada = Integer.parseInt(txtCilindrada.getText());
	String matricula= txtMatricula.getText();
	String marca= txtMarca.getText();
	 double precio = Double.valueOf(txtPrecio.getText());
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfrmGrafica frame = new JfrmGrafica();
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
	public JfrmGrafica() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Panel Autos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 442, 331);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCilindrada = new JLabel("Cilindrada");
		lblCilindrada.setBounds(10, 34, 62, 14);
		panel.add(lblCilindrada);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 93, 46, 14);
		panel.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 148, 46, 14);
		panel.add(lblMarca);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 228, 46, 14);
		panel.add(lblPrecio);
		
		txtCilindrada = new JTextField();
		txtCilindrada.setBounds(110, 31, 86, 20);
		panel.add(txtCilindrada);
		txtCilindrada.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(110, 90, 86, 20);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(110, 145, 86, 20);
		panel.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(110, 225, 86, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptrar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    a.setCilindrada(cilindrada);
			        a.setMatricula(matricula);
			        a.setMarca(marca);
			        a.setPrecio(precio);
				
				
				  ingreso.agregar(a);
				  
				  JOptionPane.showMessageDialog(null,ingreso.toString(),"Mostrar Autos",JOptionPane.ERROR_MESSAGE);

	
			}
		});
		btnAceptar.setBounds(175, 274, 89, 23);
		panel.add(btnAceptar);
		
	
	}
}
