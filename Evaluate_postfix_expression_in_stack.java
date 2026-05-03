import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }else{
                String b=st.pop();
                String a=st.pop();
                String res=a+ch+b;
                st.push(res);
            }
        }
        System.out.print(st.pop());
    }
}
