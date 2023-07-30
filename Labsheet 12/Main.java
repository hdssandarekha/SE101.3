
public class Main {
    public static void main(String[] args) {
        RedLight rl=new RedLight();
        GreenLight gl=new GreenLight();
        YellowLight yl=new YellowLight();

        rl.start();
        gl.start();
        yl.start();
    }
}