public class Laptop{
    
    private String name;
    private int ram;
    private int hardDiskCap;
    private String os;
    private String colour;


    public Laptop(String name, int ram, int hardDiskCap, String os, String colour){
        this.name = name;
        this.ram = ram;
        this.hardDiskCap = hardDiskCap;
        this.os = os;
        this.colour = colour;
    }


    public int getRam() {
        return ram;
    }

    public int getHardDiskCap() {
        return hardDiskCap;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Название: %s\nОЗУ: %d\nЁмкость HDD: %d\nОС: %s\nЦвет:%s",this.name,this.ram,this.hardDiskCap,this.os,this.colour);
    }

}