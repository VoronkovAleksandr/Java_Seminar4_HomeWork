import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        String input;
        while (!(input = sc.nextLine()).equals("exit")){
            if ("print".equals(input)){
                System.out.println(deque);
            } else if ("revert".equals(input)) {
                try {
                    deque.removeFirst();
                } catch (NoSuchElementException e){
                    System.out.println("Очередь пуста");
                }
            } else if (input != "") {
                deque.addFirst(input);
            }
        }
    }
}
