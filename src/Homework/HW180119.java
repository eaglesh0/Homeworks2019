package Homework;
//1) Нарисовать пирамиду с 40 рядами с помощью цикла, как показано на рисунке:
//        x
//        xx
//        xxx
//        xxxx
//        xxxxx
//        ------------------------------------------------------------------------------
public class HW180119 {
    public static void main(String[] args) {

        String l = "x";
        System.out.println(l);
        for (int i = 0; i < 40; i++) {
            l += "x";
            System.out.println(l);
        }
    }
}

