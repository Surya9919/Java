import java.util.ArrayList;

public class zigzag {
    public static void main(String[] args) {
        String s="123456789";
        int numRows=6;
        int d=1,cc=1;
        int in=numRows+(numRows-3),intr=0;
        if(numRows==1)
            System.out.println(s);
        else {
            ArrayList<Character> oo=new ArrayList<>();
            intr=in;
            
            for(int i=0;i<numRows;i++){
                int j=i; 
                d=1;       
                while(j<s.length()){
                    oo.add(s.charAt(j));
                    if(i==0 || i==numRows-1)
                        j=j+intr+1;
                    else if(d%2==1){
                        j=j+intr+1;
                        d++;
                    }
                    else{
                        j=j+1+cc;
                        d++;
                    }
                }
                if(i!=0)
                    cc=cc+2;
                intr=intr-2;
                if(intr<=0)
                    intr=in;
            }
            System.out.println(oo);
        }
    }
}