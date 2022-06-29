package part2;

public class ClassObj {
    boolean b;
    public ClassObj(boolean b)
    {
        this.b=b;
    }
    void miss(String s, char a[]) {
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                if (s.charAt(i) == a[j]) {
                    b = false;
                }
            }
            if (b) {
                System.out.print(s.charAt(i));
            }
            b = true;
        }
        System.out.print("\n");

    }
}
