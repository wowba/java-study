package java_start.array;

public class Array {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언, 타입 앞에 대괄호 사용
        students = new int[5]; // 배열의 길이는 5
        // 배열을 생성한 뒤, 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값 주소를 반환한다.
        System.out.println(students); // 참조값 주소 반환

        // 변수 값 대입
        // 인덱스는 0부터 시작
        students[0] = 100;
        students[1] = 90;
        students[2] = 80;
        students[3] = 70;
        students[4] = 60;
        // students[4] = "string" 오류, 다른 타입을 할당할 수 없다.
        // students[5] = 50; 배열의 범위 이상 할당할 수 없다.

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + i + "성적 : " + students[i]);
        }

        // 배열의 생성과 초기화 한 줄에서 처리
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] shortNums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            System.out.println(shortNums[i]);
        }

        // 2차원 배열
        int[][] arr = new int[2][3];
    }
}
