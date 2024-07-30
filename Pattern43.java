import java.util.Scanner;
public class Pattern43{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<n*2;i+=2){
            for(int j=i;j<i*2;j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

