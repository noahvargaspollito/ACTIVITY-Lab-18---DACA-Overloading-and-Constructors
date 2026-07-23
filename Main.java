/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
        DACArecipient person1 = new DACArecipient("Polo", "Noah","58-4-123", " Mexico", 2455401, 2457958, 2461695, 'M' );
        DACArecipient person2 = new DACArecipient();
        System.out.println(person1.toString());
        System.out.println(person2.toString());

  }
}