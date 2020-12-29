package gui;

public class Main {
    private static Gui frame;

    public static void main(String [] args){
        frame = new Gui();
    }

    public static Gui getFrame(){
        return frame;
    }
}
