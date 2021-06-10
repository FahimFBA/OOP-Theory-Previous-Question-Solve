class ValidationException extends Exception{
    ValidationException(String customExceptionName){
        super(customExceptionName);
    }

}
class StudentDemo{
    int age;
    String name;
    StudentDemo(String name , int age) throws ValidationException{

        try {

            if (age > 100 || age < 0) {
                throw new ValidationException("Invalid age value");
            } else if (name.equals("")) {
                throw new ValidationException("Name can not be empty");
            } else {
                this.name = name;
                this.age = age;

            }
        }catch (ValidationException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ValidationException {
        String name;
        int age;


        new StudentDemo("", 23);
        new StudentDemo("Rahim",-17);
        new StudentDemo("Karim",27);
    }
}