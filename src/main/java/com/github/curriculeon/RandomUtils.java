package com.github.curriculeon;

import org.junit.Assert;
import sun.management.counter.StringCounter;

import java.awt.*;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Leon on 2/4/2017.
 */
public final class RandomUtils {
    private static volatile Random random = new Random();

    private RandomUtils() {
        /** This class is uninstantiable */
    }

    /**
     * @return true with the likelihood of specified percentage
     */
    public static Boolean createBoolean(float percentage) {
        return null;
    }

    /**
     * @return a random character between the specified min and max character range
     */
    public static Character createCharacter(char min, char max) {
        return (char) ThreadLocalRandom.current().nextInt(min, max);
    }

    /**
     * @return a random double between the specified min and max numeric range
     */
    public static Float createFloat(float min, float max) {
        return createDouble(min, max).floatValue();
    }

    /**
     * @return a random float between the specified min and max numeric range
     */
    public static Double createDouble(double min, double max) {

        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    /**
     * @return a random integer between the specified min and max numeric range
     */
    public static Integer createInteger(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max);
    }

    /**
     * @return a random long between the specified min and max numeric range
     */
    public static Long createLong(long min, long max) {

        return ThreadLocalRandom.current().nextLong(min, max);
    }

    /**
     * @return a random string of the specified length containing characters in the specified range
     */
    public static String createString(char min, char max, int stringLength) {

        String result = "";
        //loop through stringlength number of times and give me a random character
        int numberOfTimesLooped = 0;
        while (numberOfTimesLooped < stringLength) {
            // add random character to string
            Character randomCharacter = (char) ThreadLocalRandom.current().nextInt(min, max);
            result = randomCharacter + result;

            numberOfTimesLooped = numberOfTimesLooped + 1;
        }
        // return string
        return result;

    }

    /**
     * @return an array of random string objects of the specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int stringCount) {
        return null;
    }

    /**
     * @param minYear minimum year-value to be generated
     * @param maxYear maximum year-value to be generated
     * @return a random Date value within the specified min and max year
     */
    public static Date createDate(Number minYear, Number maxYear) {
        return null;
    }

    /**
     * @param minDate minimum Date to be returned
     * @param maxDate minimum Date to be returned
     * @return random date between the specified `minDate` and `maxDate`
     */
    public static Date createDate(Date minDate, Date maxDate) {
        return null;
    }

    /**
     * @param array     an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(AnyType[] array) {
        return null;
    }

    /**
     * @param list      an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(List<AnyType> list) {
        return null;
    }

    /**
     * @return specified string value with random upper and lower casing assigned to each character
     */
    public static String shuffleCasing(String str) {
        return null;
    }

    /**
     * @return shuffles the specified string array
     */
    public static <AnyType> AnyType[] shuffleArray(AnyType[] array) {
        return null;
    }

    /**
     * @return a random color with the specified maximum rgb values
     */
    public static Color createColor(int maxRed, int maxGreen, int maxBlue) {
        return null;
    }
}