public class TextProcessorHarness {
   public static void main(String args[]) {
   
      TextProcessor tp = new TextProcessor("C:\\Users\\samka\\Desktop\\stuff\\java-like-things\\TextProcessor\\test.txt");
      int wordCount = tp.getWordCount();
      System.out.println("There are " + wordCount + " words in the input file.");
      long fileLength = tp.getFileLength();
      System.out.println("The length of the file is " + fileLength + "bytes.");
      String fileName = tp.getFileName();
      System.out.println("The input file name is " + fileName);
      String word = "rose";
      wordCount = tp.countThisWord(word);
      System.out.println("The word \"" + word + "\" appears " + wordCount + " times in the file " + fileName + ".");
      wordsHavingCount = tp.getWordsHavingCount(count);
      System.out.println("Here are the words that appear " + count + " times in this text: " + wordsHavingCount);
      wordsHavingLength = tp.getWordsHavingLength(count);
      System.out.println("Here are the words that have " + count + " many characters: " + wordsHavingLength);
      mostFrequentWord = tp.getMostFrequentWord();
      System.out.println("The most frequent word in this text is " + mostFrequentWord);
      averageWordCount = tp.getAverageWordCount();
      System.out.println("The average frequency of words in this text is " + averageWordCount);
      uniqueWordCount = tp.getUniqueWordCount();
      System.out.println("The number of unique words in this text is " + uniqueWordCount);
      
   }
   
}