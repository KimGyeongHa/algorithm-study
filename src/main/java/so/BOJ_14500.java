package so;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14500 {

    static int[] arr;
    static boolean[] visit;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int [m];
        visit = new boolean[n];

        dfs(0);
    }

    private static void dfs(int depth) {
        if(depth == m) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                arr[depth] = i + 1;
                visit[i] = true;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }

}
