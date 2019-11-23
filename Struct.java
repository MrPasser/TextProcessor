public class Struct {
	private String word;
	private int count;

	public Struct(String word)
	{
		if (word == null)
		{
			this.word = null;
			this.count = 0;
		}
		else
		{
			this.word = word;
			this.count = 1;
		}
	}

	public void addCount()
	{
		this.count += 1;
	}

	public int getCount()
	{
		return(this.count);
	}

	public String getWord()
	{
		return(this.word);
	}
}