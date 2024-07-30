import java.util.Scanner;
public class Pattern32{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        char c='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char l=(char)(c+i+j*n);
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
