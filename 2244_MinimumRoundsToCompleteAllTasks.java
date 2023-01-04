class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (int e : map.values()) {
            if (e == 1) return -1;
            count += e/3;
            if(e % 3 != 0) count++;
        }

        return count;
    }
}