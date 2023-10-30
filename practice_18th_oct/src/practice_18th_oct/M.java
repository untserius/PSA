package practice_18th_oct;

public class M 
{
    public static void main(String[] args) 
    {
        int i=12, j=8, a=5, b=10, c=4, z, k;
         
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        
        z = --a + b++ - c-- - --c + ++b - --a + b-- - --a;
         
        System.out.println(i);cal
        System.out.println(j);
        System.out.println(k);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);        
    }
}
