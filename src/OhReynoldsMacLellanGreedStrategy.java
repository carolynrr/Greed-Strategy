
public class OhReynoldsMacLellanGreedStrategy extends GreedStrategy{
	
	public int choose(GreedOption[] options, int[] dice, int bank) {
		return 1;
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
