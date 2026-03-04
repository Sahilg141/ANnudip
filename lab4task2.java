//Create Custom Exception 
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

class Demo
{
    public static void main(String[] args)
    {
        try
        {
            int num = 5;

            if(num < 10)
            {
                throw new MyException("Number is less than 10");
            }
            else
            {
                System.out.println("Number is greater than 10");
            }
        }
        catch(MyException e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

//output

Exception Caught: Number is less than 10