class Solution {
    private long combinations(long n) {
        if (n < 0) {
            return 0;
        }
        return (n + 1) * (n + 2) / 2;
    }

    public long distributeCandies(int n, int limit) {
        long allCombinations = combinations(n);
        long oneAboveLimitCombinations = 3 * combinations(n - (limit + 1));
        long twoAboveLimitCombinations = 3 * combinations(n - 2 * (limit + 1));
        long threeAboveLimitCombinations = combinations(n - 3 * (limit + 1));

        long invalidCombinations = oneAboveLimitCombinations - twoAboveLimitCombinations + threeAboveLimitCombinations;
        long validCombinations = allCombinations - invalidCombinations;
        return validCombinations;
    }
}