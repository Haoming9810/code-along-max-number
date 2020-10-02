public class Problem {
    public static int findMax(final int[] input) {
        if (input == null || input.length == 0) {
            return -1;
        }

        int maxIdx = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[maxIdx] < input[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
