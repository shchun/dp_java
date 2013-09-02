

public class Main {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("Usage: java Main randomseed1 randomseed2");
			System.out.println("Example: java Main 315 13");
			System.exit(0);
		}

		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);

		Player player1 = new Player("dool", new WinningStrategy(seed1));
		Player player2 = new Player("hana", new ProbStrategy(seed2));

		for(int i=0; i < 1000; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if(nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner:" + player2);
				player2.win();
				player1.lose();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}

		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
}
