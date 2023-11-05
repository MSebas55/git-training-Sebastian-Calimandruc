import java.util.Random;
public class HiloCaraCruz extends Thread {
    private boolean cara;
    public HiloCaraCruz() {
    }
    public void run() {
        cara = new Random().nextBoolean();
    }
    public boolean isCara() {
        return cara;
    }
    public void setCara(boolean cara) {
        this.cara = cara;
    }
}