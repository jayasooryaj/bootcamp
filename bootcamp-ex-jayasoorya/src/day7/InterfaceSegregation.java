package day7;

public class InterfaceSegregation {
//    public interface Conversion
//    {
//        public void intToDouble();
//        public void intToChar();
//        public void charToString();
//    }
//    Here we have no choice to implement a single method alone

    public interface ConvertIntToDouble
    {
        public void intToDouble();
    }
    public interface ConvertIntToChar
    {
        public void intToChar();
    }
    public interface ConvertCharToString
    {
        public void charToString();
    }


//If we want to inplement any two methods, then it can be achieved like this
    public class DataTypeConversion implements ConvertIntToDouble, ConvertCharToString
    {
        public void intToDouble()
        {
            //conversion logic
        }
        public void charToString()
        {
            //conversion logic
        }
    }


}
