package academy.learnprogramming;

public class Main 
{
    public static void main(String[] args) 
    {
        double val1 = 20.00d;
        double val2 = 80.00d;
        double add;
        add = (val1 + val2)*100d;
        System.out.println("My first answer is: "+add);
        
        double rem;
        rem = (add%40.00d);
        System.out.println("\nMy second answer is: "+ rem);

        boolean res = (rem == 0) ? true : false;
        System.out.println("\nres = "+res);
        if(!res)
        {
            System.out.println("\nGot some remainder");
        }
        
    }

    
}
