package day2;

import util.reader.MyReader;
import util.regex.MyRegex;

/**
 * Created by murad on 13/02/16.
 */
public class Runner {

    MyReader myReader;
    MyRegex myRegex;
    Day2 day2;

    public static void main(String[] args){
        new Runner();
    }

    public Runner(){
        setUp();
    }

    public void setUp(){
        day2 = new Day2();
        myReader = new MyReader();
        myRegex = new MyRegex("(\\d+)x(\\d+)x(\\d+)");

        int answer = 0;
        for (String item :
                myReader.readFileByLine("puzzle_inputs/Day2Input")) {
            answer += day2.calculatePaperNeeded(myRegex.autoSort(item));
        }
        System.out.println(answer);
    }
}
