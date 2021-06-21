import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input list size");
        int listSize = input.nextInt();
        int[] list = new int[listSize];
        for (int i = 0; i < list.length; i++) {
            System.out.println("input list element no:" + i);
            list[i] = input.nextInt();
        }

        for (int i : list) {
            System.out.println(i);
        }
        InsertionSortMethod(list);
        System.out.println();
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static void InsertionSortMethod(int[] list) {
        int pos, x;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            if (list[pos] == x) {
                System.out.println("Same Element nothing change");
            } else {
                System.out.println("Swapping " + list[pos] + " And " + x);
            }
            list[pos] = x;
        }
    }
}
