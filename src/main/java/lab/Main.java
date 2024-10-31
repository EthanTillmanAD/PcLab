package lab;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(15,10,5);

        Case myCase = new Case("H5 mid Atx", "NZXT", "950w", dimensions);

        Resolution resolution = new Resolution(1080, 1920);

        Monitor monitor = new Monitor(resolution, 455467, "ASUS");

        MotherBoard motherBoard = new MotherBoard("Z390 gaming", "Gigabyte", 4, 4, "3.09.4567");

        PC myPc = new PC(myCase, motherBoard, monitor);

        myPc.description();

        myPc.powerUp();







    }
}
