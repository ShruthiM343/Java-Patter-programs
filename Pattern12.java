import java.util.Scanner;
class Pattern12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(((j*n)+i)+" ");
            }
            System.out.println();
        }
    }
}