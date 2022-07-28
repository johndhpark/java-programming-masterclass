class IfKeywordAndCodeBlocks {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("High score is: " + highScore);

		score = 1000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("High score is: " + highScore);

		int highScorePos;

		highScorePos = calculateHighScorePosition(1500);
		displayHighScorePosition("John", highScorePos);

		highScorePos = calculateHighScorePosition(900);
		displayHighScorePosition("Bob", highScorePos);

		highScorePos = calculateHighScorePosition(400);
		displayHighScorePosition("Kelly", highScorePos);

		highScorePos = calculateHighScorePosition(50);
		displayHighScorePosition("Maria", highScorePos);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		int finalScore = -1;

		if (gameOver)
			finalScore = score + (levelCompleted * bonus);

		return finalScore;
	}

	public static void displayHighScorePosition(String name, int highScorePosition) {
		System.out.println(name + " managed to get into position " + highScorePosition);
	}

	public static int calculateHighScorePosition(int score) {
		int position = 4;

		if (score >= 1000) {
			position = 1;
		} else if (score >= 500) {
			position = 2;
		} else if (score > 100) {
			position = 3;
		}

		return position;
	}
}