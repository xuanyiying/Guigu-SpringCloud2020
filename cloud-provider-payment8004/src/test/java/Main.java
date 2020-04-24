import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xuanyiying
 * Created on 2020/3/9  20:06
 */
public class Main {
    public static void main(String[] args) {
        manyLine(args);
    }

    public static void manyLine(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array1, array2;
        array1 = sc.nextLine().replace(" ", "").toCharArray();
        array2 = sc.nextLine().replace(" ", "").toCharArray();
        sc.nextLine();
        int countA = 0, countB = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] == array2[j] && i == j) {
                    countA++;
                } else if (array1[i] == array2[j]) {
                    countB++;
                }
            }
        }
        System.out.println(countA + "A" + countB + "B");
    }

    public static void singleLine(String[] args) {
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // 读取一行
        System.out.println("输出：");
        System.out.println(str);
        String[] strIn = str.trim().split(" ");  // 以空格分割
        System.out.println(Arrays.toString(strIn));
    }

    public static void manyLineManyItem(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();  // 很重要，跳到第二行
        // 若直接确定行数，注释掉上面两行，加入下面一行
        // int m = 3;
        String[] strArr = new String[m];
        // 从第二行开始读取
        for (int i = 0; i < m; i++) {
            strArr[i] = sc.nextLine();
        }
        System.out.println("输出：");
        System.out.println(Arrays.toString(strArr));
        ArrayList<String[]> strToOne = new ArrayList<String[]>();
        for (int i = 0; i < m; i++) {
            String[] tmp = strArr[i].trim().split(" ");
            strToOne.add(tmp);
        }
        System.out.println(strToOne);
        // 形象点显示
        System.out.print("[");
        for (int i = 0; i < strToOne.size(); i++) {
            System.out.print(Arrays.toString(strToOne.get(i)));
            if (i != strToOne.size() - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
