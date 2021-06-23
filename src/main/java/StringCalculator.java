public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;

        String[] numbersArray = numbers.split(",|\n");

        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberFromString = Integer.parseInt(number.trim());
                if(numberFromString <  0){
                    throw new IllegalArgumentException("negative numbers not allowed");
                }
                else if(numberFromString <= 1000){
                    returnValue += Integer.parseInt(number.trim());
                }
            }
        }
        return returnValue;
    }
}