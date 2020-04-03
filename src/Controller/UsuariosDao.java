package Controller;

import java.util.List;
import br.com.model.bean.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import br.com.connection.ConnectionFactory;

public class UsuariosDao {
	EntityManager ems =  new ConnectionFactory().getConnection();
	public Usuarios save( Usuarios user){	
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
    public Usuarios buscaUsuario(String login, String senha) {
        	TypedQuery<Usuarios> query = this.ems.createQuery("select u from Usuarios u where u.NomeUsuario = :login and u.SenhaUsuario = :senha", Usuarios.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            try{
                return query.getSingleResult();
            }catch(NoResultException e){
                e.printStackTrace();
                return null;
            }		
	}	
}
