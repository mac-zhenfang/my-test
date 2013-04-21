package jdo;

import java.util.Collection;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import jdo.bean.UserBean;

public class JdoHBaseStore {
	final private PersistenceManagerFactory pmf;
	final private PersistenceManager pm;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdoHBaseStore jhs = new JdoHBaseStore();
		jhs.listUserJDOQL();
	}

	public JdoHBaseStore() {
		Properties jdoProps = new Properties();
		// in 3.0.1 it is in datanucleus.api package
		jdoProps.put("javax.jdo.PersistenceManagerFactoryClass",
				"org.datanucleus.api.jdo.JDOPersistenceManagerFactory");
		jdoProps.put("javax.jdo.option.ConnectionURL", "hbase:127.0.0.1:2181");

		jdoProps.put("javax.jdo.option.ConnectionUserName", "");
		jdoProps.put("javax.jdo.option.ConnectionPassword", "");
		jdoProps.put("javax.jdo.option.NontransactionalRead", "true");
		jdoProps.put("javax.jdo.option.NontransactionalWrite", "true");
		jdoProps.put("datanucleus.autoCreateSchema", "true");
		jdoProps.put("datanucleus.validateTables", "false");
		jdoProps.put("datanucleus.validateConstraints", "false");
		pmf = JDOHelper.getPersistenceManagerFactory(jdoProps);
		pm = pmf.getPersistenceManager();
	}

	public void createUser() {
		UserBean bean = new UserBean();
		bean.setAge(30);
		bean.setName("Macf");
		Transaction tx = pm.currentTransaction();
		try {
			// Start the transaction
			tx.begin();
			// Persist it to the datastore
			pm.makePersistent(bean);
			// Commit the transaction, flushing the object to the datastore
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (tx.isActive()) {
				// Error occurred so rollback the transaction
				tx.rollback();
			}
			pm.close();
		}
	}

	/**
	 * http://www.objectdb.com/database/jdo/manual/chapter7
	 * */
	public void listUserJDOQL() {
		Query query = pm.newQuery(UserBean.class, 
				"this.age >= 18 && this.name.equals('Macfzzz')");
		// query.setFilter(arg0)
		Collection<UserBean> result = (Collection<UserBean>) query.execute();
		for (UserBean bean : result) {
			System.out.println(bean.getName());
		}
	}

}
