import java.util.Scanner;
public class Pattern37{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print((n-i)+" ");
            }
            System.out.println();
        }
    }
}
