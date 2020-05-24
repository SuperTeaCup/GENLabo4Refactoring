package ch.heigvd.gen2019;

public enum Color {
    NO_COLOR("no color"),
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    GREEN("green");

    private final String color;

    Color(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return this.color;
    }


}
