package lesson3;

public class lesson3 {

	public static void main(String[] args) {
		String inputArgument = String.join(",", args);
		String adminFlag = "--admin";
		String guestFlag = "--guest";
		if (inputArgument.contains(adminFlag) && inputArgument.contains(guestFlag)) {
			System.out.println("Please, select either 'ADMIN' or" + "'GUEST' mode for this program");
		} else if (inputArgument.contains(adminFlag)) {
			System.out.println("Hello Admin");
		} else if (inputArgument.contains(guestFlag)) {
			System.out.println("Hello Guest");

		}

	}
}
