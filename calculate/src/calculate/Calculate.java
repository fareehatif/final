package calculate;

/**
 * This class +++Insert Description Here+++
 *
 * @author Fareeha Mirza
 */
public class Calculate {

   public double calculateNet(){
       double hours = 1;
       double rate = 10;
       double tax = 3000;
       double gross = hours * rate;
       double net = gross - tax;
       return net;
   } 
   public static void main(String[]args)
   {
       Calculate cal = new Calculate();
       System.out.println(cal.calculateNet());
   }

}
