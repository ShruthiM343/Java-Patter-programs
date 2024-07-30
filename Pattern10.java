import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(j%2==0){
                    System.out.print((j/2)+"  ");
                }
                else{
                    System.out.print(i+"  ");
                }
               
            }
            System.out.println();
        }
        
        
    }
    
}
