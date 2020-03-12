import java.awt.EventQueue;
import variables.*;
import logica.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class MainI {

	private JFrame frmRestauranteDam;
	private JPanel panelPrincipal, panelRestaurante, panelFacturacion;
	private JTable PedidosTabla;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainI window = new MainI();
					window.frmRestauranteDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		frmRestauranteDam = new JFrame();
		frmRestauranteDam.setTitle("Restaurante DAM");
		frmRestauranteDam.setResizable(false);
		frmRestauranteDam.setBounds(100, 100, 683, 468);
		frmRestauranteDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestauranteDam.getContentPane().setLayout(new CardLayout(0, 0));
		
		//Panel principal
		final JPanel panelPrincipal = new JPanel();
		frmRestauranteDam.getContentPane().add(panelPrincipal, "name_48733590032000");
		
		JLabel lblRestauranteDam = new JLabel("Restaurante DAM");
		lblRestauranteDam.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestauranteDam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnRestaurante = new JButton("Restaurante");
		btnRestaurante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnFacturacion = new JButton("Facturacion");
		btnFacturacion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel CocacolaImage = new JLabel("");
		ImageIcon cocacolaImg = new ImageIcon(".\\assets\\image\\cocacola.png");
		ImageIcon imgTransformada = ImagenManager.remidenzionarImagen(cocacolaImg, 50, 100);
		CocacolaImage.setIcon(imgTransformada);
		
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(159)
					.addComponent(CocacolaImage, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(18)
							.addComponent(lblRestauranteDam, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnFacturacion, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRestaurante, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(250, Short.MAX_VALUE))
		);
		gl_panelPrincipal.setVerticalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panelPrincipal.createSequentialGroup()
							.addContainerGap()
							.addComponent(CocacolaImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panelPrincipal.createSequentialGroup()
							.addGap(74)
							.addComponent(lblRestauranteDam, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
					.addComponent(btnRestaurante, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(77)
					.addComponent(btnFacturacion, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
		);
		panelPrincipal.setLayout(gl_panelPrincipal);
		
		//Panel Restaurante donde contiene las mesas
		final JPanel panelRestaurante = new JPanel();
		frmRestauranteDam.getContentPane().add(panelRestaurante, "name_48738820370400");
		
		JButton btnVolver = new JButton("Volver");
		
		JLabel lblMesas = new JLabel("Mesas");
		lblMesas.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesas.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JPanel MesasPanel = new JPanel();
		GroupLayout gl_panelRestaurante = new GroupLayout(panelRestaurante);
		gl_panelRestaurante.setHorizontalGroup(
			gl_panelRestaurante.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelRestaurante.createSequentialGroup()
					.addGap(273)
					.addComponent(lblMesas, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
					.addGap(258))
				.addGroup(gl_panelRestaurante.createSequentialGroup()
					.addGap(20)
					.addComponent(MesasPanel, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panelRestaurante.createSequentialGroup()
					.addGap(292)
					.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(302, Short.MAX_VALUE))
		);
		gl_panelRestaurante.setVerticalGroup(
			gl_panelRestaurante.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelRestaurante.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMesas, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(MesasPanel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addGap(27))
		);
		MesasPanel.setLayout(new GridLayout(5, 15, 25, 25));
		panelRestaurante.setLayout(gl_panelRestaurante);
		
		//Panel Facturacion donde contiene todas las facturas
		final JPanel panelFacturacion = new JPanel();
		frmRestauranteDam.getContentPane().add(panelFacturacion, "name_48741243248100");
		
		JButton btnVolver2 = new JButton("Volver");
		
		JLabel lblFacturacion = new JLabel("Facturacion");
		lblFacturacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacturacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("Mostrar Stock");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnEstadisticas = new JButton("Sacar Estadisticas");
		btnEstadisticas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panelFacturacion = new GroupLayout(panelFacturacion);
		gl_panelFacturacion.setHorizontalGroup(
			gl_panelFacturacion.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelFacturacion.createSequentialGroup()
					.addGap(166)
					.addComponent(lblFacturacion, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
					.addGap(132))
				.addGroup(gl_panelFacturacion.createSequentialGroup()
					.addContainerGap(302, Short.MAX_VALUE)
					.addComponent(btnVolver2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(292))
				.addGroup(gl_panelFacturacion.createSequentialGroup()
					.addContainerGap(274, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(257))
				.addGroup(gl_panelFacturacion.createSequentialGroup()
					.addContainerGap(262, Short.MAX_VALUE)
					.addComponent(btnEstadisticas, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(245))
		);
		gl_panelFacturacion.setVerticalGroup(
			gl_panelFacturacion.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelFacturacion.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFacturacion, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(btnEstadisticas, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(btnVolver2)
					.addGap(25))
		);
		panelFacturacion.setLayout(gl_panelFacturacion);
		//Panel de la mesa
		JPanel panelMesa = new JPanel();
		frmRestauranteDam.getContentPane().add(panelMesa, "name_50610301194400");
		
		JButton btnVolver3 = new JButton("Volver");
		
		JLabel lblMesaN = new JLabel("Mesa");
		lblMesaN.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesaN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//Genera el inventario
		String[] listaTablas = {"Nombre"};
		Inventario inv = new Inventario();
		
		String[][] productosStr = new String[inv.getProductoInventario().length][3];
		for(int i = 0; i<inv.getProductoInventario().length;i++) {
			ProductoInventario p = inv.getProductoInventarioSingle(i);
			productosStr[i][0] = p.getNombre();
		}
		
		JLabel lblPedido = new JLabel("Pedido:");
		lblPedido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		//Aqui se generaria la tabla del inventario
		PedidosTabla = new JTable(productosStr, listaTablas);
		PedidosTabla.setFillsViewportHeight(true);
		DefaultTableModel modeloTabla = new DefaultTableModel(productosStr, listaTablas) {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		       //Todas las celdas no se puede editar
		       return false;
		    }
		};
		PedidosTabla.setModel(modeloTabla);
		JScrollPane BarraListaPedidos = new JScrollPane();
		BarraListaPedidos.setViewportView(PedidosTabla);
		
		JButton btnAadirPedio = new JButton("Añadir pedio");
		JButton btnMostarFactura = new JButton("Sacar factura");
		
		//Se desactiva los botones porque no tienen nada seleccionado.
		btnAadirPedio.setEnabled(false);
		btnMostarFactura.setEnabled(false);
		
		GroupLayout gl_panelMesa = new GroupLayout(panelMesa);
		gl_panelMesa.setHorizontalGroup(
			gl_panelMesa.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelMesa.createSequentialGroup()
					.addGroup(gl_panelMesa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelMesa.createSequentialGroup()
							.addGap(84)
							.addComponent(lblPedido, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelMesa.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panelMesa.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnMostarFactura, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAadirPedio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
							.addGap(22)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(BarraListaPedidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
				.addGroup(gl_panelMesa.createSequentialGroup()
					.addContainerGap(351, Short.MAX_VALUE)
					.addComponent(lblMesaN, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(221))
				.addGroup(gl_panelMesa.createSequentialGroup()
					.addContainerGap(365, Short.MAX_VALUE)
					.addComponent(btnVolver3)
					.addGap(253))
		);
		gl_panelMesa.setVerticalGroup(
			gl_panelMesa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMesa.createSequentialGroup()
					.addGap(23)
					.addComponent(lblMesaN, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelMesa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelMesa.createSequentialGroup()
							.addComponent(BarraListaPedidos, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnVolver3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelMesa.createSequentialGroup()
							.addComponent(lblPedido, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(133)
							.addComponent(btnAadirPedio)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMostarFactura)))
					.addContainerGap())
		);
		
		
		panelMesa.setLayout(gl_panelMesa);
		//Fin de la interfaz
		
		//Acciones de los botones
		
		btnFacturacion.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelFacturacion.setVisible(true);
				panelPrincipal.setVisible(false);
			}
		});
		
		btnRestaurante.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelRestaurante.setVisible(true);
				panelPrincipal.setVisible(false);
			}
		});
		
		btnVolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelPrincipal.setVisible(true);
				panelRestaurante.setVisible(false);
			}
		});
		
		btnVolver2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelPrincipal.setVisible(true);
				panelFacturacion.setVisible(false);
			}
		});
		
		btnVolver3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelRestaurante.setVisible(true);
				panelMesa.setVisible(false);
			}
		});
		HashMap <Integer , Integer> pedidos=new HashMap<Integer , Integer>();
		//Acciones del la tabla
		PedidosTabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			//Si tiene una columna seleccionada te activa el boton de añadir pedido
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				int fila = PedidosTabla.getSelectedRow();
				if(fila != -1){
					btnAadirPedio.setEnabled(true);
					btnAadirPedio.addActionListener(new ActionListener() {
				
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							btnMostarFactura.setEnabled(true);
							if (pedidos.containsKey(fila+1)) {
								pedidos.put((fila+1), (pedidos.get(fila+1)+1));
							} else {
								pedidos.put((fila+1), 1);
							}
							btnAadirPedio.setEnabled(false);
						}
						
					});
					
				}
				else{
					btnAadirPedio.setEnabled(false);
				}	
			}
		});
		btnMostarFactura.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Mesa mesa= new Mesa(pedidos);
				System.out.println(mesa.sacarFactura());
			}
		});
		
		List<JButton> Mesas = new ArrayList<>();//Se hae una lista de los botones donde contiene las mesas para el panel mesas
		for(int i = 0; i<15;i++) { //Que lo genera automaticamente
			JButton boton = new JButton(""+(i+1));
			boton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					panelMesa.setVisible(true);
					lblMesaN.setText("Mesa " + boton.getText());
					panelRestaurante.setVisible(false);
					//Mesa mesa = new Mesa();
				}
			});
			Mesas.add(boton);
			MesasPanel.add(Mesas.get(i));
		}
	}
}

