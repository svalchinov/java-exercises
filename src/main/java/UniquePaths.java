public class UniquePaths {

    public int uniquePathsWithObstacles(int m, int n) {
        // create row of items
        int[] row = new int[n];

        // first grid item has single unique path
        row[0] = 1;

        // loop through rows
        for (int v = 0; v < m; v++) {

            // loop through row items
            for (int i = 1; i < n; i++) {

                // unique paths = sum of right and bottom steps to a given grid item
                // right step number = row item index
                // bottom step = row item value
                row[i] = row[i] + row[i - 1];
            }
        }
        return row[row.length-1];
    }
}