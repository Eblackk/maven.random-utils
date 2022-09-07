package com.github.curriculeon;

import org.junit.Assert;
import sun.management.counter.StringCounter;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
            // add random character to result
            Character randomCharacter = (char) ThreadLocalRandom.current().nextInt(min, max);
            result = randomCharacter + result;

            numberOfTimesLooped = numberOfTimesLooped + 1;
        }
        // return result
        return result;

    }

    /**
     * @return an array of random string objects of the specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int stringCount) {
        String[] result = new String[stringCount];
        //loop through stringCount number of times and give me a random String
        int numberOfTimesLooped = 0;
        while (numberOfTimesLooped < stringCount) {
            // add random string to result
            String randomString = createString(min, max, stringLength);
            result[numberOfTimesLooped] = randomString;
            numberOfTimesLooped++;
        }

        // return result
        return result;

    }

    /**
     * @param minYear minimum year-value to be generated
     * @param maxYear maximum year-value to be generated
     * @return a random Date value within the specified min and max year
     */
    public static Date createDate(Number minYear, Number maxYear) {
        // loop through range(min,max) return random date within range
        // add random date(number) to result
        // return result
        return null;
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;

        }
    }

    /**
     * @param minDate minimum Date to be returned
     * @param maxDate minimum Date to be returned
     * @return random date between the specified `minDate` and `maxDate`
     */
    public static Date createDate(Date minDate, Date maxDate) {

        int minYear = minDate.getYear();
        int maxYear = maxDate.getYear();
        int year = createInteger(minYear, maxYear);
        int minMonth = minDate.getMonth();
        int maxMonth = maxDate.getMonth();
        int month = createInteger(minMonth, maxMonth);
        int minDay = minDate.getDay();
        int maxDay = maxDate.getDay();
        int day = createInteger(minDay, maxDay);
        String dateAsString = year + "-" + month + "-" + day;
        Date date = parseDate(dateAsString);
        return date;
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