import com.google.android.gms.cast.CastDevice;
import java.util.Set;

public final class atvn implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final Set c;
    public final gket d;
    public final boolean e;

    public atvn(atxp atxp0, CastDevice castDevice0, Set set0, gket gket0, boolean z) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = set0;
        this.d = gket0;
        this.e = z;
    }

    @Override
    public final void run() {
        this.a.k.a(this.b, this.c, this.d, this.e);
    }
}

