package DOIT.chapter3;

public class SeqSearchFor {

    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return a[i];
            }
        }
        return n;
    }
}
