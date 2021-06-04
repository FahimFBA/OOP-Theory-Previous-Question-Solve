public class Main {
    static String str = "a";
    public static void main(String[] args){
        try{
            str += "b";
            System.out.println(str);
            throw new Exception("Whatever");
        }
        catch (Exception e){str += "c"; }
        finally{
            str += "d";
            System.out.println(str);
            str += "e";
        }
        System.out.println(str);
    }
}

//Output
//
//    ab
//    abcd
//    abcde