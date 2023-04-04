public class grade {
    void  section(){
        System.out.println("i am grade 05 class Teacher");
    }
}

class grade3 extends grade {
    @Override
    void section() {
        System.out.println("i am grade 07 best class Teacher");
        super.section();
    }
}
class grade4 extends  grade3{
    @Override
    void section() {
        System.out.println("i am a handsome grade 08 sectional head in the school ");
        super.section();
    }
}

class principle{
    public static void main(String[] args) {
         grade3 g = new grade3();
         grade4 g1 = new grade4();
         g.section();
         g1.section();

    }
}