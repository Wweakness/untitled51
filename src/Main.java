import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        char[] a=s2.toCharArray();
        for(int i=0;i<a.length;i++){
            s1=s1.replace(String.valueOf(a[i]),"");
        }
        System.out.println(s1);
    }
}
