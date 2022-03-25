package day7.mvc;

public class MyMVC {
    public static void main(String[] args) {

        Student model  = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();


        controller.setStudentName("Jayasoorya");
        controller.setStudentRollNo("28");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Janaki");
        student.setRollNo("26");
        return student;
    }
}
