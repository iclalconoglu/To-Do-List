import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class ToDoList {
    private LinkedList<String> tasks;
    private Stack<String> taskStack;
    private static final int MAX_TASKS = 10;

    public ToDoList() {
        tasks = new LinkedList<>();
        taskStack = new Stack<>();
    }
  

    
    public void addTask(String task) {
        if (taskStack.size() < MAX_TASKS) {
            tasks.add(task);
            taskStack.push(task);
            System.out.println("Görev başarıyla eklendi!");
        } else {
            System.out.println("Görev limiti doldu! Maksimum 10 görev eklenebilir.");
        }
    }

   
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Görev listeniz boş.");
        } else {
            System.out.println("\n--- Görevler ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void doneTasks(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            String a = tasks.get(taskIndex - 1);
            tasks.remove(taskIndex - 1);
            tasks.add(a + " \u2714");
            listTasks();
           
        }
    }

    
    public void removeTask(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            System.out.println("Silinen görev: " + tasks.get(taskIndex - 1));
            tasks.remove(taskIndex - 1);
            taskStack.remove(taskIndex - 1);
        } else {
            System.out.println("Geçersiz görev numarası.");
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
   
}
