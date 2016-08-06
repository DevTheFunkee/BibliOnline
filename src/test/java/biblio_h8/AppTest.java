package biblio_h8;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import it.formarete.model.Utente;
import it.formarete.persistence.ServiziDaoSessione;
import it.formarete.persistence.ServiziDaoUtente;

public class AppTest {

	@Test
	public void test() {
		Session session=ServiziDaoSessione.getInstance();
		Utente u=new Utente();
		u.setNome("Pino");
		u.setCognome("Pini");
		u.setDataRegistrazione(new Date());
		u.setMail("pino@forma-re-te.it");
		u.setTelefono("0112343423");
		ServiziDaoUtente daoUt=new ServiziDaoUtente();
		daoUt.save(u);
		session.close();
		assertTrue(u.getCodUtente()>0);
	}

}
