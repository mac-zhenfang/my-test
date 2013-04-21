/**
 * &copy; 2012 Cisco Systems, Inc.
 */
package oauth;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 2012-9-10
 * @version 1.0.0
 * @author <a href="mailto:sixu@cisco.com">Max Xu</a>
 * 
 */
public class WbxOAuth2AccessTokenProvider implements OAuth2AccessTokenProvider {
	private static final Logger logger = LoggerFactory.getLogger(WbxOAuth2AccessTokenProvider.class);

	private SsoTokenUtil ssoTokenUtil;

	public void setSsoTokenUtilProvider(final SsoTokenUtilProvider ssoTokenUtilProvider) {
		this.ssoTokenUtil = ssoTokenUtilProvider.getSsoTokenUtil();
	}

	/*
	 * @see com.webex.cwcapi.gateway.component.security.oauth2.OAuth2AccessTokenProvider#getAccessToken(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public OAuth2AccessToken getAccessToken(final String accessTokenValue) throws FrameworkException {
		try {
			logger.debug("{}", accessTokenValue);
			final OAuth2Token oauth2_token = (OAuth2Token) this.ssoTokenUtil.getToken(accessTokenValue, Token.OAUTH2_TOKENTYPE, false);
			final OAuth2AccessToken result = new OAuth2AccessToken();
			result.setScope(oauth2_token.getPermissionList());
			result.setExpired(oauth2_token.isExpired());
			result.setValue(accessTokenValue);
			final String wbx_token_string = oauth2_token.getWebExTokenString();

			final Map<String, Object> additionalInformation = new HashMap<String, Object>();
			additionalInformation.put(WbxConstants.TOKEN_VALUE_NAME, wbx_token_string);
			additionalInformation.put(WbxConstants.TOKEN_CONTENT_NAME, oauth2_token.getTokenContent());
			logger.debug("The wbxToken is {}.", wbx_token_string);
			result.setAdditionalInformation(additionalInformation);
			return result;
		} catch (WbxTokenException ex) {
			throw new FrameworkException(ex, ErrorKeys.GLOBAL_TOKEN_INVALID);
		}
	}

}
