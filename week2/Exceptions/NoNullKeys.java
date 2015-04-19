package Exceptions;

import java.util.HashMap;

public class NoNullKeys extends HashMap<Object, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8239426072059675622L;
	private boolean flag = false;

	public NoNullKeys(boolean flag) {
		setFlag(flag);
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean getFlag() {
		return flag;
	}

	public Object put(Object key, Object value) {
		if (getFlag() == false && key == null) {
			try {
				throw new KeySetToZeroException(
						"It is not allowed to have zero as a key!");
			} catch (KeySetToZeroException e) {
				e.printStackTrace();
				System.exit(0);
			}

		}
			return super.put(key, value);
		
	}
	
	public Object get(Object key) {
		return super.get(key);
	}

	public static void main(String[] args) {

		NoNullKeys n = new NoNullKeys(false);
	    System.out.println(n.put(2, 4));
	    System.out.println(n.get(2));
	}
}
