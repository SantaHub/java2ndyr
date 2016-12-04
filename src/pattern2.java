import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);        
        int i,j,a,b,c,d,n,x;
        System.out.print("Enter the odd number : ");
        n=s.nextInt();
        c=n+2;
        b=(n+1)/2;
        System.out.println("");
        for(i=1;i<=n;i++){
            if(i<=b){
                x=i;
                c=c-2;
            }else{
                x=((n-i)+1);
                c=c+2;
            }
            for(j=1;j<=c;j++){
                if(((x<=b)&&(x==i))||((i>=b)&&(x<i)&&(x<b))){
                    a=1;
                    if(b-i>0) {
                        while(a<i){
                            System.out.print("*"+"\t");
                            a++;
                        }
                    }
                    else{   
                        while(a<=n-i){
                            System.out.print("*"+"\t");
                            a++;
                        }
                    }
                }
                System.out.print(x+"\t");
                if(((j+n-i==x)&&(x>=b))||((i+j-1==x)&&(x>=b))){
                    d=1;
                    if(b-i>0){
                        while(d<i){
                            System.out.print("*"+"\t");
                            d++;
                        }
                    }
                    else{
                        while(d<=n-i){
                            System.out.print("*"+"\t");
                            d++;
                        }
                    }
                }
                x+=2;
            }
            System.out.println("\n");
        }
}}