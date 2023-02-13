import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        String t="HelloWorld";
        ArrayList<Character> s=new ArrayList<>();
        int count;
        for(int i=0;i<t.length();i++)
             s.add(t.charAt(i));
            for(int i=0;i<s.size();i++){
                count=1;
                for(int j=i+1;j<s.size();j++){
                    if(s.get(i)==s.get(j)){
                         count++;
                         s.remove(j);
                    }
                }
                System.out.println(s.get(i)+":count is:"+count);
            }
                        System.out.println(s.toString()
                        .substring(1,3*s.size() - 1)
                        .replaceAll(", ", ""));

                        
        }
       
    }
