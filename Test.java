

public class Test {
    public static void main(String args[]) {
        Sps sps = new Sps();

        /*sps.userSet("Paper");
        sps.computerSet();
        sps.display();
        sps.setPoint();
        sps.displayScore();
        sps.whoWin();*/

        sps.sps("paper");
        System.out.println();
        sps.sps("SCISSOR");
        System.out.println();
        sps.sps("stone");
        System.out.println();
        sps.sps("paper");
        System.out.println();
        sps.sps("stone");

        System.out.println();
        sps.displayScore();
        sps.whoWin();
    }
}