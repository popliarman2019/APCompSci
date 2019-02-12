public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {0, 1, 63, 127, 255, 256};
        for (int i=0; i<(numbers.length-1); i++) {
            System.out.println(numbers[i] + "(binary)" + toBinary(numbers[i]) + "(Octal)" + toOctal(numbers[i]));
        }
    }


    public static String toBinary(int dec) {

        int exponent;
        String output = " ";
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = binary.length - 1; i > -1; i--) {
            exponent = binary.length - 1;
            if (Math.pow(2, i) > dec) {
                binary[exponent - i] = 0;
            }
            if (Math.pow(2, i) <= dec) {
                binary[exponent - i] = 1;
                dec -= Math.pow(2, i);
            }
        }

        return becomeString(binary, output);
    }

    public static String toOctal(int dec) {
        int exponent;
        String output = " ";
        int[] octal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = octal.length - 1; i > -1; i--) {
            exponent = octal.length - 1;
            if (dec<8) {
                octal[exponent - i] = dec;
            }
            if (dec>=8) {
                octal[i] = dec % 8;
                dec = dec/8;
            }
        }

        return becomeString(hexaDecimal, output);
    }

    }

    public static String toHex(int dec) {
        int exponent;
        String output = " ";
        int[] hexaDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = hexaDecimal.length - 1; i > -1; i--) {
            exponent = hexaDecimal.length - 1;
            if (dec<16) {
                hexaDecimal[exponent - i] = dec;
            }
            if (dec>=16) {
                hexaDecimal[i] = dec % 16;
                dec = dec/16;
            }
        }

        return becomeString(hexaDecimal, output);
    }

    public static String becomeString(int[] array, String output) {
        for (int j = array.length; j>=0; j--) {
            output += Integer.toString(array[j]);
        }
        System.out.println(output);
        return output;
    }
}
