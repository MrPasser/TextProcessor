import java.io.*;
public class TextProcessor {
	private String fileName;
	private List<StringTokenizer> NodeOfWords;
	private List<String> records = new ArrayList<String>();

	public TextProcessor(String fName) {
		fileName = fName;
		processFile();
	}

	private void processFile() throws FileNotFoundException, IOException {
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(this.filename));
			String line;
			while ((line = reader.readLine()) != null)
			{
				this.NodeOfWords.add(new StringTokenizer(line));
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.err.format("Exception occurred trying to read '%s'.", this.filename);
			e.printStackTrace();
			return null;
		}
	}

	public int getWordCount() {
		if (this.NodeOfWords == null || this.NodeOfWords.isEmpty()) {
			return 0;
		}
		int n = 0;
		for (int i = 0; i < this.NodeOfWords.size(); i++)
		{
			n += this.NodeOfWords.get(i).size();
		}
		return (n);
	}

	public long getFileLength() {
		return wholeText.length();
	}

	public String getFileName() {
		return this.fileName;
	}

	public int countThisWord(String reference) {
		int n = 0;
		for (int i = 0; i < this.NodeOfWords.size(); i++)
		{
			n += this.NodeOfWords.get(i).isEqual(reference);
		}
		return (n);
	}
}