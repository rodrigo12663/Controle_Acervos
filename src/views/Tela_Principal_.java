package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Tela_Principal_ {

	 public JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Principal_ window = new Tela_Principal_();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela_Principal_() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblSistemaDeMultimeios = new JLabel("Sistema de multimeios");
		lblSistemaDeMultimeios.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblSistemaDeMultimeios.setBounds(63, 11, 326, 103);
		frame.getContentPane().add(lblSistemaDeMultimeios);
	}

	public void frame() {
	}

}
