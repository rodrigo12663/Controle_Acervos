package Controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.connection.ConnectionFactory;

import br.com.model.bean.UsuarioLogin;
import br.com.model.bean.Usuarios;


public class UsuarioLoginDao {
	EntityManager ems =  new ConnectionFactory().getConnection();
	public UsuarioLogin save(  UsuarioLogin user){	
		try{
			ems.getTransaction().begin();
			ems.merge(user);
			ems.getTransaction().commit();
		}
		catch(Exception e){
			ems.getTransaction().rollback();
			System.out.println("erro");
		}finally{
			ems.close();
		}	
		return user;	
	}
	
	
	
	
}
