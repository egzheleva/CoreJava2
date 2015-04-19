package Pair;

public final class Pair {
	final private Object objOne;
	final private Object objTwo;

	public Pair(Object obj1, Object obj2) {
		objOne = obj1;
		objTwo = obj2;
	}
	public  Object getObjOne() {
		return objOne;
	}

	public  Object getObjTwo() {
		return objTwo;
	}

	
	@Override
	public String toString() {
		return String.format("(%, %)", objOne, objTwo);
	}
	
	
	@Override
	public boolean equals(Object object) {
		if(object  instanceof Pair) {
			return objOne.equals(((Pair) object).getObjOne()) && objTwo.equals(((Pair) object).getObjTwo());
		}
		else 
			return false;
	}

	
	
	public static void main(String args[]) {
		Pair p1 = new Pair(2, 3);
		Pair p2 = new Pair(2, 3);
		System.out.println(p1.equals(p2));
	}
}
