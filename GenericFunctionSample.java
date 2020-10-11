import java.util.ArrayList;
import java.util.List;

public class GenericFunctionSample {

	// E stands for Element
	// The type name can be set as desired
	public static <E> List<E> GenericList() {

		return new ArrayList<E>();
	}

	public static void main(String[] args) {

		// Functions can be of any type
		List<Integer> intList = GenericList();

		intList.add(6);
		intList.add(9);
		int xInt = intList.get(0);
		int yInt = intList.get(1);

		System.out.println("A generic type function with an Int type");
		System.out.println("(" + xInt + "*" + yInt + ")+(" + xInt + "+" + yInt + ")=" + ((xInt*yInt)+(xInt+yInt)));

		// ============================================================

		// Functions can be of any type
		List<String> strList = GenericList();

		strList.add("Nothing in life is to be feared. ");
		strList.add("It is only to be understood.");
		String xStr = strList.get(0);
		String yStr = strList.get(1);

		System.out.println("A generic type function with an String type");
		System.out.println(xStr + yStr);
	}

}


//============================================
//               Output Sample
//============================================

// $ javac GenericFunctionSample.java 
// $ java GenericFunctionSample
// A generic type function with an Int type
// (6*9)+(6+9)=69
// A generic type function with an String type
// Nothing in life is to be feared. It is only to be understood.
