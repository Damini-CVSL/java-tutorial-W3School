public class WordCount{
    public static void main(String[] args){
        String words = "hello this is a example program of word count";
        int wordcount = words.split("\\s").length;
        System.out.println(wordcount);
    }
}