package LeetCode.Strings;

public class LeetCode1678 {
    public static void main(String[] args) {
        System.out.println(goalparser("G()()()()(al)"));
    }
    public static String goalparser(String command){

        command =command.replace("()", "o");
       command = command.replace("(al)","al");
        return command;
    }
}
