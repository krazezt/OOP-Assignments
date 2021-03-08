package Bai2;

public class Triangle {
    public int height;
    public void setHeight(int x) {
        this.height = x;
    }

    public int getHeight(int x) {
        return this.height;
    }

    public void display() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.height-i; j++) System.out.print(" ");
            for (int j = 0; j < 2*i+1; j++) System.out.print("*");
            System.out.print("\n");
        }
    }
}