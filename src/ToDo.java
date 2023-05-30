import java.util.*;

public class ToDo {
    static TaskList task;
    static Task d;
    public static void run() {
        System.out.println("What would you like to do? \n");
        System.out.println("1- Add a new task. ");
        System.out.println("2- Remove an existing task. ");
        System.out.println("3- Edit a task. ");
        System.out.println("4- Mark a task as completed. ");
        System.out.println("5- List all tasks. ");
        System.out.println("6- Sort tasks by date. ");
        System.out.println("7- Exit. ");
        Scanner Input = new Scanner(System.in);
        int UserNum = Input.nextInt();
        switch (UserNum) {
            case 1:
                add();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                System.out.println("Quitting from program. ");
               System.exit(0);

        }

    }

    public static void add() {

        Scanner input = new Scanner(System.in);
        Date duedate =new Date();
        System.out.println("Enter Task description: ");
        String des=input.nextLine();
         d.setDescription(des);
        task.addTask(d);

        System.out.println("Enter Task year: ");
        int year = input.nextInt();
        duedate.setYear(year);
        System.out.println("Enter Task month: ");
        int month = input.nextInt();
        duedate.setMonth(month);

     //   System.out.println("Enter Task day: ");
      //  int day = input.nextInt();
      //  duedate.setDay(day);
    }
public static void main(String[]args){

        run();
}

}