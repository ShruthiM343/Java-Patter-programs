import java.util.Scanner;
public class Pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=i+4;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}