package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args){

        try {
            FileReader fr = new FileReader("/home/youghou/Bureau/JAVA/java-coding-exam-master/src/readfile/file-data");

            BufferedReader br = new BufferedReader(fr);

            String line1;

            while ((line1=br.readLine()) != null){
                System.out.println(line1);
            }
            FileReader fr1 = new FileReader("/home/youghou/Bureau/JAVA/java-coding-exam-master/src/readfile/file-data");
            BufferedReader br1 = new BufferedReader(fr1);
            List<String> list = new LinkedList<>();
            String line;
            String word = "";

            while ((line = br1.readLine()) != null) {
                line = line + " ";
                for (int i = 0; i < line.length(); i++) {
                    if ((line.charAt(i) != ' ') && (line.charAt(i) != ',') && line.charAt(i)!= '.') {
                    word = word + line.charAt(i);
                    }else{
                        list.add(word);
                        word = "";

                    }

                }
            }
            for (int i = 0; i<list.size();i++) {
                if (list.get(i)== "")
                    list.remove(i);
            }
            System.out.println(list);
            int total = 0;
            for (String str : list) {
                total++;

            }

            System.out.println("the number of the words in th text " + total);

        } catch (IOException e) {

                throw new RuntimeException(e);

        }


    }

}
