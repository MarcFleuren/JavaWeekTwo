
public class M {
	public int randomNumber() {

		double result = 0;

		result =  Math.random() * 10;
		if (result == 0) {
			return (int) (result = 5);

		}

		return (int)result;
	}

}
