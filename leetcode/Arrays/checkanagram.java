

class CheckAnagaram {
    public static boolean isAnagram(String s, String t) {
        int[] map = new int[26];

        // if lengths are not equal then it's 
        // definitely not a anagram
        if(s.length()!=t.length()){
            return false;
        }

        // keep track of the count of charectors using a array;
        for(int i =0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for(int i =0;i<26;i++){
            if(map[i]!=0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}