//Write a method with the name sumDigits that has one int parameter called number.
//
//If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//The numbers from 0-9 have 1 digit so we donÅft want to process them, also we donÅft want to process negative numbers, so also return -1 for negative numbers.
//
//For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//Calling the method sumDigits(1) should return -1 as per requirements described above.


 class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(1));
        System.out.println(sumDigit(14));
    }


    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
