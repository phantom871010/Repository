import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a = 0.26418f;
        Scanner aaa = new Scanner(System.in);
        int b = aaa.nextInt();
        System.out.println(Math.round(a*b*10f)/10f);
    }
}
