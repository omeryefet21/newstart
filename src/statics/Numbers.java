package statics;

import javax.sound.midi.Soundbank;

public class Numbers {
    private int x;
    static private int y=10;
    public void add() {
        x++;
        y++;
        System.out.println("x="+x+" y="+y);
    }

    public Numbers(int x) {
        this.x = x;
    }
}
