
    class School {
        void student()
        {
            School  s = new  School();
            System.out.println("Best Student ");

        }
    }
    class Tuition extends  School {
        @Override
        void student() {
            System.out.println(" best Science Student");
        }
    }
    class test  {
        public static void main(String[] args) {

            School s = new Tuition();

            Tuition t = new Tuition();

            s.student ();
            System.out.println( s +"in the SIPRO CLASS");
            System.out.println( "Stuednt"+"in the SIPARA CLASS");

        }
    }
