import java.util.Scanner;

public class ReachTheFlag {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int coin = 0;
		System.out.println("Welcome To Reach The Flag Challenge Level #1");
		String msg = "WomenThailandCyberTopTalent2023";
		int len = msg.length();
		while (true) {
			System.out.println("---------------------------------------------");
			try {
				System.out.print("Enter Message: ");
				String input = kb.next();
				if (input.substring(0, len / 2).equals(msg.substring(0, len / 2))) {
					int num = input.length();
					if (input.substring(num - len / 2 - 1).equals(msg.substring(len / 2))) {
						String rep = input.replace(msg, "");
						if (rep.equals(msg)) {
							coin += 500;
							System.out.println("You Pass Level #1");
							System.out.println("");
							break;
						} else {
							System.out.println("Not Equal Message #3");
						}
					} else {
						System.out.println("Not Equal Message #2");
					}
				} else {
					System.out.println("Not Equal Message #1");
				}
			} catch (Exception e) {
				System.out.println("Good Bye");
				return;
			}
		}
		System.out.println("Welcome To Reach The Flag Challenge Level #2");
		while (true) {
			System.out.println("---------------------------------------------");
			try {
				System.out.print("Enter Number #1: ");
				int num1 = kb.nextInt();
				System.out.print("Enter Number #2: ");
				int num2 = kb.nextInt();
				System.out.print("Enter Number #3: ");
				int num3 = kb.nextInt();
				if (num1 > 0 && num2 > 0 && num3 > 0) {
					if (num1 >= num2 && num2 >= num3) {
						double pow1 = Math.pow(num1, 3);
						double pow2 = Math.pow(num2, 3);
						double pow3 = Math.pow(num3, 3);
						if (pow1 == pow2 + pow3) {
							coin += 500;
							System.out.println("You Pass Level #2");
							System.out.println("");
							break;
						} else {
							System.out.println("Incorrect Number #3");
						}
					} else {
						System.out.println("Incorrect Number #2");
					}
				} else {
					System.out.println("Incorrect Number #1");
				}
			} catch (Exception e) {
				System.out.println("Good Bye");
				return;
			}
		}
		System.out.println("Welcome To Reach The Flag Challenge Level #3");
		int star = 0;
		while (true) {
			System.out.println("---------------------------------------------");
			try {
				System.out.println("[1]: Show Your Profile");
				System.out.println("[2]: Reach The Star");
				System.out.println("[3]: Reach The Flag");
				System.out.print("Enter Menu: ");
				int menu = kb.nextInt();
				if (menu == 1) {
					System.out.println("Show Your Profile");
					System.out.println("Coins: " + coin);
					System.out.println("Stars: " + star);
				} else if (menu == 2) {
					System.out.println("Reach The Star");
					System.out.println("1 Star = 1 Coin");
					System.out.print("Enter Coin: ");
					int num = kb.nextInt();
					if (coin - num >= 0) {
						coin -= num;
						star += num;
					} else {
						System.out.println("Not Enough Coin");
					}
				} else if (menu == 3) {
					System.out.println("Reach The Flag");
					System.out.println("1 Flag = 100000 Stars");
					System.out.print("Enter Star: ");
					int num = kb.nextInt();
					if (star - num >= 0 && num >= 100000) {
						star -= num;
						System.out.println("You Pass Level #3");
						System.out.println("WCTF23{md5}");
						break;
					} else {
						System.out.println("Not Enough Star");
					}
				} else {
					System.out.println("Invalid Menu");
				}
			} catch (Exception e) {
				System.out.println("Good Bye");
				return;
			}
		}
	}
}