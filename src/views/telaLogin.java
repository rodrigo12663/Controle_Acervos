package views;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import Controller.UsuarioLoginDao;
import Controller.UsuariosDao;

import br.com.model.bean.UsuarioLogin;





public class telaLogin {
	public JFrame admin;
	public static JTextField usuario;
	public static JTextField senha;
	public String usuario_text;
	public String senha_text;
	public String pesquisa = null;
	public Statement startement = null;
	public ResultSet resultado = null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin window = new telaLogin();
					window.admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaLogin() {
		initialize();
	}
	private void initialize() {
		admin = new JFrame();
		admin.getContentPane().setFont(new Font("Arial", Font.BOLD, 17));
		admin.setBounds(100, 100, 450, 300);
		admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		admin.getContentPane().setLayout(null);
		admin.setLocationRelativeTo(null);
		admin.setResizable(false);
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(130, 98, 46, 14);
		admin.getContentPane().add(lblNewLabel);
		usuario = new JTextField();
		usuario.setBackground(new Color(192, 192, 192));
		usuario.setBounds(184, 95, 86, 20);
		admin.getContentPane().add(usuario);
		usuario.setColumns(10);
		JLabel lblNewLabel_1 = new JLabel("senha");
		lblNewLabel_1.setBounds(130, 143, 46, 14);
		admin.getContentPane().add(lblNewLabel_1);
		senha = new JTextField();
		senha.setBackground(new Color(192, 192, 192));
		senha.setBounds(184, 140, 86, 20);
		admin.getContentPane().add(senha);
		senha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(new Color(0, 0, 255));
		btnEntrar.setBounds(181, 210, 89, 23);
		admin.getContentPane().add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// começar o login
				//primeiro inserir usuário
				Tela_Principal_ principal = new Tela_Principal_();
				UsuariosDao dao =new UsuariosDao();
				usuario_text=usuario.getText();
				senha_text=senha.getText();
				
				if(usuario_text.equals("") && senha_text.equals("")){
					admin.dispose();
					JOptionPane.showMessageDialog(null, "precisa preencher");
				}
				else{
					if(dao.buscaUsuario(usuario_text, senha_text) != null){
						admin.dispose();
						Timestamp dataAtual = new Timestamp(System.currentTimeMillis());
						UsuarioLogin user = new UsuarioLogin ();
						user.setDataHora(dataAtual);
						user.setNomeUsuario(usuario_text);
						UsuarioLoginDao daos = new UsuarioLoginDao();
						user=daos.save(user);
						principal.frame.setVisible(true);	
					}
					else{
						System.out.println("deu errado");
					}
				}
				}});	
		JLabel lblRappazi = new JLabel("Rappazi");
		lblRappazi.setFont(new Font("arial", Font.PLAIN, 30));
		lblRappazi.setBounds(169, 11, 205, 37);
		
	}}


