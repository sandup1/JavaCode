import java.sql.SQLOutput;


public class UsingJava {

    public static void main(String[] args) {
        String strA = "first a short string";

        String strB = "Friends, Romans, countrymen, lend me your ears; I come to bury Caesar, not to praise him;";
        String strC = "this that and the other this does not make sense that does not either does this";

        //Compare strings strA and strB and print the one that comes later in the dictionary
        int i = strA.compareTo(strB);
        if (i < 0) {
            System.out.println("strB comes later in the dictionary");
        } else if (i == 0) {
            System.out.println(" are the same ");
        } else if (i > 0) {
            System.out.println(" strA comes after strB in the dictionary ");
        }

        //Compare them again and this time ignore case.

        int j = strA.compareToIgnoreCase(strB);
        if (j < 0) {
            System.out.println("strB comes later in the dictionary");
        } else if (j == 0) {
            System.out.println(" are the same ");
        } else if (j > 0) {
            System.out.println("  strA comes after strA in the dictionary ");
        }
        // Where can the word "ears" be found in strB? what is the index of that string?
        System.out.println("index of Ears in strB : " + strB.indexOf("ears"));


         String[] words = strC.split(" ");
        /* Set<String>treeSet = new TreeSet<>;
        Set<String>hashSet = new LinkedHashSet<>;
        ArrayList<String>list = new ArrayList<>;*/

         for( int word = 0;word<words.length; word++ ){
             System.out.println(words[word]);
         }


          words = strB.split("");
         String maxWord = words[0];
         String shortWord = words[0];
         for(String word : words){
             if(word.length()> maxWord.length()){
                 maxWord = word;
             }
             if(word.length()> shortWord.length()){
                 shortWord = word;
             }

             System.out.println("maxWord =  " + maxWord +"has a length of" +  maxWord.length());
             System.out.println("shortWord ="+ shortWord + " has a length of " + shortWord.length());
         }








        }

    }






