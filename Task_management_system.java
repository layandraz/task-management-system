
import java.util.ArrayList;
import java.util.List;

public class Task_management_system {

    static class Task {

        String title;
        String priority;
        boolean completed;

        Task(String title, String priority, boolean completed) {
            this.title = title;
            this.priority = priority;
            this.completed = completed;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Complete Java homework", "High", false));
        tasks.add(new Task("Review Git commands", "Medium", true));
        tasks.add(new Task("Read Chapter 2", "Low", false));
             tasks.add(new Task("Prepare project presentation", "High", false));
        tasks.add(new Task("Submit Git homework", "High", false));
        System.out.println("Task Management System");
        System.out.println("----------------------");

        for (Task task : tasks) {
            String status = task.completed ? "Completed" : "Pending";
            System.out.println("Task: " + task.title);
            System.out.println("Priority: " + task.priority);
            System.out.println("Status: " + status);
            System.out.println("----------------------");
        }
    }
}
