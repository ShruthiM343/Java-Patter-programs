import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(k+"  ");
                k+=2;
            }
            System.out.println();
        }
        
        
    }
    
}
