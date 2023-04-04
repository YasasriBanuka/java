public class centralBank {
    int getInterestRate(){
        return 0;
    }
}

class boc extends centralBank{
    @Override
    int getInterestRate() {
        return 8;
    }
}
class peopleBank extends centralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class nsbBank extends centralBank{
    @Override
    int getInterestRate() {
        return 17;
    }
}
class testOverriding {
    public static void main(String[] args) {
        boc b = new boc();
        peopleBank p = new peopleBank();
        nsbBank n = new nsbBank();
        System.out.println("Interate Rate :-" + b.getInterestRate() + "%");
        System.out.println("Interate Rate :-" + p.getInterestRate() + "%");
        System.out.println("Interate Rate :-" + n.getInterestRate() + "%");

    }
}