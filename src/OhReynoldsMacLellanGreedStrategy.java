
public class OhReynoldsMacLellanGreedStrategy extends GreedStrategy{
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		if (options.length == 2) {
			if ((dice.length > 3) || (dice.length == 0))
				return 1;
		else
			if (bank < 300)
				return 1;
			else
				return 0;
		else
			return 2;
	}

	@Override
	public String playerName() {
		// TODO Auto-generated method stub
		return "Random Player";
	}

	@Override
	public String author() {
		// TODO Auto-generated method stub
		return "Ere, Carolyn, Maggie";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main");

	}

}
