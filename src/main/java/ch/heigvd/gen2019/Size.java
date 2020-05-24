package ch.heigvd.gen2019;

public enum Size {

    INVALID_SIZE("Invalid Size"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XM("XM"),
    XXL("XXL");


    private final String size;

    Size(String size){
        this.size=size;
    }
    @Override
    public String toString(){
        return this.size;
    }
}
