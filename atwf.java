import com.google.android.gms.cast.CastDevice;

public final class atwf implements Runnable {
    public final atxp a;
    public final CastDevice b;

    public atwf(atxp atxp0, CastDevice castDevice0) {
        this.a = atxp0;
        this.b = castDevice0;
    }

    @Override
    public final void run() {
        this.a.j.a(this.b);
    }
}

