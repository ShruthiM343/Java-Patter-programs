import java.util.Scanner;
public class Pattern38{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>n-1-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

