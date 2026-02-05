public class StringDuplicates {
    public static void main(String[] args) {
        System.out.println("Program for the Remove Duplicates in the String");
        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch   ) == -1) {
                result = result + ch;
            }
        }

        System.out.println("\nAfter removing duplicates: " + result);
    }
}
