package LeetCode.Strings;

public class LeetCode1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder d = new StringBuilder();
        StringBuilder c= new StringBuilder();
        for(int i=0;i<word1.length;i++){
            c.append(word1[i]);
        }
        for(int j=0;j<word2.length;j++){
            d.append(word2[j]);
        }
        if(c.toString().equals(d.toString())){
            return true;
        }
        else return false;
    }
}
