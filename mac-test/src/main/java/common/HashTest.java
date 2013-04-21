/**
 * 
 */
package common;

/**
 * @author MacF
 * 
 */
public class HashTest {

	public static int hash(String key) {
		Scope baseScope = new Scope(0, 65535);
		System.out.println(baseScope.getLength());
		System.out.println(FNVHash(key));
		return (int) (FNVHash(key) % baseScope.getLength());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9a1ba16ae1c7780ecb89a1b39473c69011ef40d8

		System.out.println(hash("9a1ba16ae1c7780ecb89a1b39473c69011ef40d8"));

	}

	private static class Scope {
		private final int minScope;
		private final int maxScope;

		public Scope(int minScope, int maxScope) {
			this.minScope = minScope;
			this.maxScope = maxScope;
		}

		public int getLength() {
			return maxScope - minScope + 1;
		}

		public boolean isInScope(int number) {
			if (number >= minScope && number <= maxScope) {
				return true;
			} else {
				return false;
			}
		}
	}

	private static long FNVHash(String data) {
		final int p = 16777619;
		long hash = 2166136261L;
		for (int i = 0; i < data.length(); i++)
			hash = (hash ^ data.charAt(i)) * p;
		hash += hash << 13;
		hash ^= hash >> 7;
		hash += hash << 3;
		hash ^= hash >> 17;
		hash += hash << 5;
		return Math.abs(hash);
	}
}
