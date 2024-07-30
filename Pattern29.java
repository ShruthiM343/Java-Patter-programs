import java.util.Scanner;
public class Pattern29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        char c='A';
        char start=' ';
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                start=(char)(c+j-1);
                System.out.print(start+" ");
            }
            System.out.println();
        }
    }
}
