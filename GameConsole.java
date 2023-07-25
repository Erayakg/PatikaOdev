package patika3.haftaodev;


    abstract class GameConsole {
        private boolean isOn = false;
        private GameController controller;

        void open() {
            if (isOn) {
                throw new IllegalStateException("Cihaz zaten açık.");
            }
            isOn = true;
        }

        void shutdown() {
            if (!isOn) {
                throw new IllegalStateException("Cihaz zaten kapalı.");
            }
            isOn = false;
        }

        void addController(GameController controller) {
            this.controller = controller;
        }

        void playGame() {
            if (!isOn) {
                throw new IllegalStateException("Cihaz kapalı.");
            }
            System.out.println("Oyun başladı.");
        }
    }

