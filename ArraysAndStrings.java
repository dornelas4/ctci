public class ArraysAndStrings{
    public static void main(String[] args) {
        TestIsUnique();
    }


    /* 
    1.1 isUnique
    Algorithm to determine if a string has all unique characters
    */

    public static boolean isUnique(String str){
        if(str.length() > 128) return false;
        boolean[] alphabet = new boolean[128];
        for(Character c : str.toCharArray()){
            int charIdx = Character.valueOf(c);
            if(alphabet[charIdx]) return false;
            alphabet[charIdx] = true;
        }
        return true;
    }

    public static void TestIsUnique(){
        System.out.println(isUnique("Hello"));
        System.out.println(isUnique("World"));
    }

    



}