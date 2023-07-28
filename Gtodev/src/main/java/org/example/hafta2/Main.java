package org.example.hafta2;


public class Main {
    public static void main(String[] args) {

        GameController xboxController = new XboxController();
        GameController psController = new PlaystationController();

        Xbox xbox = new Xbox();
        Playstation ps = new Playstation();
        Computer pc = new Computer();

        try {

            xbox.open();
            xbox.addController(xboxController);
            xbox.playGame();


            ps.open();
            ps.addController(psController);
            ps.playGame();


            pc.open();
            pc.addController(xboxController);
            pc.playGame();


            pc.addController(psController);
            pc.playGame();


            xbox.addController(psController);


            ps.addController(xboxController);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
