class Solution {
    public int minCost(int[][] costs) {

        int costR = helper(costs,  0, 0, 0);
        int costB = helper(costs,  1, 0, 0);
        int costG = helper(costs,  2, 0, 0);

        return Math.min(Math.min(costR, costB), Math.min(costB, costG));



    }

    private int helper(int[][] costs, int i, int n,  int minimumCost)
    {
        if(n >= costs.length) return minimumCost;

        if(i == 0)
        {
            return Math.min(
                    (helper(costs, 1 , n + 1, minimumCost + costs[n][i]))
                    ,
                    (helper(costs, 2 , n + 1, minimumCost + costs[n][i])));

        }
        if(i == 1)
        {
            return Math.min(
                    (helper(costs, 0 , n + 1, minimumCost + costs[n][i]))
                    ,
                    (helper(costs, 2 , n + 1, minimumCost + costs[n][i])));

        }
        if(i == 2)
        {
            return Math.min(
                    (helper(costs, 0 , n + 1, minimumCost + costs[n][i]))
                    ,
                    (helper(costs, 1 , n + 1, minimumCost + costs[n][i])));

        }

        return minimumCost;

    }
}