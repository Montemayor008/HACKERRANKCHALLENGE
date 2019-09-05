package ProblemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets2 {

	

	    // Complete the compareTriplets function below.
	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        int xAPoints = 0;
	        int xBPoints = 0;
	        List<Integer> xPointsAssign = new LinkedList<Integer>();
	        for (int xPlace = 0; xPlace < a.size(); xPlace++) {
	            if (a.get(xPlace) > b.get(xPlace)){
	                xAPoints++;
	            } else if (b.get(xPlace) > a.get(xPlace)){
	                xBPoints++;
	            }
	        }
	        xPointsAssign.add(xAPoints);
	        xPointsAssign.add(xBPoints);
	        return xPointsAssign;
	        }


	    

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = compareTriplets(a, b);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining(" "))
	            + "\n"
	        );
	        System.out.println(result);

	        bufferedReader.close();
	        bufferedWriter.close();
	    
	    }
	}
