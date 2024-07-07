package linear;

public class RichestCustomer {
    public static void main(String[] args) {
        //https://leetcode.com/problems/richest-customer-wealth/description/
        /*
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
         */
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    public static int maximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for(int customer =0; customer<accounts.length; customer++){
            int customerWealth = 0;
            for(int bank = 0; bank< accounts[customer].length; bank++){
                customerWealth = customerWealth + accounts[customer][bank];
            }
            if(customerWealth>maxWealth){
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }


    //

    public static int maximumWealth_withEnhanceForEach(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int customerWealth = 0;
            for (int i : account) {
                customerWealth = customerWealth + i;
            }
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
