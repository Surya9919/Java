import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        ArrayList<Integer> re=new ArrayList<>();
        int temp,j,i=0;
        for(i=0;i<a.length/2;i++)
        {     
            j=a.length-1-i;
            re.add(a[j]);
            re.add(a[i]);
        }
        re.add(a[i]);
        System.out.println(re);
    }
}
