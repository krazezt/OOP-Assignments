package Bai5;

public class matricObj {
    private int iMatric[][][] = new int[2][][];
    private int size;

    public void setValues(int sizeToSet, int matricToSet_1[][], int matricToSet_2[][]) {
        this.setSize(sizeToSet);
        this.iMatric[0] = matricToSet_1;
        this.iMatric[1] = matricToSet_2;
    }

    public int[][][] getValues() {
        return this.iMatric;
    }

    private void setSize(int sizeToSet) {
        this.size = sizeToSet;
    }

    public void display() {
        for (int x = 0; x < 2; x++) {
            System.out.printf("Ma tran %d :\n", x+1);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("%-6d", this.iMatric[x][i][j]);
                }
                System.out.println("");
            }
        }
    }
}
