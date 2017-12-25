package Hackaton;

import org.apache.lucene.analysis.en.PorterStemFilter;




public class Main {
    public static void main(String[] args) {

        PorterStemmerH porterStemmerH = new PorterStemmerH();

        System.out.println(porterStemmerH.stem("<p>`"));
 /*       System.out.println(porterStemmerH.stem("trying"));
        System.out.println(porterStemmerH.stem("readers"));
        System.out.println(porterStemmerH.stem("texting"));
        System.out.println(porterStemmerH.stem("objectives"));*/
    }
}
