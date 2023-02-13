public class ex4 {
    static void a(int a){
        System.out.println(a);
    }
    static void a(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        String s="testr133strin13g";
        String ss="133";
        int i=0;
        for(i=0;i<s.length()-ss.length();i++){
            if(ss.equals(s.substring(i,i+ss.length())) ){
                System.out.println(i);
                break;
            } 
            else if(i==s.length()-ss.length()-1){
            System.out.println("-1");
        }
        }
     
    }
}
