import CayNhiPhan.NhiPhanDeQuy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập value (nhập 1000 sẽ dừng lại)= ");
        int num = 0;
        int i = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        while (i<5) {
            integers.add(num);
            num= scanner.nextInt();
            i++;
        }
        NhiPhanDeQuy.sapXep(integers);
        System.out.println(integers);
        System.out.println("______________tìm kiếm đệ quy test");
        int search = scanner.nextInt();
        System.out.println(NhiPhanDeQuy.binarySearch(integers,0,integers.size()-1,search));
    }
}
