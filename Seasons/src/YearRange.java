public class YearRange
{
    private int num1;
    private int num2;
    private int a;
    private int b = 14;
    private int c = 20;

    public YearRange(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setRangeType(int a)
    {
        this.a = a;
    }

    public int getFirstDivisor()
    {
        return b;
    }
    public int getSecondDivisor()
    {
        return c;
    }
    public int getFirstYear()
    {
        return num1;
    }
    public int getSecondYear()
    {
        return num2;
    }
    public void printYears()
    {
        int j = (num2 - num1) + 1;

        if (a == 1)
        {
            for (int i = 0; i < j; i++)
            {
                int z = ((num1 % b) + (num1 % c));

                if (z == 0) {
                    System.out.print(num1 + ", ");
                }
                num1++;
            }
            System.out.print("\n");
        }
        else if (a == 2)
        {
            for (int i = 0; i < j; i++)
            {
                if ((num1 % 4) == 0)
                {
                    System.out.print(num1 + ", ");
                }
                num1++;
            }
            System.out.print("\n");
        }
        else if (a == 3) {
            for (int i = 0; i < j; i++) {
                if (((num1 % 4) == 0) && ((num1 % 3) == 0)) {
                    System.out.print(num1 + ", ");
                }
                num1++;
            }
            System.out.print("\n");
        }
    }
}
