class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=word.indexOf(ch);
        if(pos != -1){
            return new StringBuilder(word.substring(0, pos+1)).reverse() + 
            word.substring(pos+1);
        }
        else{
            return word;
        }
    }
}