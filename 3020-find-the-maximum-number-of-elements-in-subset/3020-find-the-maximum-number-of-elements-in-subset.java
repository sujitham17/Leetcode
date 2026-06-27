class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put((long) num,
                    freq.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;
        if (freq.containsKey(1L)) {
            int count = freq.get(1L);

            if (count % 2 == 0)
                ans = Math.max(ans, count - 1);
            else
                ans = Math.max(ans, count);
        }

        for (long num : freq.keySet()) {

            if (num == 1)
                continue;

            long curr = num;
            int len = 0;

            while (freq.getOrDefault(curr, 0) >= 2) {
                len += 2;
                curr = curr * curr;

                if (curr > 1_000_000_000_000L)
                    break;
            }

            if (freq.containsKey(curr)) {
                len += 1;
            } else {
                len -= 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}