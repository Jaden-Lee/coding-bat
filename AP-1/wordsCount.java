public class wordsCount {
    public int wordsCount(String[] words, int len) {
        return words.length == 1 ? words[0].length() == len ? 1 : 0 : words[0].length() == len ? 1 + wordsCount(Arrays.copyOfRange(words,1,words.length),len) : + wordsCount(Arrays.copyOfRange(words,1,words.length),len);
    }      
}