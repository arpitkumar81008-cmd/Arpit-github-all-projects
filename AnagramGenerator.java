import java.util.*;

class AnagramGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next().toUpperCase();
        char[] chars = new char[word.length()];
		char ch='A';
		int i=0;
        while(ch<='Z')
		{
			int j=0;
			for(;j<word.length()&&ch!=word.charAt(j);j++);
			if(j<word.length()&&ch==word.charAt(j))
			{
				chars[i++]=ch;
			}
			ch++;
		}
        int count = 0;
        do {
            System.out.println(String.valueOf(chars));
            count++;
        } while (nextPermutation(chars));
        System.out.println("Total anagrams = " + count);
        sc.close();
    }
    private static boolean nextPermutation(char[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) return false;
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
		int start = i+1,end = array.length-1;
		while (start < end) {
            char swap = array[start];
            array[start] = array[end];
            array[end] = swap;
            start++;
            end--;
        }
        return true;
    }
}
