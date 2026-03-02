import com.google.android.gms.cast.CastDevice;

public final class atwn implements Runnable {
    public final atxp a;
    public final glbv b;
    public final int c;
    public final CastDevice d;
    public final hhcy e;

    public atwn(atxp atxp0, glbv glbv0, int v, CastDevice castDevice0, hhcy hhcy0) {
        this.a = atxp0;
        this.b = glbv0;
        this.c = v;
        this.d = castDevice0;
        this.e = hhcy0;
    }

    @Override
    public final void run() {
        this.a.t.b(this.b, this.c, this.d, this.e);
    }
}

