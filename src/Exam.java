public class Exam {
    int result(){
        return 0;
    }
}
 class Science extends Exam {
     @Override
     int result() {
         return 60;
     }
 }
class English  extends Science  {
    @Override
    int result() {
        return 90;
    }
}
class Geography  extends English {
     @Override
    int result() {
            return 79;
     }
}
class Health extends Geography  {
    @Override
    int result() {
            return 100;
    }
}
 class testOverrideing  {
     public static void main(String[] args) {
         Science s = new Science();
         English e= new English ();
         Geography g= new Geography();
         Health h= new Health ();
         System.out.println( " My result For Science "+ s.result()+ "%" );
         System.out.println( " My result For English "+ e.result()+ "%" );
         System.out.println( " My result For Geography "+ g.result()+ "%" );
         System.out.println( " My result For Health  "+ h.result()+ "%" );
     }
 }
