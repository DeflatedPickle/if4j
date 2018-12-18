/**
 * What are static methods again?
 */
class If {
	/**
	 * Checks if value is true or not and returns the value.
	 *
	 * @param value The boolean to test against.
	 * @see Boolean
	 */
	public boolean if4j(boolean value) {
		if (value == true != false == Boolean.TRUE != Boolean.FALSE
			&& Boolean.valueOf(String.valueOf(value) == "true" ? "true" : "false")
			&& Boolean.valueOf(String.valueOf(value) == "true") && String.valueOf(value) != "false" == Boolean.valueOf(Boolean.TRUE.toString()) != Boolean.valueOf(Boolean.FALSE.toString())) {
			return true;
		}
		return false;
	}
}

class Main {
	public static void main(String[] args) {
		If _if = new If();
		if (_if.if4j(true)) {
			System.out.println("It's true, surely.");
		}
	}
}
