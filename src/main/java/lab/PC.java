package lab;

public class PC {
    private Case pcCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case pcCase, MotherBoard motherBoard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void powerUp(){
        getPcCase().pressPowerButton();
        drawLogo();
        getMotherBoard().loadProgram("Intellij");
    }

    private void drawLogo(){
        getMonitor().drawPixel(10,10,"Purple");
    }



    public void description(){

        System.out.println("Welcome to worst buy below is the description of the pc on sale today\n" +
                "" + monitor + "\n" + pcCase + "\n" + motherBoard);

    }
}
