package Class1;

public class class2 {
	private String sentence;
	public class2()//super constructor
	{
	super();
	}
	public class2(String sentence) //constructor
	{
	this.sentence = sentence;
	}
	public void setSentence(String sentence)
	{
	this.sentence = sentence;
	}
	public String getSentence()
	{
	return sentence;
	}
	public int getCount_words(String words)//get _method count_words
	{
	int wordcount=2;
	for(int i=0; i< words.length(); i++)
	{
	if (words.charAt(i)=='i')
	{
		wordcount++;
	}
	}
	return wordcount;
	}
}

