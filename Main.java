import java.util.Scanner; //引入SCANNER功能
class cnt { 
    private int num1; 
    private int num2;  
    private int result;
    
    public cnt(int num1, int num2) {  
        this.num1 = num1; 
        this.num2 = num2; 
    }

    public int add() {  //加
        result=num1+num2;
        return result ; 
    }
     public int minus() { //減
        result=num1-num2;
        return result ; 
    }
     public int times() { //乘
        result=num1*num2;
        return result ; 
    }
    public int divion() { //除
        result=num1/num2;
        return result ; 
    }
    public int result() { //結果
        return result; 
    }
}

public class Main { 
    public static void main(String[] args) { 
        //
        int num1,num2;
        String text; 
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入2個數字(以空白鍵分開)：");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("請輸入運算符號(+-x/)：");
        text=scanner.next();
        char symb=text.charAt(0);
        
        cnt c1 = new cnt(num1, num2);
        if(symb=='+'){
            c1.add();
            System.out.println("結果:"+c1.result());
        }else if(symb=='-'){
           c1.minus();
            System.out.println("結果:"+c1.result());   
        }else if(symb=='x'){
            c1.times();
            System.out.println("結果:"+c1.result());
        }else if(symb=='/' && num1!=0 && num2!=0){
            
            c1.divion();
            System.out.println("結果:"+c1.result());    
        }else if(symb=='/' && (num1==0 || num2==0)){
           
                System.out.println("輸入數字不可為0");

        }else{
         System.out.println("打錯惹");   
        }
    } 
} 
