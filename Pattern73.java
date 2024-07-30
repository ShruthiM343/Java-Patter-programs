import java.util.Scanner;
public class Pattern73{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int a=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(a+" ");
            }
            a--;
            System.out.println();
        }
    }
}

