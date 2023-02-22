package ua.ithillel.part1;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Division", 'i'));
        System.out.println(findWordPosition("Kotaro_Apollo", "pollo"));
        System.out.println(stringReverse("Division"));

        System.out.println(isPalindrome("abcdcba"));
    }

    public static int findSymbolOccurance(String s, char c) {
        int k = 0;
        char[] stringArray = s.toCharArray();

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == c) {
                k++;
            }
        }
        return k;
    }

    public static int findWordPosition(String source, String target) {
        char[] tar = target.toCharArray();

        if (source.contains(target)) {
            return source.indexOf(tar[0]);
        } else {
            return -1;
        }
    }

    public static String stringReverse(String source) {
        String reversedSource;
        char[] charSource = source.toCharArray();
        char[] charReverse = new char[charSource.length];
        int j = 0;

        for (int i = charSource.length - 1; i >= 0; i--) {
            charReverse[j] = charSource[i];
            j++;
        }
        reversedSource = String.valueOf(charReverse);

        return reversedSource;
    }

    public static boolean isPalindrome(String source) {
        char[] charSource = source.toCharArray();
        char[] firstHalf, secondHalf;

        int j = 0;
        String secondHalfReverse, firstHalfString;

        if (charSource.length % 2 == 0) {
            firstHalf = new char[charSource.length / 2];
            secondHalf = new char[charSource.length / 2];

            System.arraycopy(charSource, 0, firstHalf, 0, charSource.length / 2);
            for (int i = charSource.length / 2; i < charSource.length; i++) {
                secondHalf[j] = charSource[i];
                j++;
            }
            secondHalfReverse = stringReverse(String.valueOf(secondHalf));
            firstHalfString = String.valueOf(firstHalf);

            System.out.println(firstHalfString);
            System.out.println(secondHalfReverse);

            if (firstHalfString.equals(secondHalfReverse)) {
                return true;
            } else {
                return false;
            }

        } else {
            firstHalf = new char[(charSource.length / 2)];
            secondHalf = new char[(charSource.length / 2)];

            System.arraycopy(charSource, 0, firstHalf, 0, charSource.length / 2);
            for (int i = (charSource.length / 2) + 1; i < charSource.length; i++) {
                secondHalf[j] = charSource[i];
                j++;
            }
            secondHalfReverse = stringReverse(String.valueOf(secondHalf));
            firstHalfString = String.valueOf(firstHalf);

            System.out.println(firstHalfString);
            System.out.println(secondHalfReverse);

            if (firstHalfString.equals(secondHalfReverse)) {
                return true;
            } else {
                return false;
            }

        }
    }
}