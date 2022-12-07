package intro;

public class CopyArrayExam {
    static char[] copySource = { 'f', 'g', 'o', 'd', 'a', 'm', 'n' };
    static char[] copyDest = new char[3];

    public static void main(String[] args) {
        System.arraycopy(copySource, 1, copyDest, 0, 3);
        System.out.println(copyDest);
        System.out.println(new String(copyDest));
    }
}
