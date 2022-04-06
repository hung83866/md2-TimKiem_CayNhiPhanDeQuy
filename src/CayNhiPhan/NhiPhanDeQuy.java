package CayNhiPhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NhiPhanDeQuy {
    public static void sapXep(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int search) {
        if (right >= left) {
            int middle = (right + left) / 2;
            if (array.get(middle) == search) return middle;
            else if (array.get(middle) < search)
                return binarySearch(array, middle + 1, right, search);
            else return binarySearch(array, left, middle - 1, search);
        }
        return -1;
    }
}
