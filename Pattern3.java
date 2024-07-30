import java.util.Scanner;
class Pattern3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
} 
