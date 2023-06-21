package io.github.anesuphiri521.Example;

/*
 * @created - 19/06/2023
 * @project - DataMasking
 * @author - anesuphiri - sehphirry@gmail.com
 */


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import io.github.anesuphiri521.Example.Dto.Employee;
import io.github.anesuphiri521.DataMasking.Mask;


public class MaskingExample {
    private static final Logger logger = LoggerFactory.getLogger(MaskingExample.class);
    public static final String cardNumber = "4051908840892850";

    public static void main(String[] args) {
        logger.warn("Mask fixed positions "+ new Mask().defaultFixedPositionMasking(cardNumber, 4, 12));
        logger.warn("Mask fixed positions with character"+ new Mask().customCharacterFixedPositionMasking("0779278524", 3, 6, 'X'));


        logger.warn("\n-------------------------------------\n");

        Employee employee = new Employee();
        employee.setDep("IT");
        employee.setName("Anesu");
        employee.setSurname("Phiri");
        employee.setPhoneNumber("0779278524");
        employee.setCardNumber(cardNumber);

        logger.warn("Object data already masked on " + employee);
        logger.warn("{}",new Mask().customMasking(cardNumber,"######XXXXXX####"));

    }

}
