public class App {
    public static void main(String[] args) throws Exception {
               
        System.out.println("Age App");

        int age =100;

        /* if (age>0 && age <18)  // AgeApp Exercise 2
        {
            System.out.println("You are Underage.");
        }

        else
        {
            System.out.println("You are an adult.");
        }

            System.out.println("Press space to exit.");
            */
            

           
        /*if (age>0 && age<18) // AgeApp Exercise 3
        {
            System.out.println("You are underage.");
        }
        else if (age>=65)
        {
            System.out.println("You are retired.");
        }
        else
        {
            System.out.println("You are an adult.");
        } */

        if (age>0 && age<18)  // AgeApp Exercise 4 & 5
        {
            System.out.println("You are underage.");
            if (age==10)
            {
                System.out.println("Anniversary Party!");    
            }
            if (age>=15)
            {
                System.out.println("You can drive a moped.");
            }
        }
        else if (age >= 18 && age<65)
        {
            System.out.println("You are an adult.");
            System.out.println("You can drive a car.");   
            if (age>=40 && age<=50)
            {
                System.out.println("Happy Mid Life!");
                if (age==40 || age==50)
                {
                    System.out.println("Anniversary Party!");
                }
            }
            if (age>18 && age==20 || age==30 || age==60) 
            {
                System.out.println("Anniversary Party!");
            }    
        }
         
        else if (age>=65)
        {   
            System.out.println("You are an adult.");
            System.out.println("You are retired.");
            if (age==70 || age==80 || age==90 || age==100 || age==110 || age==120)
            {
                System.out.println("Anniversary Party!");
                if (age==100)
                {
                    System.out.println("Congratulations!");
                    System.out.println("Congratulations!");
                    System.out.println("Congratulations!");
                }
            }
        }     
         
        


    }
    }