

public class Main {

    public static void main(String[] args) {
        // write your code here
        paladin main = new paladin("Dogecoin");
        wizard sub = new wizard("ETH");
        ring Rame = new ring();
        necklace Nman = new necklace();
        Rame.Skill();
        main.Equipring(Rame);
        Nman.Skill();
        main.Equipnecklace(Nman);
        main.Show_detail();
        main.Attacked(sub);
        Nman.Skill();
        sub.Equipnecklace(Nman);
        sub.Show_detail();
        sub.Attacked(main);

    }
}
