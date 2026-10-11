class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> checker = new HashMap<>();
        HashMap<Character, Integer> checker2 = new HashMap<>();

        if (s.length() != t.length()) {return false;}

        for(int i = 0; i < s.length(); i++){

            checker.put(s.charAt(i), checker.getOrDefault(s.charAt(i), 0) + 1);
            checker2.put(t.charAt(i), checker2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return checker.equals(checker2);

    }
}
