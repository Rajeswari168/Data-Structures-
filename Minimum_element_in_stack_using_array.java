import java.util.*;
class Main{
    int size;
    int stack[];
    int top;
    Main(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int val){
        if(top == size-1){
            System.out.println("Overflow");
        }else{
            stack[++top] = val;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Underflow");
        }else{
            int c = stack[top--];
            System.out.println(c);
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("underflow");
        }else{
            System.out.println(stack[top]);
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("underflow");
        }else{
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    public void Minele(){
        if(top == -1){
            System.out.println("underflow");
        }else{
            int min = stack[0];
            for(int i=1;i<=top;i++){
                if(stack[i] < min){
                    min = stack[i];
                }
            }
            System.out.println(min);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main obj = new Main(n);
        while(true){
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    int val = sc.nextInt();
                    obj.push(val);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    obj.Minele();
                    break;
                case 6:
                    return;
            }
        }
    }
}
