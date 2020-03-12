import java.awt.EventQueue;

import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class RestauranteI extends JFrame{

	private JFrame frmRestauranteDam;

	/**
	 * Ejecuta la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestauranteI window = new RestauranteI();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					window.frmRestauranteDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea la ejecuccion de la aplicacion
	 */
	public RestauranteI() {
		initialize();
	}

	/**
	 * Inializa el contenido de la ventana
	 */
	private void initialize() {
		
		frmRestauranteDam = new JFrame();
		frmRestauranteDam.setTitle("Restaurante DAM");
		frmRestauranteDam.setBounds(100, 100, 676, 494);
		frmRestauranteDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestauranteDam.setResizable(false);
		JLabel nombreMesas = new JLabel("Mesas", SwingConstants.CENTER);
		nombreMesas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel MesasPanel = new JPanel();
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmRestauranteDam.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(302)
							.addComponent(nombreMesas))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(MesasPanel, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(73, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(559, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(nombreMesas)
					.addGap(18)
					.addComponent(MesasPanel, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
		);
		
		JButton btnTexto = new JButton("Texto");
		panel.add(btnTexto);
		MesasPanel.setLayout(new GridLayout(5, 15, 25, 25));
		frmRestauranteDam.getContentPane().setLayout(groupLayout);
		
		List<JButton> Mesas = new ArrayList<>();//Se hae una lista de los botones donde contiene las mesas
		for(int i = 0; i<15;i++) { //Que lo genera automaticamente
			JButton boton = new JButton(""+(i+1));
			boton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MesaI ventanaMesa = new MesaI();
					ventanaMesa.setVisible(true);
					frmRestauranteDam.dispose();
				}
			});
			Mesas.add(boton);
			MesasPanel.add(Mesas.get(i));
		}
		
		
	}
	/**
	 * 
	 * @param panel1 El panel principal que se va a ocultar
	 * @param panel2 El panel que se va a mostrar
	 */
	public void cambiarPaneles(JFrame frame1, JFrame frame2) {
		frame1.setVisible(false);
		frame2.setVisible(true);
	}
}
