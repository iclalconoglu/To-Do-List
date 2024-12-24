import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        int choice;

        do {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Görev Ekle");
            System.out.println("2. Görevleri Listele");
            System.out.println("3. Görev Sil");
            System.out.println("4. Tamamlanmış Görevler");
            System.out.println("5. Çık");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz görevi yazın: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;

                case 2:
                    toDoList.listTasks();
                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("Silinecek görev yok.");
                    } else {
                        toDoList.listTasks();
                        System.out.print("Silmek istediğiniz görevin numarasını girin: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine(); 
                        toDoList.removeTask(taskNumber);
                    }
                    break;

                case 4:
                    toDoList.listTasks();
                    System.out.print("Tamamladığınız görevin numarasını girin: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    toDoList.doneTasks(taskNumber);
                    break;

                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        } while (choice != 5);

       
    }
}
