import com.google.android.gms.cast.CastDevice;

public final class atxk implements Runnable {
    public final atxp a;
    public final glbv b;
    public final int c;
    public final CastDevice d;

    public atxk(atxp atxp0, glbv glbv0, int v, CastDevice castDevice0) {
        this.a = atxp0;
        this.b = glbv0;
        this.c = v;
        this.d = castDevice0;
    }

    @Override
    public final void run() {
        this.a.t.c(this.b, this.c, this.d, gkey.bu);
    }
}

