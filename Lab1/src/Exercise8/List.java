package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.Mars;

public class List {
	public List()
	
	{
		Mars wom1 = new Mars(40);
		Mars wom2 = new Mars(45);
		Mars wom3 = new Mars(50);

		ArrayList<Mars> weightlist = new ArrayList<Mars>();

		weightlist.add(wom1);
		weightlist.add(wom2);
		weightlist.add(wom3);

		Iterator<Mars> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().calculateWeight();
		}
	}
}