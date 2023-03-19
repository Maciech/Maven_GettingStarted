package hello;


import org.joda.time.LocalTime;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        var logger = LoggerFactory.getLogger(HelloWorld.class);
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        logger.info(currentTime.toDateTimeToday()+"");
        logger.info((currentTime.getHourOfDay()+":"+currentTime.getMinuteOfHour())+" Hello!");
        DisplayInformation displayInformation = new DisplayInformation();

        try {
            displayInformation.readLine();
            logger.info("DATA ENTERED CORRECTLY");
        }
        catch (IOException e) {
            e.printStackTrace();
            logger.warn("IO EXCEPTION APPEARED");
        }
    }
}