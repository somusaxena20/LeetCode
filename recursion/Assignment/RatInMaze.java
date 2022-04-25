package Assignment;

import java.util.ArrayList;

public class RatInMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> l = new ArrayList<>();

        int[][] v = new int[n][n];

        if (m[0][0] == 1) {
            solve(0, 0, m, n, l, "", v);
        }

        return l;
    }

    private static void solve(int i, int j, int[][] m, int n, ArrayList<String> l, String s, int[][] v) {
        if (i == n - 1 && j == n - 1) {
            l.add(s);
            return;
        }

        // DOWNWORD

        if (i + 1 < n && v[i + 1][j] == 0 && m[i + 1][j] == 1) {
            v[i][j] = 1;
            solve(i + 1, j, m, n, l, s + "D", v);
            v[i][j] = 0;
        }

        // LEFT

        if (j - 1 >= 0 && v[i][j - 1] == 0 && m[i][j - 1] == 1) {
            v[i][j] = 1;
            solve(i, j - 1, m, n, l, s + "L", v);
            v[i][j] = 0;
        }

        // RIGHT

        if (j + 1 < n && v[i][j + 1] == 0 && m[i][j + 1] == 1) {
            v[i][j] = 1;
            solve(i, j + 1, m, n, l, s + "R", v);
            v[i][j] = 0;
        }

        // UP

        if (i - 1 >= 0 && v[i - 1][j] == 0 && m[i - 1][j] == 1) {
            v[i][j] = 1;
            solve(i - 1, j, m, n, l, s + "U", v);
            v[i][j] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 1, 1, 1 }};
        System.out.println(findPath(a,a.length));
    }
}
