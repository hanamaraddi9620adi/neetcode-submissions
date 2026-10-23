class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        if(s.length() != t.length()){
            return false;
        }
        else{
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1,char2)){
                return true;
            }
            else{
                return false;
            }
            
        }
    }
}
