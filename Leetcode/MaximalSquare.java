public class MaximalSquare {

    public static int maximalSquare(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxSquareLength = 0;

        for (int i = 0; i < m; i++) {
            // Update the heights array for the current row
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            
            // Sort the heights array to use it for finding the largest square
            int[] sortedHeights = heights.clone();
            Arrays.sort(sortedHeights);
            
            // Check the maximum square length possible with sorted heights
            for (int j = 0; j < n; j++) {
                int currentSquareLength = Math.min(sortedHeights[j], n - j);
                maxSquareLength = Math.max(maxSquareLength, currentSquareLength);
            }
        }
        
        return maxSquareLength * maxSquareLength;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        int result = maximalSquare(matrix);
        System.out.println("The area of the largest square is: " + result);
    }
}
