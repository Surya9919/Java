import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int temp;
       System.out.println("Size of 1st Array");
       int n1=in.nextInt();
       System.out.println("Size of 2nd Array");
        int n2=in.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        int c[]=new int[n1+n2];
        ArrayList<Integer> re=new ArrayList<>();
        System.out.println("Enter 1st Array");
        for(int i=0;i<n1;i++){
            a[i]=in.nextInt();
            re.add(a[i]);
        }
        System.out.println("Enter 2nd Array");
        for(int i=0;i<n2;i++){
             b[i]=in.nextInt();
             re.add(b[i]);
        }
        for(int i=0;i<re.size();i++){
            for(int j=i+1;j<re.size();j++)
            if(re.get(i)==re.get(j))
                re.remove(j);
        }
        for(int i=0;i<re.size();i++)
            for(int j=i;j<re.size();j++)
            if(re.get(i)>re.get(j)){
                temp=re.get(i);
                re.set(i,re.get(j));
                re.set(j,temp);
        }
        System.out.println("Merged Array");
        System.out.println(re);
}
}