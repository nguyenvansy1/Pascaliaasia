public class RecursiveFunctions {
    public static int square(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        else {
            return num * num;
        }
    }

    // ví dụ
    public static void main(String[] args) {
        int result = square(5);
    }
}
