package hackbgweek0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class HackBGweek0 {

    //zad1
    boolean isOdd(int n) {
        return n % 2 != 0;
    }

    //zad2
    public int sumOfDivisors(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPrime(int n) {
        return n == sumOfDivisors(n);
    }

    //zad3
    int min(int[] array) {
        Arrays.sort(array);
        return array[0];

    }

    //zad4
    int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k - 1];
    }

    int getAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum / array.length;
    }

    int factoriel(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n * factoriel(n - 1);
        }
    }

    //zad6
    int doubleFac(int n) {
        int fac = factoriel(n);
        return factoriel(fac);
    }

    //zad7
    public int kthFac(int n, int k) {
        int kth = 0;
        int helper = n;
        for (int i = 0; i < k; i++) {
            kth = factoriel(helper);
            helper = kth;
        }
        return kth;
    }

    //zad8
    /*  long getSmallestMultiple(int upperBound) {
     boolean flag = true;
     int k = upperBound + 1;
     for(int i = 1; i <= upperBound; i++) {
     if( k % i != 0) {
     flag = false;
     }
            
     }
        
     if(flag == true) {
     return k;
     }
     } */
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        return number == reverse;
    }

    //zad9
    long getLargestPalindrome(long N) {
        ArrayList list = new ArrayList();
        for (int i = 1; i < N; i++) {
            if (isPalindrome(i)) {
                list.add(i);
            }
        }

        Object lastElement = list.get(list.size() - 1);

        return Long.parseLong(lastElement.toString(), 10);
    }

    int timesContains(int[][] arr, int n, int m, int k) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    result++;
                }
            }
        }
        return result;
    }

    //10
    int[] histogram(int[][] image, int n, int m) {
        int[] arr = {};
        for (int i = 0; i < 256; i++) {
            arr[i] = timesContains(image, n, m, i);
        }

        return arr;
    }

    //11
    long pow(int a, int b) {
        if (b == 1) {
            return a;
        }

        return a * pow(a, b - 1);
    }

    int times(int[] arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) {
                result++;
            }
        }
        return result;
    }

    //12
    int getOddOccurrence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isOdd(times(array, array[i]))) {
                return array[i];
            }
        }

        return 0;
    }
    //13

    public long scalarSum(int[] a, int[] b) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }

// NOT FINISHED!
    public void permute(List<Integer> arr, int k) {

        List<Integer> myList = new LinkedList<>();

        for (int i = k; i < arr.size(); i++) {
            java.util.Collections.swap(arr, i, k);
            permute(arr, k + 1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {

        }
    }

    long maximalScalarSum(int[] a, int[] b) {

        return 0;
    }

    // 14
    private int maxDistanceBetween(int a, int b, int[] arr) {
        int maxDistance = 0;
        int distance = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == a && arr[j] == b) {
                    distance = j - i;
                    if (maxDistance < distance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance + 1;
    }

    public int maxSpan(int[] numbers) {
        int maxDistance = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maxDistanceBetween(i, i, numbers) > maxDistance) {
                maxDistance = maxDistanceBetween(i, i, numbers);
            }
        }
        return maxDistance;

    }
    // 15

    //  public boolean canBalance(int[] numbers) {
//    }
    public String copyEveryChar(String input, int k) {
        StringBuilder result = new StringBuilder();
        char[] stringList = input.toCharArray();
        for (char i : stringList) {
            for (int j = 1; j <= k; j++) {
                result.append(i);
            }
        }
        return result.toString();
    }

    public String reverseMe(String argument) {
        StringBuilder sb = new StringBuilder();
        char[] nz = argument.toCharArray();
        for (int i = nz.length - 1; i >= 0; i--) {
            sb.append(nz[i]);
        }
        return sb.toString();
    }

    public boolean isPalindrome(String argument) {
        return argument.equals(reverseMe(argument));
    }

    //public boolean isPalindrome(int argument) {
    //  return isPalindrome(Integer.toString(argument));
    //}
    int getPalindromeLength(String input) {
        int length = 0;
        StringBuilder builder = new StringBuilder();

        char[] result = input.toCharArray();

        for (char i : result) {
            if (i != '*') {
                builder.append(i);
            }
        }
        while (!builder.equals("")) {
            if (isPalindrome(builder.toString())) {
                length = builder.length() / 2;
                break;

            } else {
                builder.deleteCharAt(0);
                builder.deleteCharAt(builder.length() - 1);
            }

        }
        return length;
    }

    int countOcurrences(String needle, String haystack) {

        //return StringUtils.CountMatches(needle, haystack);
        return 0;
    }

    int sumOfNumbers(String input) {
        int result = 0;
        String[] lqlq = input.replaceAll("/[^0-9]/g", "").split(" ");

        for (String s : lqlq) {
            result += Integer.parseInt(s);
        }

        return result;
    }

    boolean anagram(String A, String B) {
        char[] listOfA = A.toCharArray();
        char[] listOfB = B.toCharArray();

        Arrays.sort(listOfA);
        Arrays.sort(listOfB);

        return Arrays.equals(listOfA, listOfB);
    }

    boolean hasAnagramOf(String A, String B) {
        // all the substrings
        boolean flag = false;
        String sub;
        for (int i = 0; i < B.length(); i++) {
            for (int j = 1; j <= B.length() - i; j++) {
                sub = B.substring(i, i + j);
                if (anagram(A, sub)) {
                    flag = true;
                }
            }

        }
        return flag;
    }

    String reverseEveryChar(String arg) {
        StringBuilder sb = new StringBuilder();
        String[] temp = arg.split(" ");
        for (String s : temp) {
            sb.append(reverseMe(s));
            sb.append(" ");
        }

        return sb.toString();
    }

    String decodeUrl(String input) {
        return input.replaceAll("%20", " ").replaceAll("%3A", ":").replaceAll("%3D", "?").replaceAll("%2F", "/");
    }

    public void hashMapTest() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 3);
        hm.put("elka", 7);
        hm.put("alka", 2);
        if (hm.keySet().contains("a")) {
            hm.put("a", hm.get("a") + 1);
        } else {
            hm.put("a", 1);
        }
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 1, 1, 3, 7, 8, 9, 10, 11};
        HackBGweek0 temp = new HackBGweek0();
  

    }

}
