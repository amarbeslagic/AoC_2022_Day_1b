import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> listOfIntegers = new ArrayList<>();

        File file = new File("inputs//input_AoC_1b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            listOfStrings.add(s);
        }

        int sum = 0;

        for(String str : listOfStrings){
            if(!str.isEmpty()){
                sum += Integer.parseInt(str);
            }
            else {
                listOfIntegers.add(sum);
                sum = 0;
            }
        }

        Collections.sort(listOfIntegers);

        int maxCal1 = listOfIntegers.get(listOfIntegers.size() - 1);
        int maxCal2 = listOfIntegers.get(listOfIntegers.size()-2);
        int maxCal3 = listOfIntegers.get(listOfIntegers.size()-3);
        
        System.out.println(maxCal1 + maxCal2 + maxCal3);
    }
}