package MathsForDsa.Assignments;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }
    public static int titleToNumber(String columnTitle) {
        int result=0;
        for (char c : columnTitle.toCharArray()) {
            int d=c-'A'+1;
result=result*26+d;
        }
        return result;
    }
}
