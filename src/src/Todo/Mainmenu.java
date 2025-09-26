package Todo;

import java.util.Scanner;

public class Mainmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoApp app = new TodoApp();

        boolean run = true;
        while (run) {
            System.out.println("اضاقه کردن تسک.۱");
            System.out.println("نمایش تسک.2");
            System.out.println("علامت زدن تسک.3");
            System.out.println("حذف تسک.4");
            System.out.println("حروج.5");
            System.out.println("انتخاب  شما ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("عنوان تسک");
                    String title = scanner.nextLine();
                    app.addTask(title);
                    break;
                case 2:
                    app.listTasks();
                    break;
                case 3:
                    System.out.println("شناسه تسک");
                    int done = scanner.nextInt();
                    app.markDone(done);
                    break;
                case 4:
                    System.out.println("شناسه تسک");
                    int removed = scanner.nextInt();
                    app.removeTask(removed);
                    break;
                case 5:
                    System.out.println("خروج از بزنامه ");
                    run = false;
                    break;
                default:
                    System.out.println("عدد نامعتبر است");
            }

        }
    }
}
