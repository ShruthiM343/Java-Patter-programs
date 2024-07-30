import java.util.Scanner;
public class Pattern75{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n-i;j++){
                k=n-j+i;
                System.out.print(k+" ");
                
            }
            System.out.println();
        }
    }
}

