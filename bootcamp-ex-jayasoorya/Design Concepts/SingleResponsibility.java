package day7;

public class SingleResponsibility {
    public void main(String arg[]){

    }
    public class Student
    {
        private String stdName;
        private int stdMark;
        private int stdPerc;

        //violates single responsibility. For each functionality a separate class should be used

        public void printDetails()
        {
//            System.out.println("Name: " + this.stdName);
//            System.out.println("Percentage: " + this.stdPerc);
        }
        pubic void calculatePercentage()
        {
//            this.stdPerc = this.stdMark*2;
        }
        public void addStudent()
        {
//      ....
        }
    }

}
