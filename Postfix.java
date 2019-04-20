package postfix;
import java.io.*;
import java.util.*;
public class Postfix 
{
    public final static Scanner input= new Scanner(System.in);
    static int lookahead;
    public Postfix() throws IOException
    {
        lookahead=System.in.read();
    }
    void expr()throws IOException
    {
        term();
        while(true)
        {
            if (lookahead=='+')
            {
                match('+');
                term();
                System.out.write('+');
            }
            else if (lookahead=='-')
            {
                match('-');
                term();
                System.out.write('-');
            }
            else
                return;
        }
    }
    void term()throws IOException
    {
        if(Character.isDigit((char)lookahead))
        {
            System.out.write((char)lookahead);
            match(lookahead);
        }
            else
            throw new Error("syntax error");
    }
    void match(int t) throws IOException
    {
        if(lookahead==t)
            lookahead=System.in.read();
        else
            throw new Error("Syntax error");
    }
    
    public static void main(String[] args)throws IOException
    {
        System.out.print("Enter infix expression: ");
        Postfix t= new Postfix();
        t.expr();
        System.out.write('\n');
        
    }
}
