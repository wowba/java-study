package java_start.array;

public class TwoDArr {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // 배열에 길이에 맞춰 자동으로 요소 추가
        int[][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i;
                i = i + 1;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }
}
