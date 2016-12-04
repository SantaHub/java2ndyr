import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);        
        int i,j,a,b,c,d,n,x;
        System.out.print("Enter the odd number : ");
        n=s.nextInt();
        c=-1;d=0;a=n+1;
        for(i=1;i<=n;i=i+1){
            c=i<=n/2+1?c+2:c-2;
            d=i<=n/2+1?d+1:d-1;
            a=i<=n/2+1?a-2:a+2;
            for(j=0;j<d;j++){
                System.out.print(c+"\t");
            }
            for(b=0;b<a;b++){
                System.out.print("0"+"\t");
            }
            for(j=0;j<d;j++){
                System.out.print(c+"\t");
            }           
            System.out.println("\n");
        }
}}