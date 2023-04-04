public class human {
    void run (){
        System.out.println(" human can eat");
    }
}
class banuka extends human{
    void run(){
        System.out.println("banuka can eat");
    }
    public static void main(String[] args) {
        banuka b= new banuka ();
        b.run();
    }
}