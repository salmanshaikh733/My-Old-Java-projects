
package testexample1;

/**
 *
 * @author mshaikh0798
 */
public class TestExample1 {

    public static void main(String[] args) {
        

    int x = 10;

    while (x >=5 && x<=8) 
    {
    if (x % 2 == 0) 
    {
    x = x + 3;
    }

    else 
    {
    x = x - 2;
    }
    
    }
        System.out.println(x);
        
    }
}
