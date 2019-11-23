import java.io.*;
import java.util.*;
import Struct.java;
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
				StringTokenizer tmp = new StringTokenizer(line, " .?![]{}/\\\'\",-\n\t\v1234567890", false);  //bro, read how the flag works
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
			n += this.NodeOfWords.get(i).size();
		}
		return (n);
	}

	public List<String> getWordsHavingCount(int count)
	{
		List<Struct> words;
		List<String> answer;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (word.size() != 0)
			{
				bool check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equal(NodeOfWords.get(k))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i));
				}
			}
			else
			{
				words.add(new Struct(NodeOfWords.get(i)));
			}
		}
		for (int i = 0; i < words.size; i++)
		{
			if (words.get(i).getCount() == count)
				answer.add(words.get(i));
		}
		return (answer);
	}

	public List<String> getWordsHavingLength(int lenght)
	{
		List<String> answer;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (NodeOfWords.get(i) == lenght)
			{
				bool check = false;
				for (int k = 0; k < answer.size(); k++)
				{
					if (NodeOfWords.get(i).equal(answer.get(k)))
						check = true;
					}
					if (!check)
						answer.add(NodeOfWords.get(i));
				}
			}
		}
		return (answer);
	}

	public String getMostFrequentWord()
	{
		List<Struct> words;
		String answer;
		int max = 0;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (word.size() != 0)
			{
				bool check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equal(NodeOfWords.get(k))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i));
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
				answer = words.get(i);
			}
		}
		return (answer);
	}

	public double getAverageWordCount()
	{
		List<Struct> words;
		double answer = 0;

		for (int i = 0; i < NodeOfWords.size(); i++)
		{
			if (word.size() != 0)
			{
				bool check = false;
				for (int k = 0; k < words.size(); k++)
				{
					if (words.get(k).equal(NodeOfWords.get(k))
					{
						words.get(k).addCount();
						check = true;
					}
				}
				if(!check)
				{
					words.add(new Struct(NodeOfWords.get(i));
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
