package lab;

public class Monitor {

    private Resolution resolution;
    private int modelNumber;
    private String manufacturerName;


    public Monitor(Resolution resolution, int modelNumber, String manufacturerName) {
        this.resolution = resolution;
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }




    public void drawPixel(int x, int y, String color){

        String printing = "Drawing pixel at " + x + "," + y
                + " in color " + color;


        System.out.println(printing);
    }




    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", modelNumber=" + modelNumber +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }



}
