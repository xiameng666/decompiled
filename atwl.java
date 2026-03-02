import com.google.android.gms.cast.CastDevice;

public final class atwl implements Runnable {
    public final atxp a;
    public final glbe b;
    public final CastDevice c;
    public final int d;
    public final String e;

    public atwl(atxp atxp0, glbe glbe0, CastDevice castDevice0, int v, String s) {
        this.a = atxp0;
        this.b = glbe0;
        this.c = castDevice0;
        this.d = v;
        this.e = s;
    }

    @Override
    public final void run() {
        this.a.u.a(this.b, this.c, this.d, gkey.bE, this.e);
    }
}

