import java.util.Scanner;
public class Pattern40{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=2*i;j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

