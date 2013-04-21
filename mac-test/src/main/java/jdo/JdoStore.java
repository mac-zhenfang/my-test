/**
 * 
 */
package jdo;

import java.util.Collection;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import jdo.bean.UserBean;

/**
 * @author macf
 * 
 *         http://www.datanucleus.org/products/accessplatform/guides/jdo/
 *         tutorial.html
 * 
 */
public class JdoStore {

	final private PersistenceManagerFactory pmf;
	final private PersistenceManager pm;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdoStore store = new JdoStore();
		// store.createUser();
		store.listUserJDOQL();
	}

	public JdoStore() {
		Properties jdoProps = new Properties();

		jdoProps.put("javax.jdo.PersistenceManagerFactoryClass",
				"org.datanucleus.jdo.JDOPersistenceManagerFactory");
		jdoProps.put("javax.jdo.option.ConnectionURL",
				"jdbc:mysql://localhost:3306/test");
		jdoProps.put("javax.jdo.option.ConnectionDriverName",
				"com.mysql.jdbc.Driver");
		jdoProps.put("javax.jdo.option.ConnectionUserName", "root");
		jdoProps.put("javax.jdo.option.ConnectionPassword", "111111");
		jdoProps.put("javax.jdo.option.NontransactionalRead", "true");
		jdoProps.put("javax.jdo.option.NontransactionalWrite", "true");
		jdoProps.put("datanucleus.autoCreateSchema", "true");
		jdoProps.put("datanucleus.storeManagerType", "rdbms");
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
				"this.age >= 18 && this.name.equals('Macf')");
		// query.setFilter(arg0)
		Collection<UserBean> result = (Collection<UserBean>) query.execute();
		for (UserBean bean : result) {
			System.out.println(bean.getName());
		}
	}

}
