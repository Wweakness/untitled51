import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] a=str.split(" ");

        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

    }
}
