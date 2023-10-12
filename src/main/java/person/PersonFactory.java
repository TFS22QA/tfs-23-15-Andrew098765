package person;

import generators.ParamGenerator;
import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PersonFactory {

    public static Person getPerson(final String code) {
        final String number = "+79"
                + String.format("%02d", MyMath.getDigitsSum(Integer.parseInt(code)))
                + String.format("%03d", new Random().nextInt(1000))
                + String.format("%04d", Integer.parseInt(code));
        Phone phone = new Phone(number);
        ParamGenerator generator = new ParamGenerator();

        return new Person(
                code,
                generator.generateLastNames(Integer.parseInt(code)),
                generator.generateNames(Integer.parseInt(code)),
                generator.generateMiddleNames(Integer.parseInt(code)),
                generator.generatePhysical(Integer.parseInt(code)),
                generator.generateAppearance(Integer.parseInt(code)),
                generator.generatePassport(Integer.parseInt(code)),
                phone
        );
    }
}