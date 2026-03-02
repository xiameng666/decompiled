import java.util.Random;

public final class fldb {
    public final Random a;
    public int b;
    public int c;
    public gmcd d;

    public fldb() {
        this.a = new Random();
        this.b = 3;
        this.c = 0;
    }

    public final void a() {
        this.b = 3;
        this.c = 0;
        gmcd gmcd0 = this.d;
        if(gmcd0 != null) {
            gmcd0.cancel(true);
            this.d = null;
        }
    }
}

