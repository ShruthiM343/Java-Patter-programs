import java.util.Scanner;
public class Pattern45{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(a+" "S);
                a+=2;
            }
            System.out.println();
        }
    }
}

