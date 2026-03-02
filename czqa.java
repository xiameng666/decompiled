import java.util.Locale;

public final class czqa implements Runnable {
    public final String a;
    public final int b;

    public czqa(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final void run() {
        gymd gymd0 = czkh.a(this.b);
        czke.j(this.a, 6, gymr.b, gymd0, String.format(Locale.US, "Failure code : %d", ((int)this.b)));
    }
}

