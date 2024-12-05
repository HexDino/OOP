import java.util.*;
public class MazeSolver {
    static class Position {
        int row;
        int col;
        int steps;

        Position(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int startR = sc.nextInt() - 1;
        int startC = sc.nextInt() - 1; 
        sc.nextLine(); 

        int[][] maze = new int[n][m];
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            for(int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(parts[j]);
            }
        }
        if(startR < 0 || startR >= n || startC < 0 || startC >= m || maze[startR][startC] == 1) {
            System.out.println(-1);
            return;
        }
        if(isBoundary(startR, startC, n, m)) {
            System.out.println(0);
            return;
        }

        boolean[][] visited = new boolean[n][m];
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(startR, startC, 0));
        visited[startR][startC] = true;
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while(!queue.isEmpty()) {
            Position current = queue.poll();

            for(int i = 0; i < 4; i++) {
                int newRow = current.row + dRow[i];
                int newCol = current.col + dCol[i];
                int newSteps = current.steps + 1;
                if(newRow < 0 || newRow >= n || newCol < 0 || newCol >= m)
                    continue;
                if(maze[newRow][newCol] == 1 || visited[newRow][newCol])
                    continue;
                if(isBoundary(newRow, newCol, n, m)) {
                    System.out.println(newSteps + 1);
                    return;
                }
                queue.offer(new Position(newRow, newCol, newSteps));
                visited[newRow][newCol] = true;
            }
        }
        System.out.println(-1);
    }
    private static boolean isBoundary(int row, int col, int n, int m) {
        return row == 0 || row == n-1 || col == 0 || col == m-1;
    }
}
