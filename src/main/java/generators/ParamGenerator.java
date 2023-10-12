package generators;

import person.models.Passport;
import person.models.Physical;
import person.models.appearance.Appearance;
import person.models.appearance.Hair;
import person.models.appearance.enums.EyesColor;
import person.models.appearance.enums.HairColor;

import java.util.Random;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class ParamGenerator {

    public Appearance generateAppearance(final int inputCode) {
        final int thirdNumberOfCode = inputCode % 100 / 10;
        String eyesColor = EyesColor.values()[thirdNumberOfCode / 2].name().toLowerCase();
        String hairLength = String.valueOf(thirdNumberOfCode);
        if (thirdNumberOfCode > 0) {
            hairLength = HairColor.values()[thirdNumberOfCode - 1].name().toLowerCase();
        }
        return new Appearance(eyesColor, new Hair(thirdNumberOfCode, hairLength));
    }

    public String generateLastNames(final int inputCode) {
        final int digitsSum = getDigitsSum(inputCode);
        final String generateSex = (digitsSum % 2 == 0) ? "f" : "m";
        return getLinesFromFile("lastNames_" + generateSex).get(digitsSum);
    }

    public String generateNames(final int inputCode) {
        final int digitsSum = getDigitsSum(inputCode);
        final String generateSex = (digitsSum % 2 == 0) ? "f" : "m";
        return getLinesFromFile("names_" + generateSex).get(getDigitsSum(inputCode / 100));
    }

    public String generateMiddleNames(final int inputCode) {
        final int digitsSum = getDigitsSum(inputCode);
        final String generateSex = (digitsSum % 2 == 0) ? "f" : "m";
        return getLinesFromFile("middleNames_" + generateSex).get(getDigitsSum(inputCode % 100));
    }

    /**
     * по второй цифре кода:
     * Возраст: 10..100
     * Вес: 30..120
     * Рост: 1..1,9
     */
    public Physical generatePhysical(final int inputCode) {
        final int secondNumberOfCode = inputCode % 1000 / 100;
        int age = (secondNumberOfCode + 1) * 10;
        int weight = 30 + secondNumberOfCode * 10;
        double height = (100 + secondNumberOfCode * 10) / 100.00;
        return new Physical(age, weight, height);
    }

    public Passport generatePassport(final int inputCode) {
        final int d = 999999;
        final String pn = String.valueOf(inputCode) + new Random().nextInt(d);
        return new Passport(pn);
    }
}
