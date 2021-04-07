package stringCalc;

//  String calculator in Java

//  Build a method  'public int Add(string numbers)''
//      1.  an empty string will return 0
//      2.  a single number will return that number
//      3.  a comma-delimited pair of numbers returns the sum of those two numbers
//      4.  allow a list of comma-delimited values, returning the sum of all of the numbers
//      5.  allow newlines (\n) to be embedded in the input string ... they should be ignored
//      6.  allow a different single-character delimiter to be specified
//              delimiter appears as the beginning of the string in the form:
//
//              //[delimiter]\n[rest of input values with specified delimiter"  
//
//                  example: "//[;]\n1;2;3;4"       *note* the square brackets enclose the delimiter
//                                                  and are followed by a newline
//
//      7.  using a negative number in the input string throws the exception 
//          "negatives not allowed: [number]"], returning the negative number 
//          that was passed in [number]
//      8.  using multiple negative numbers in the input string will return all 
//          of them in the exception as a comma-separated list
//              example:  throw "negative numbers not allowed: [num1], [num2], etc."
//      9.  input numbers greater than 1000 should be ignored.  Add() will 
//          return the sum of all non-ignored entries
//      10. allow multi-character delimiters 
//              example -> "//[***]\n1***2***3"11
//      11. allow multiple delimeters like this "//[delim1][delim2][delim3]" 
//              example -> "//[*][;][&&]\n1&&2*3;4"

public class StringCalc {
    public int Add(String  values) {
        return -1;
    }
}
