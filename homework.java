
import java.util.Scanner; //引入SCANNER功能

public class homework {

   public static void main (String[] args) {
        int num1,num2;
        String text; 
        int result1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入2個數字(以空白鍵分開)：");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("請輸入運算符號(+-*/)：");
        text=scanner.next();
        char symb=text.charAt(0);
        System.out.println("您輸入 = "+ symb);
     
    if (symb=='+'){
        result1 = num1 + num2;   //加法運算

        System.out.println("結果 = "+ result1);
    }
 
 else if (symb=='-'){
        result1 = num1 - num2;   //減法

System.out.println("結果 = "+ result1);
}
 
else if (symb=='*'){
result1 = num1 * num2;   //乘法

System.out.println("結果 = "+ result1);
}
 
else if (symb=='/'){
result1 = num1 / num2;   //除法

System.out.println("結果 = "+ result1);
}
 
else{
    System.out.println("不對喔");
}
}

}
