package functional;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Program {


    public static void main(String[] args) {


        System.out.println(calculateDistanceInCentimeters.apply(3,3));

    }
    public static Function<Double,Integer> convertMetersToCentimeters = meters -> (int) (meters*100);
    public static BiFunction <Integer,Integer,Double> calculateDistance = (a,b) -> Math.sqrt(a*a+b*b);
    public static BiFunction <Integer,Integer,Integer> calculateDistanceInCentimeters = calculateDistance.andThen(convertMetersToCentimeters);
    
}
