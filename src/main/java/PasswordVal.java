public class PasswordVal {

    public static void main(String[] args) {
    String pass1 = "Xs12tzuvai";
};


    public static boolean checkLength (String pass1) {
        if (pass1.length()>=8){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean contains(String pass1) {

        char[] digits = pass1.toCharArray();

        for (int numbers=0; numbers<pass1.length();numbers++){
            if (Character.isDigit(digits[numbers])){
                return true;
            }
        } return false;
    }
}


}
