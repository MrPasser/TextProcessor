import java.io.*;
import java.util.*;
public class TextProcessor1 {
	private String fileName;
	private List<String> NodeOfWords;
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
				lengthOfFile += line.length();
				StringTokenizer tmp = new StringTokenizer(line, " .?![]{}/\\\'\",-\n\t 1234567890", false);  //bro, read how the flag works
				while((line = tmp.nextToken()) != null)
					this.NodeOfWords.add(line);
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
		return (this.NodeOfWords.size());
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
			n += this.NodeOfWords.get(i).length();
		}
		return (n);
	}

	public List<String> getWordsHavingCount(int count)
	{
		List<Struct> words = null;
		List<String> answer = null;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (words != null)
			{
				boolean check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equals(NodeOfWords.get(k)))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i)));
				}
			}
			else
			{
				words.add(new Struct(NodeOfWords.get(i)));
			}
		}
		for (int i = 0; i < words.size(); i++)
		{
			if (words.get(i).getCount() == count)
				answer.add(words.get(i).getWord());
		}
		return (answer);
	}

	public List<String> getWordsHavingLength(int lenght)
	{
		List<String> answer = null;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (NodeOfWords.get(i).length() == lenght)
			{
				boolean check = false;
				for (int k = 0; k < answer.size(); k++)
				{
					if (NodeOfWords.get(i).equals(answer.get(k)))
						check = true;
				}
				if (!check)
					answer.add(NodeOfWords.get(i));
			}
		}
		return (answer);
	}

	public String getMostFrequentWord()
	{
		List<Struct> words = null;
		String answer = null;
		int max = 0;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (words.size() != 0)
			{
				boolean check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equals(NodeOfWords.get(k)))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i)));
				}
			}
			else
			{
				words.add(new Struct(NodeOfWords.get(i)));
			}
		}
		for (int i = 0; i < words.size(); i++)
		{
			if (words.get(i).getCount() > max)
			{
				max = words.get(i).getCount();
				answer = words.get(i).getWord();
			}
		}
		return (answer);
	}

	public double getAverageWordCount()
	{
		List<Struct> words = null;
		double answer = 0;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (words.size() != 0)
			{
				boolean check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equals(NodeOfWords.get(k)))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i)));
				}
			}
			else
			{
				words.add(new Struct(NodeOfWords.get(i)));
			}
		}
		for (int i = 0; i < words.size(); i++)
		{
			answer += words.get(i).getCount();
		}
		answer /= words.size();
		return (answer);
	}

	public int getUniqueWordCount()
	{
		return(getWordsHavingCount(1).size());
	}
}
