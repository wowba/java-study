package java_basic.memory.ex;

public class Math {

    private Math() {
        // Math 인스턴스 생성 방지
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public static float average(int[] arr) {
        int sum = sum(arr);
        return (float) sum / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int item : arr) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }
}
