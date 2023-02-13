import java.util.ArrayList;
import java.util.Arrays;

public class P3 {
    public static void main(String[] args) {
        int count;
        String a="this is my dog";
        String b="this is my car";
        String c="that about you";
        ArrayList<String> r=new ArrayList<>(Arrays.asList(a.split(" ")));
        ArrayList<String> sr=new ArrayList<>();
        r.addAll(Arrays.asList(b.split(" ")));
        r.addAll(Arrays.asList(c.split(" ")));
        for(int i=0;i<r.size();i++){
            count=0;
            for(int j=i+1;j<r.size();j++){
                if(r.get(i).equals(r.get(j))){
                    r.remove(j);
                    count++;
                }
            }
            if(count==0)
                sr.add(r.get(i));
        }
        for(int i=0;i<sr.size();i++)
        System.out.print(" "+sr.get(i));
        
    }
}
