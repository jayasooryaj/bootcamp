package designpatterns;

public class Strategy {
    public static void main(String arg[]){
        Employee e1 = new Employee("Jayasoorya", new Consultant());
        Employee e2 = new Employee("Janaki", new SeniorConsultant());

        System.out.println("=====  Before Promotion  =====");
        e1.doWork();
        e2.doWork();
        
        e1.promote(new SeniorConsultant());
        e2.promote(new LeadConsultant());

        System.out.println("=====  After Promotion  =====");
        e1.doWork();
        e2.doWork();
    }
}

interface Role{
    String description();
    String responsibilities();
}

class Consultant implements Role{

    @Override
    public String description() {
        return Consultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Write Code";
    }
}
class SeniorConsultant implements Role{

    @Override
    public String description() {
        return SeniorConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Review Code";
    }
}
class LeadConsultant implements Role{

    @Override
    public String description() {
        return LeadConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Make Tech Decisions";
    }
}

class Employee {
    private String name;
    private Role role;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void promote(Role newRole){
        role = newRole;
    }

    public String grade(){
        return this.name + " is a " + role.description();
    }

    public void doWork(){
        System.out.println(name + " will " + role.responsibilities());
    }
}
