class GenericValue<T> {

	// T stands for Type
	// The type name can be set as desired
	T firstValue;
	T secondValue;

	// Setter
	public void setFirstValue(T val) {
		T valTmp = val;
		this.firstValue = valTmp;
	}
	// Getter
	public T getFirstValue() {
		return this.firstValue;
	}

	// Setter
	public void setSecondValue(T val) {
		T valTmp = val;
		this.secondValue = valTmp;
	}
	// Getter
	public T getSecondValue() {
		return this.secondValue;
	}
}

public class GenericClassSample {

	public static void main(String[] args) {

		GenericValue<Integer> firstInt = new GenericValue<Integer>();
		GenericValue<Integer> secondInt = new GenericValue<Integer>();

		// You can set the type of the function as you wish.
		firstInt.setFirstValue(3);
		secondInt.setSecondValue(4);
		int xInt = firstInt.getFirstValue();
		int yInt = secondInt.getSecondValue();

		System.out.println("A generic type class with an Int type");
		System.out.println("Pythagorean theorem : " + xInt*xInt + " + " + yInt*yInt + " = " + (xInt*xInt + yInt*yInt));

		// =================================================================

		GenericValue<String> firstStr = new GenericValue<String>();
		GenericValue<String> secondStr = new GenericValue<String>();

		// You can set the type of the function as you wish.
		firstStr.setFirstValue("To succeed in life, you need two things. ");
		secondStr.setSecondValue("ignorance and confidence.");
		String xStr = firstStr.getFirstValue();
		String yStr = secondStr.getSecondValue();

		System.out.println("A generic type class with an String type");
		System.out.println(xStr + yStr);

	}
}


//============================================
//               Output Sample
//============================================

// $ javac GenericClassSample.java 
// $ java GenericClassSample
// A generic type class with an Int type
// Pythagorean theorem : 9 + 16 = 25
// A generic type class with an String type
// To succeed in life, you need two things. ignorance and confidence.

