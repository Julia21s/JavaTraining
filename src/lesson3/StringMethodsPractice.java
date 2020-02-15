package lesson3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMethodsPractice {
    public static void main(String[] args) throws IOException {
        String inStr;
        String method;
        String[] sourceStrings = {"First string",
                "Какая-то длинная /строка или не очень /длинная, я еще не решила, /но нужно попробовать протестироать",
                "Does this string contain any subsrtings?",
                "Trusting Stack Overflow",
                "          Trusting Stack Overflow",
                "Java learning",
                "Java",
                "java learning",
                "java learning                  ",
                "java ",
                "java",
                "learning",
                "java / learning / test / automation/ flower",
                "in the end of this string is java"
        };


        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        do {
            do {
                System.out.println("Please, enter a string more than 0 character length");
                inStr = reader.readLine();
            } while (inStr.equals(""));
            do {
                System.out.println("What will we do with this string? (1 - Search subsrting, 2 - find char at position, 3 - replace, 4 - trimmer, 5 - other methods)");
                method = reader.readLine();

            } while (method.equals(""));
            switch (method) {
                case "1":
                    searchStr(inStr, sourceStrings);
                    break;
                case "2":
                    findIndex(inStr);
                    break;
                case "3":
                    replaceStr(sourceStrings);
                    break;
                case "4":
                    trimmer(sourceStrings);
                    break;
                case "5":
                    otherMethods(sourceStrings);

            }
            System.out.println("Do you want show to go on?");
        } while (reader.readLine().equalsIgnoreCase("y"));

    }

    static void searchStr(String inStr, String[] strings) {
        int n = strings.length;

        for (String string : strings) {
            if (string.endsWith(inStr)) {
                System.out.println("This string ends with the parameter '" + string + "'");
            }
            if (string.startsWith(inStr)) {
                System.out.println("This string starts with parameter '" + string + "'");
            }
            if (string.equals(inStr)) {
                System.out.println("This string equals to parameter '" + string + "'");
            }
            if (string.equalsIgnoreCase(inStr)) {
                System.out.println("This string equals to parameter ignore case '" + string + "'");
            }
            if (string.contains(inStr)) {
                System.out.println("This string contains parameter '" + string + "'");
            }


        }
    }

    static void findIndex(String str) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter first character of substring ");
            int n = Integer.parseInt(reader.readLine());
            if (n < str.length()) {
                System.out.println(str.charAt(n) + " - Character at position " + n);
                System.out.println("Substring is: '" + str.substring(n) + "'");
                System.out.println("Enter last character of substring ");
                int m = Integer.parseInt(reader.readLine());
                if (m<str.length()){System.out.println("Limited substring is: '" + str.substring(n, m) + "'");}
            } else {
                System.out.println("Wrong char position");
            }

        } catch (NumberFormatException e) {
            System.out.println("You are not serious. I don't want to work with you.");
        }
    }

    static void replaceStr(String[] strings) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Char to be replaced: ");
        char chOld = reader.readLine().charAt(0);
        System.out.println("Char to replace with: ");
        char chNew = reader.readLine().charAt(0);
        for (String string : strings) {
            System.out.println(string.replace(chOld, chNew));

        }
    }

    static void trimmer(String[] strings) {
        int n = strings.length;

        for (String string : strings) {
            if (!string.trim().equals(string)) {
                System.out.println("This string was trimmed '" + string + "'");
            }
        }

    }
    static void otherMethods(String[] strings){
        int n = strings.length;
        String[] splitedString;

        for (String string : strings) {
            System.out.println("UpperCase: '" + string.toUpperCase() + "', LowwerCase: " + string.toLowerCase() + "'");
            splitedString = string.split("/");
            if (splitedString.length > 1) {
                System.out.print("Splited strings: ");
                for (String spl : splitedString) {
                    System.out.print(" *** " + spl);
                }
                System.out.println();
            } else {
                System.out.println("No delimiter found for this spring");
            }
        }
    }
}

