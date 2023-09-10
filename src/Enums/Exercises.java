package Enums;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        for (Days day : Days.values()){
            System.out.println(day);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        enum Seasons {
            SPRING("March 21st - June 21st"),
            SUMMER("June 21st - September 22nd"),
            FALL("September 23rd - December 22nd"),
            WINTER("December 1st - February 29th");

            private String dateRange;

            Seasons(String dateRange) {
                this.dateRange = dateRange;
            }

            public String getDateRange() {
                return dateRange;
            }
        }

        System.out.println("date range of months in Spring: " + seasonValue(Seasons.SPRING.dateRange));
        System.out.println("date range of months in Summer: : " + seasonValue(Seasons.SUMMER.dateRange));
        System.out.println("date range of months in Fall: : " + seasonValue(Seasons.FALL.dateRange));
        System.out.println("date range of months in Winter: : " + seasonValue(Seasons.WINTER.dateRange));
    }
    public static String seasonValue(String value){
        return value;
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {
            RED, YELLOW, GREEN
        }

        int currentStatusOfTrafficLight = 0;

        for(int i = 0; i <= 2; i++) {
            switch (currentStatusOfTrafficLight++) {
                case 0: {
                    System.out.print( TrafficLight.RED );
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e){
                        e.printStackTrace();
                        System.exit(0);
                    }
                    System.out.print("\r");
                    break;
                }
                case 1: {
                    System.out.print( TrafficLight.YELLOW );
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e){
                        e.printStackTrace();
                        System.exit(0);
                    }
                    System.out.print("\r");
                    break;
                }
                case 2: {
                    System.out.print(TrafficLight.GREEN );
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e){
                        e.printStackTrace();
                        System.exit(0);
                    }
                    System.out.print("\r");
                    break;
                }
            }
        }

        System.out.println();
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        enum Days {
            MONDAY(false),
            TUESDAY(false),
            WEDNESDAY(false),
            THURSDAY(false),
            FRIDAY(false),
            SATURDAY(true),
            SUNDAY(true);
            private boolean isWeekend;
            Days(boolean isWeekend) {
                this.isWeekend = isWeekend;
            }
            public boolean isWeekend() {
                return isWeekend;
            }

            public void setWeekend(boolean weekend) {
                isWeekend = weekend;
            }
        }

        if (Days.MONDAY.isWeekend() && Days.TUESDAY.isWeekend() && Days.WEDNESDAY.isWeekend() && Days.THURSDAY.isWeekend()
                && Days.FRIDAY.isWeekend()){
            System.out.println("No weekend");
        } else if (Days.SATURDAY.isWeekend() && Days.SUNDAY.isWeekend()) {
            System.out.println("weekend");
        } else System.out.println("Other day");
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        System.out.println(operations(num1, num2, Operator.ADD));
        System.out.println(operations(num1, num2, Operator.SUBTRACT));
        System.out.println(operations(num1, num2, Operator.MULTIPLY));
        System.out.println(operations(num1, num2, Operator.DIVIDE));
    }
    enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private static Double operations(double number1, double number2, Operator operation){
        double result = 0;

        switch (operation){
            case ADD:
                result = number1 + number2;
                break;
            case SUBTRACT:
                result = number1 - number2;
                break;
            case MULTIPLY:
                result = number1 * number2;
                break;
            case DIVIDE:
                result = number1 / number2;
                break;
            default:
                System.out.println("Error");
        }

        return result;
    }
}
