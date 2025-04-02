package basics;

public class Arrays {
    public static void main(String[] args) {
        int [][] accounts =new int[2][];
        accounts[0] = new int[]{1, 1, 3};
        accounts[1] = new int[]{3, 2, 1};

        int maxWealth = 0;  // Initialize variable to store the maximum wealth

        // Iterate through each account (row in accounts)
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;  // Variable to calculate wealth of the current account

            // Sum the wealth in the current account
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            // Update maxWealth if currentWealth is greater
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        System.out.println(maxWealth);
    }
}
