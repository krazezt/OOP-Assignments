package Bai4;

public class arrayToSort {
    private int[] arr;
    
    public void setValuesOfArray(int arrToSet[]) {
        this.arr = arrToSet;
    }

    public int setValue(int value, int vt) {
        if (this.arr.length >= vt) this.arr[vt] = value;
        else return 0;
        return 1;
    }

    public int[] getValue() {
        return this.arr;
    }

    public void sort() {
        this.quickSort(0, this.arr.length-1);
    }

    private int partition(int low, int high) {
        int pivot = this.arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (this.arr[j] < pivot) {
                i++;
                int temp = this.arr[i];
                this.arr[i] = this.arr[j];
                this.arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        this.arr[i + 1] = this.arr[high];
        this.arr[high] = temp;

        return i + 1;
    }

    private void quickSort(int l, int r) {
        if (l < r) {
            int pi = partition(l, r);

            quickSort(l, pi - 1);
            quickSort(pi + 1, r);
        }
    }
}
