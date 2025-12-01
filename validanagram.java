public class validanagram {
    public ststic void main(String[] args){
        public boolean is Anagram (String s, String t){
            Scanner sc = new Scanner(System.in);
            if (s.length() != t.length()){
                return false;
                int [] count = new int [26];
                for (int i=0; i<s.length(); i++){
                    count[s.charAt(i) - 'a']++;
                    count[t.charAt(i) - 'a']--;
                }
                for (int c : count){
                    if (c !=0){
                        return false;
                    }
                }
            }

        }
    }
}
