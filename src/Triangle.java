public class Triangle
{

   public static int specialCount;
    public static void oneStar()
    {
        //This method prints out one star
        System.out.println("*");
        System.out.println();
    }

    public static void horizontalLine(int numOfStars)
    {
        //numOfStars is how many stars will be printed
        for (int counter = 0; counter < numOfStars; counter++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    public static void verticalLine(int numOfRows)
    {
        //numOfRows is how many rows of stars will be printed
        for (int counter = 0; counter < numOfRows; counter++)
        {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void rightTriangle(int numOfRows)
    {
        /*
        numOfRows is, once again, the number of rows of stars that will be printed
        to create this right triangle */

        for (int counter = 0; counter < numOfRows; counter++)
        {
            for (int counter2  = 0; counter2 < counter + 1; counter2 ++)
            {
                //This second loop is needed to print the number of stars that corresponds with the row number
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void isocelesTriangle(int numOfRows) {
        //numOfRows shows the number of rows that the centered triangle will have
        while (numOfRows >= 0) {
            //int specialCount;
            for (int counter = 0; counter < numOfRows; counter++) {
                System.out.print(" ");
            }
            for (int counter2 = 0; counter2 < (specialCount * 2) - 1; counter2++)
            {
                System.out.print("*");
            }
            System.out.println();

            specialCount++;
            numOfRows--;


        }
    }

    public static void diamond(int numOfRows)
    {
        isocelesTriangle(numOfRows);
        specialCount = numOfRows;

        int limit = (2* numOfRows);
        int constant = numOfRows;//We use this constant value for the number of spaces for the second half of the diamond
        while (numOfRows <= limit)//Unitl it reaches twice the number of rows
        {
            //int specialCount;
           for (int counter = 0 ; counter < (constant-specialCount); counter++)
           {
                System.out.print(" ");//Prints the same number of spaces as the number of rows
            }
            for (int counter2 = 0; counter2 < ((specialCount * 2) - 1); counter2 ++)//formula that prints the the number of stars needed for each row
            {
                System.out.print("*");//Prints the requested number of stars
            }
            System.out.println();

            specialCount--;//
            numOfRows++;//Decrease so the number of spaces printed on the next line gets smaller


        }
    }
    public static void diamondName(int numOfRows) {
        isocelesTriangle(numOfRows);
        String name = "Nygel Jones";
        System.out.println(name);//Prints the name in the middle of the diamond
        specialCount = numOfRows;

        int limit = (2 * numOfRows);
        int constant = numOfRows;//We use this constant value for the number of spaces for the second half of the diamond
        while (numOfRows <= limit)//Unitl it reaches twice the number of rows
        {
            //int specialCount;
            for (int counter = 0; counter < (constant - specialCount); counter++) {
                System.out.print(" ");//Prints the same number of spaces as the number of rows
            }
            for (int counter2 = 0; counter2 < ((specialCount * 2) - 1); counter2++)//formula that prints the the number of stars needed for each row
            {
                System.out.print("*");//Prints the requested number of stars
            }
            System.out.println();

            specialCount--;//
            numOfRows++;//Decrease so the number of spaces printed on the next line gets smaller

        }
    }

    public static void fizzBuzz(int lastNumber)
    {
        //integer lastNumber shows how many number you'd like to count to.

        for (int counter = 1; counter <= lastNumber; counter ++)
        {
            if (counter % 3 ==0 && counter % 5 ==0)
            {
                System.out.println("FizzBuzz");
            }


            else if (counter % 3 == 0)
            {
                System.out.println("Fizz");
            }

            else  if (counter % 5 == 0)
            {
                System.out.println("Buzz");

            }

            else
                System.out.println(counter);
        }
    }

    public static void primeFactors(int numToBeFactored)
    {
        //int numToBeFactored is the number whose prime factors we are finding

        for (int count = 1; count <= numToBeFactored; count ++)
        {
            if (numToBeFactored% count == 0 )
            {
                if (count == 2 || count == 3)
                {
                    System.out.print(count + ", ");
                }
                else if (count % 2 == 0)
                {
                    
                }
            }
        }
    }





    public static void main(String[] args) {
        /*oneStar();
        horizontalLine(8);
        verticalLine(3);*/
        //int specialCount;
       // rightTriangle(6);
        //isocelesTriangle(7);
        //diamond(7);
        //diamondName(7);
        fizzBuzz(15);
    }

}
