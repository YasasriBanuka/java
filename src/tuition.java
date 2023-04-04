public class tuition {
    void subjectName (){
        System.out.println( " Best English Class ");
    }
}
class Sathya extends tuition {
    @Override
    void subjectName() {
        System.out.println( " Best commerce  Class ");
        super.subjectName();
    }
}
class Sipara extends Sathya  {
    @Override
    void subjectName() {
        System.out.println( " Best political  Class ");
        super.subjectName();
    }
}
class Sourthen extends Sipara {
    @Override
    void subjectName() {
        System.out.println(" Best biology and Chemistry  Class ");
        super.subjectName();
    }
}

class Subject{
    public static void main(String[] args) {
        Sathya s= new Sathya();
        Sipara i = new Sipara();
        Sourthen t = new Sourthen ();
         s. subjectName();
        i. subjectName();
        t. subjectName();


    }
}