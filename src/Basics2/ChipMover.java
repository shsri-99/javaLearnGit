package Basics2;

public class ChipMover {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // The minimum cost is to move the smaller group to the other.
        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        ChipMover cm = new ChipMover();

        System.out.println(cm.minCostToMoveChips(new int[]{1, 2, 3}));          // Output: 1
        System.out.println(cm.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));    // Output: 2
        System.out.println(cm.minCostToMoveChips(new int[]{1, 1000000000}));    // Output: 1
    }
}
