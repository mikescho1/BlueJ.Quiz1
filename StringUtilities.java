
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       return null;
    }


    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String word1 = word;
        
        int num = word1.length() / 2;
        
        
        
        
        return word.charAt(num);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newStr1 = value;
        Character character1 = charToRemove;
        
        String [] splitted = newStr1.split("");
        
        
        for (int i = 0; i < splitted.length; i++)   {
            
            if(splitted[i] == character1)       {
                
            
        
        
        
        
        return newStr2;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String [] splitted = sentence.split(" ");
        String word = splitted[splitted.length - 1];;
        
        
        return word;
    }
}
