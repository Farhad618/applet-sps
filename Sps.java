import java.lang.Math;

class Sps {
     String user;
     String computer;
     int userPoint = 0;
     int computerPoint = 0;

    void userSet(String s) {
        s = s.toUpperCase();
        if (s.equals("STONE") ||
            s.equals("PAPER") ||
            s.equals("SCISSOR")) {
            user = s;
        }        
    }

    void computerSet() {
        final String[] spsarray = {"STONE", "PAPER", "SCISSOR"};
        computer = spsarray[(int)(Math.random()*3)];
    }

    void display() {
        System.out.println("Computer: " + computer);
        System.out.println("User: " + user);
    }

    void displayScore() {
        System.out.println("Computer: " + computerPoint);
        System.out.println("User: " + userPoint);
    }    

    void setPoint() {
        if (!(user.equals(computer))) {
            if ((user.equals("STONE") && computer.equals("SCISSOR")) || 
                (user.equals("PAPER") && computer.equals("STONE")) ||
                (user.equals("SCISSOR") && computer.equals("PAPER"))) {
                userPoint++;
            } else {
                computerPoint++;
            }
        }
    }

    void whoWin() {
        if (userPoint > computerPoint) {
            System.out.println("You win.");
        } else if (computerPoint > userPoint) {
            System.out.println("You loos.");
        } else {
            System.out.println("Draw match.");
        }
    }

    Sps() {}

    Sps(String s) {
        userSet(s);
        computerSet();
        display();
        setPoint();
        displayScore();
        whoWin();
    }
    void sps(String s) {
        userSet(s);
        computerSet();
        display();
        setPoint();
        // displayScore();
        // whoWin();
    }


}