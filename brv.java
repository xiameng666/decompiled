import android.view.Surface;

public final class brv implements Runnable {
    public final bsb a;
    public final bsv b;

    public brv(bsb bsb0, bsv bsv0) {
        this.a = bsb0;
        this.b = bsv0;
    }

    @Override
    public final void run() {
        brq brq0 = new brq(this.a, this.b);
        Surface surface0 = this.b.a(this.a.c, brq0);
        this.a.a.e(surface0);
        this.a.f.put(this.b, surface0);
    }
}

