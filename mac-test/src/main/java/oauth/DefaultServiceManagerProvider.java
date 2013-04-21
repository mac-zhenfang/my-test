/**
 * &copy; 2012 Cisco Systems, Inc.
 */
package oauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 2012-8-29
 * @version 1.0.0
 * @author <a href="mailto:sixu@cisco.com">Max Xu</a>
 * 
 */
public class DefaultServiceManagerProvider implements ServiceManagerProvider {

	private static final Logger logger = LoggerFactory.getLogger(DefaultServiceManagerProvider.class);

	private ServiceManager serviceManager;

	/**
	 * @param configFileLocation
	 */
	public void setConfigFileLocation(final String configFileLocation) {
		logger.info("Start to init ServiceManager with config file: {}.", configFileLocation);
		ServiceManagerFactory.setConfigFileLocation(configFileLocation);
		logger.info("End to init ServiceManager.");
		this.serviceManager = ServiceManagerFactory.getServiceManager();
	}

	/*
	 * @see com.webex.cwcapi.gateway.support.webex.provider.ServiceManagerProvider#getServiceManager()
	 */
	@Override
	public ServiceManager getServiceManager() {
		return this.serviceManager;
	}
}
