import java.io.*;
public class Aoperator
{
    public static void main(String[] args)throws IOException {
        int add,sub,mul,div,mod;
        int num1=5,num2=8;
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        mod=num2%num1;
        System.out.println("addition num1+num2"+add);
        System.out.println("subtraction num1-num2"+sub);
        System.out.println("multiplication num1*num2"+mul);
        System.out.println("division num1/num2"+div);
        System.out.println("modulus num2%num1"+mod);
    }
}
