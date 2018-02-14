class MaxPath{

public int getMaxPath(int[][] field){
if (fild==null|| field.length==0 || field[0] ==null || field[0].length==0) return -1;
int R = field.length;
int C = field[0].length;
int memo[][] = new int[R][C];

for (int i=0 ; i != R ; i++)
    for (int j = 0 ; j != C ; j++)
        memo[i][j] = -1;
    return max(0, 0, field);

}
public int max(int r, int c, int[][] field) {
    if (memo[r][c] != -1) return memo[r][c];
    int down = 0; right = 0;
    if (r != R) down = max(r+1, c, field);
    if (c != C) right = max(r, c+1, field);
    return memo[r][c] = (field[r][c] + Math.max(down, right));
}
}
