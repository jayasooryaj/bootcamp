package day7;

public class LiskovSubstitution {
    public class Student
    {
        private double height;
        private double weight;
        public void setHeight(double h)
        {
            height = h;
        }
        public void setWeight(double w)
        {
            weight= w;
        }

    }

    // StudentBMI class has extra constraints as height and weight are not same as of the base class,
//    so this is a violation of Liskov Substitution Principle

    public class StudentBMI extends Student
    {
        public void setHeight(double h)
        {
            super.setHeight(h);
            super.setWeight(w);
        }
        public void setWeight(double h)
        {
            super.setHeight(h);
            super.setWeight(w);
        }
    }

}
