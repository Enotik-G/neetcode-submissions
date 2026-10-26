class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> wordFirst = new HashMap<>();
        Map<Character, Integer> wordSecond = new HashMap<>();
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        
        for (int i = 0; i < chars1.length; i++) {
            if (!wordFirst.containsKey(chars1[i])) {
                wordFirst.put(chars1[i], 1);
            } else {
                wordFirst.put(chars1[i], wordFirst.get(chars1[i]) + 1);
            }
        }

        for (int i = 0; i < chars2.length; i++) {
            if (!wordSecond.containsKey(chars2[i])) {
                wordSecond.put(chars2[i], 1);
            } else {
                wordSecond.put(chars2[i], wordSecond.get(chars2[i]) + 1);
            }
        }

        return wordFirst.equals(wordSecond);
    }
}
