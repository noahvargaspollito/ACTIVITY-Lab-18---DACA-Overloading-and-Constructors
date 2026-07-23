import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    @DisplayName("testFullConstructor")
    void testFullConstructor() {
        Constructor constructor = null;
        DACArecipient person = null;
        try
        {
            constructor = DACArecipient.class.getDeclaredConstructor(
                    String.class, String.class, String.class, String.class, int.class, int.class, int.class, char.class);
            person = (DACArecipient) constructor.newInstance("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Correct DACArecipeint constructor not found.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured constructing the DACArecipient object.", e);
        } catch (InstantiationException e)
        {
            throw new RuntimeException("An error occured constructing the DACArecipient object.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("An error occured constructing the DACArecipient object, is your constructor public?", e);
        }

//Tests if the Full Constructor actually sets all the instance variables (requires toString() to run)
        String string = person.toString();
        boolean result =
                (string.contains("Hernandez") &&
                        string.contains("Alex") &&
                        string.contains("25-6-567") &&
                        string.contains("Mexico") &&
                        string.contains("2451257") &&
                        string.contains("39567322") &&
                        string.contains("39567818") &&
                        string.contains("F"));

        assertEquals(true, result);

    }

    @Test
    @DisplayName("testDefaultConstructor")
    void testDefaultConstructor() {
        DACArecipient person = new DACArecipient();
//Tests whether instance variables are set to the expected default values by checking the toString() for the expected number of occurances for "Unknown", 2415021, and X (case insensitive).

        String a[] = person.toString().split("-|;|,|\\s|\\r?\\n"); //Multiple delimeters is in case the toString seperates entires by hyphens, semicolons, commas, spaces, or newlines

//Search for occurances
        int numUnknown = 0;
        int numInteger = 0;
        int numChar = 0;

        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count (case insensitive)
            if ("unknown".equals(a[i].toLowerCase()))
                numUnknown++;
            if ("2415021".equals(a[i].toLowerCase()))
                numInteger++;
            if ("x".equals(a[i].toLowerCase()))
                numChar++;
        }

        boolean result = (numUnknown == 4 && numInteger == 3 && numChar == 1);

        assertEquals(true, result);
    }

}