/**
 * 
 */
package org.core.common.utils;

import org.apache.commons.codec.binary.Base64;

/**
 * @author piotrek
 *
 */
public class StringUtils {
	public static String encodeBase64(final String text) {
		return new String(Base64.encodeBase64(text.getBytes()));
	}

	public static String decodeBase64(final String source) {
		return new String(Base64.decodeBase64(source.getBytes()));
	}
}