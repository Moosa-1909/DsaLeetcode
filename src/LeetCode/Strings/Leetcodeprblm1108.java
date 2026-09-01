package LeetCode.Strings;

public class Leetcodeprblm1108 {

    public static void main(String[] args){
            String add = "123.2324.3545";
        System.out.println(defangIPaddr(add));
    }

    public static String defangIPaddr(String address) {
        String defandadd = address.replace(".", "[.]");
        return defandadd;
    }
}
