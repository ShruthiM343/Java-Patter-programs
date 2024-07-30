import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
