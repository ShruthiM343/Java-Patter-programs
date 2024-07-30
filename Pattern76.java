import java.util.Scanner;
public class Pattern76{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0 ;j<=n-1-i;j++){
                System.out.print((n-i+j)+" ");
            }
            System.out.println();
        }
    }
}

