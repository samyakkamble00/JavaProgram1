// 1 to 100 without any loop
public class Question2 {

    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int num) {
        if(num <= 100)
        System.out.println(num);
        num++;
        printNum(num);
    }
}

