import java.io.*;
import java.util.*;
public class TextProcessor1 {
	private String fileName;
	private List<StringTokenizer> NodeOfWords;
	private int lengthOfFile = 0;

	public TextProcessor1(String fName) {
		fileName = fName;
		processFile();
	}

	private void processFile()
	{
		try
		{
			System.out.println(this.fileName);
			BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
			String line;
			while ((line = reader.readLine()) != null)
			{
				StringTokenizer tmp = new StringTokenizer(line, " .?!");
				this.NodeOfWords.add(tmp);
				lengthOfFile += line.length();
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.err.format("Exception occurred trying to read '%s'.", this.fileName);
			e.printStackTrace();
		}
	}

	public int getWordCount() {
		if (this.NodeOfWords == null || this.NodeOfWords.isEmpty()) {
			return 0;
		}
		int n = 0;
		for (int i = 0; i < this.NodeOfWords.size(); i++)
		{
			n += this.NodeOfWords.get(i).countTokens();
		}
		return (n);
	}

	public long getFileLength() {
		return lengthOfFile;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int countThisWord(String reference) {
		int n = 0;
		for (int i = 0; i < this.NodeOfWords.size(); i++)
		{
			n += 1;
		}
		return (n);
	}
}
