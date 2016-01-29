import java.util.*;

public class DiffCommitID {

	public void outputCmd() {
		File file = new File("orderedDiffCommitIDs.txt");
		Scanner input = new Scanner(file);
		BufferedWriter output = new BufferedWriter(new File("allCommand.sh"));

		String previousID;

		while (input.hasNext()) {
			String line = input.nextLine();
			String[] parts = line.split(" ");
			String part0 = parts[0];
			String part1 = parts[1];
			String part3 = parts[2];
			String cmd = "git diff " + part0 + " " + part1 + " > patches\\" + part3 + "_"
		}

	}
}