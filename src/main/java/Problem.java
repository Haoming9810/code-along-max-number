public class Problem {
    public static int findMax(final int[] input) {
        if (input == null || input.length == 0) {
            return -1;
        }

        int maxVal = input[0], maxIdx = 0;
        for (int i = 0; i < input.length; i++) {
            if (maxVal < input[i]) {
                maxVal = input[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
