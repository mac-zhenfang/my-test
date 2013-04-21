package hadoop.security;

public enum Actions {
	NONE("---"), EXECUTE("--x"), WRITE("-w-"), WRITE_EXECUTE("-wx"), READ("r--"), READ_EXECUTE(
			"r-x"), READ_WRITE("rw-"), ALL("rwx");
	/** Symbolic representation */
	public final String SYMBOL;

	private Actions(String s) {
		SYMBOL = s;
	}

	/**
	 * Return true if this action implies that action.
	 * 
	 * @param that
	 */
	public boolean implies(Actions that) {
		if (that != null) {
			return (ordinal() & that.ordinal()) == that.ordinal();
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(Actions.READ.implies(Actions.READ_EXECUTE));
	}

}
