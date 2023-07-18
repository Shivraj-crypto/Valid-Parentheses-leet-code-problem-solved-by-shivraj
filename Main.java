import java.util.Scanner;

public class Main {

    public static boolean myfin(String s){


        int countTrue = 0;
        StringBuffer newS = new StringBuffer(s);
        int countFalse = 0;

        for (int i=0; i<=s.length(); i++){

            if(s.contains("(")){
                int gap = Math.abs(s.lastIndexOf(")") - s.indexOf("(")) - 1;

                if (s.contains(")") && s.lastIndexOf(")") > s.indexOf("(") && gap >= 2 | gap < 1){
                    countTrue++;
                    newS.deleteCharAt(newS.indexOf(")"));
                    newS.deleteCharAt(newS.indexOf("("));
                    String str = newS.toString();
                    s = null;
                    s = str;
                    // System.out.println(s);

                }else {
                    countTrue = 0;
                    //System.out.println("This executed");
                    countFalse++;
                    break;
                }
            } else if (s.contains(")")) {
                //System.out.println("Else if executed");
                countTrue = 0;
                countFalse++;
                break;
            }
            if(s.contains("[")){
                int gap = Math.abs(s.indexOf("[") - s.lastIndexOf("]")) - 1;
//
                if (s.contains("]") && s.lastIndexOf("]") > s.indexOf("[") && gap >= 2 | gap < 1){
                    countTrue++;
                    newS.deleteCharAt(newS.indexOf("["));
                    newS.deleteCharAt(newS.indexOf("]"));
                    String str = newS.toString();
                    s = null;
                    s = str;

                }else {
                    countTrue = 0;
                    countFalse++;
                    break;
                }
            }else if (s.contains("]")) {
                // System.out.println("Else if executed");
                countTrue = 0;
                countFalse++;
                break;
            }
            if(s.contains("{")){
                int gap = Math.abs(s.indexOf("{") - s.lastIndexOf("}")) - 1;
                if (s.contains("}") && s.lastIndexOf("}") > s.indexOf("{") && gap >= 2 | gap < 1){
                    countTrue++;
                    newS.deleteCharAt(newS.indexOf("{"));
                    newS.deleteCharAt(newS.indexOf("}"));
                    String str = newS.toString();
                    s = null;
                    s = str;

                }else {
                    countTrue = 0;
                    countFalse++;
                    break;
                }
            }else if (s.contains("}")) {
                //System.out.println("Else if executed");
                countTrue = 0;
                countFalse++;
                break;
            }
        }
        if (countTrue > countFalse){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]){
        String a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextLine();

        boolean f = myfin(a);
        System.out.println(f);




    }
}