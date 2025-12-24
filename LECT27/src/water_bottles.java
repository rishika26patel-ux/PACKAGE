class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newFullBottles = emptyBottles / numExchange;
            int leftoverEmpties = emptyBottles % numExchange;

            totalDrunk += newFullBottles;
            emptyBottles = newFullBottles + leftoverEmpties;
        }
        return totalDrunk;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numBottles1 = 9;
        int numExchange1 = 3;
        System.out.println("For 9 bottles, 3 exchange: " + sol.numWaterBottles(numBottles1, numExchange1)); // Output: 13

        int numBottles2 = 15;
        int numExchange2 = 4;
        System.out.println("For 15 bottles, 4 exchange: " + sol.numWaterBottles(numBottles2, numExchange2)); // Output: 19
    }
}
