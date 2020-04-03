package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_acesso_Erro {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_acesso_Erro window = new Tela_acesso_Erro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Tela_acesso_Erro() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 163);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblErro = new JLabel("Erro");
		lblErro.setFont(new Font("Arial", Font.PLAIN, 18));
		lblErro.setBounds(120, 47, 46, 14);
		frame.getContentPane().add(lblErro);
		
		JButton btnTentarDinovo = new JButton("Tentar Dinovo");
		btnTentarDinovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin te=new telaLogin();
				te.admin.dispose();
				te.admin.setVisible(true);
				frame.dispose();
			}
		});
		btnTentarDinovo.setBounds(86, 90, 114, 23);
		frame.getContentPane().add(btnTentarDinovo);
	}

}
