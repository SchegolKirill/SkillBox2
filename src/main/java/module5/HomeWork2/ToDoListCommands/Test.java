package module5.HomeWork2.ToDoListCommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            todoList.add("дело" + i);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            String[] commands = command.split(" ", 3);
            String code = commands[0];

            if (commands.length == 1) {
                if (code.equals("LIST")) {
                    System.out.println(todoList);
                }
                if (code.equals("STOP")) {
                    return;
                }
            }

            if (commands.length == 2) {
                if (code.equals("ADD")) {
                    todoList.add(commands[1]);
                }
                if (code.equals("DELETE")) {
                    todoList.remove(Integer.parseInt(commands[1]));
                }
            }

            if (commands.length == 3) {
                int position = Integer.parseInt(commands[1]);
                String delo = commands[2];

                if (code.equals("ADD")) {
                    todoList.add(position, delo);
                } else if (code.equals("EDIT")) {
                    todoList.set(position, delo);
                }
            }

        }
    }
}
