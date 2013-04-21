/**
 * &copy; 2012 Cisco Systems, Inc.
 */
package oauth;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 2012-9-3
 * @version 1.0.0
 * @author <a href="mailto:sixu@cisco.com">Max Xu</a>
 */
public class DefaultSsoTokenUtilProvider implements SsoTokenUtilProvider {
	private static final Logger logger = LoggerFactory.getLogger(DefaultSsoTokenUtilProvider.class);
	private SsoTokenUtil ssoTokenUtil;

	/**
	 * @param serviceManagerProvider
	 */
	public void setServiceManagerProvider(final ServiceManagerProvider serviceManagerProvider) {
		logger.info("Start to init SsoTokenUtil.");

		final ServiceManager serviceManager = serviceManagerProvider.getServiceManager();

		logger.debug("Get Service with name=[{}], type=[{}].", "CAS", "CAS_CONTEXT");
		Service service = this.getFirstGlobalService(serviceManager, "CAS", "CAS_CONTEXT");

		if (service == null) {
			logger.debug("Get Service with name=[{}], type=[{}].", "CAS", "REST");
			service = this.getFirstGlobalService(serviceManager, "CAS", "REST");
		}

		if (service != null) {
			final String serviceUrl = service.getServiceURL();
			logger.debug("The serviceUrl is {}.", serviceUrl);

			final String casAddress = this.getHostUrl(serviceUrl);
			logger.debug("The casAddress is {}.", casAddress);
			if (!casAddress.isEmpty()) {
				// FIXME
				// AppName should be config.
				final String appName = "APP_TOKEN_UTIL";
				final String appKey = AppTokenConfig.getAppKey(appName);

				if (appKey != null) {
					logger.info("Init SsoTokenUtil with casAddress=[{}], appName=[{}], appKey=[{}].", new String[] { casAddress, appName, appKey });
					SsoTokenUtil.initConfiguration(casAddress, appName, appKey);
				}
			}
		}
		ssoTokenUtil = SsoTokenUtil.getInstance();

		logger.info("End to init SsoTokenUtil.");
	}

	private Service getFirstGlobalService(final ServiceManager serviceManager, final String name, final String type) {
		final List<Service> list = serviceManager.getGlobalService(name, type, null);
		final Service result = (list != null && !list.isEmpty()) ? list.get(0) : null;
		return result;
	}

	private String getHostUrl(final String url) {
		final StringBuilder result = new StringBuilder();
		try {
			final URI uri = new URI(url);
			final String scheme = uri.getScheme();
			final String host = uri.getHost();
			final int port = uri.getPort();

			if (scheme != null && host != null) {
				result.append(scheme);
				result.append("://");
				result.append(host);
				if (port != -1) {
					result.append(":");
					result.append(port);
				}
			}
		} catch (URISyntaxException e) {
			logger.error("", e);
		}
		return result.toString();
	}

	/*
	 * @see com.webex.cwcapi.gateway.support.webex.provider.SsoTokenUtilProvider#getSsoTokenUtil()
	 */
	@Override
	public SsoTokenUtil getSsoTokenUtil() {
		return this.ssoTokenUtil;
	}
}
