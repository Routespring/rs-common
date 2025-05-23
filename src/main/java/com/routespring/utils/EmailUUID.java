package com.routespring.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class EmailUUID {

	private static final int GROUP_SIZE = 5; // chars per group

	// Encode email to base36 string with hyphens, no truncation
	public static String generateUUID(String email) {
		BigInteger bigInt = new BigInteger(1, email.getBytes(StandardCharsets.UTF_8));
		String base36 = bigInt.toString(36);

		// Insert hyphens every GROUP_SIZE chars
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < base36.length(); i++) {
			if (i > 0 && i % GROUP_SIZE == 0)
				sb.append('-');
			sb.append(base36.charAt(i));
		}
		return sb.toString();
	}

	// Decode base36 string with hyphens back to email
	public static String decodeUUID(String uuid) {
		String compact = uuid.replace("-", "");
		BigInteger bigInt = new BigInteger(compact, 36);
		byte[] bytes = bigInt.toByteArray();

		// Remove possible leading zero byte
		if (bytes.length > 1 && bytes[0] == 0) {
			byte[] tmp = new byte[bytes.length - 1];
			System.arraycopy(bytes, 1, tmp, 0, tmp.length);
			bytes = tmp;
		}
		return new String(bytes, StandardCharsets.UTF_8);
	}
}