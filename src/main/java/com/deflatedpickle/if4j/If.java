package com.deflatedpickle.if4j;

import java.util.concurrent.atomic.AtomicBoolean;

class If {
    /**
     * Checks if value is true or not and returns the value.
     *
     * @param value The object to test against.
     * @see Object
     */
    public Object if4j(Object value) {
		Object aBoolean;
		aBoolean = new AtomicBoolean(true);

        switch (value.getClass().getSimpleName()) {
            case "Boolean":
            	Object result = ifBoolean(value);

            	if (result instanceof Boolean) {
					((AtomicBoolean) aBoolean).lazySet((Boolean) result);
				}
                break;
			default:
				aBoolean = false;
				break;
        }

		return castToBoolean(Boolean.parseBoolean(String.valueOf(aBoolean)));
    }

    public Object ifBoolean(Object value) {
    	if ((Boolean) equalsButBetter(castToBoolean(value), true) && !(Boolean) equalsButBetter(castToBoolean(value), false)
				&& (Boolean) equalsButBetter(castToBoolean(value), Boolean.TRUE) && !(Boolean) equalsButBetter(castToBoolean(value), Boolean.FALSE)) {
			return true;
		}
    	else return (Boolean) equalsButBetter(castToBoolean(value), false) && !(Boolean) equalsButBetter(castToBoolean(value), true)
				&& (Boolean) equalsButBetter(castToBoolean(value), Boolean.FALSE) && !(Boolean) equalsButBetter(castToBoolean(value), Boolean.TRUE);

	}

	public Object equalsButBetter(Object first, Object second) {
		Object aBoolean;
		aBoolean = new AtomicBoolean(true);

		((AtomicBoolean) aBoolean).set(castToBoolean(first) == (Boolean) second);

		return ((AtomicBoolean) aBoolean).get();
	}

	public boolean castToBoolean(Object value) {
		return (Boolean) value;
	}

    public static void main(String[] args) {
        If _if = new If();

        if ((Boolean) _if.if4j(true)) {
            System.out.println("It's true, surely.");
        }

        if ((Boolean) _if.if4j(false)) {
			System.out.println("Egad, it is false, sire!");
		}
    }
}
