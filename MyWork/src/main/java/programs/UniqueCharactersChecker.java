package programs;

public class UniqueCharactersChecker {

	public static boolean hasUniqueCharacters(String str) {
        if (str.length() > 128) {
            return false;  // If the string has more than 128 characters, it must have duplicates.
        }

        boolean[] charSet = new boolean[128];
        for(int i=0;i<str.length();i++) {
        	int charNum = str.charAt(i);
        	
        	if(charSet[charNum]==true) {
        		return false;
        	}
        	charSet[charNum]=true;
        }

        return true;
        
        
    }

    public static void main(String[] args) {
        String inputString = "abcdefga";
//        for (int i=0; i<inputString.length();i++) {
//        	System.out.println(inputString.charAt(i));
//        }
//        System.out.println(inputString.lastIndexOf('a'));
//        System.out.println(inputString.indexOf('a'));
//        boolean result = hasUniqueCharacters(inputString);
//        if (result) {
//            System.out.println("'" + inputString + "' has all unique characters.");
//        } else {
//            System.out.println("'" + inputString + "' does not have all unique characters.");
//        }
        
        for(char c:inputString.toCharArray()) {
        	if(inputString.indexOf(c)==inputString.lastIndexOf(c)) {
        		System.out.println(" Character "+c +" is unique");
        	}else {
        		System.out.println(" Character "+c +" is  repeating");
        	}
        	
        }
    }
}
