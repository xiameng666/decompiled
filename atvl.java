import com.google.android.gms.cast.CastDevice;
import java.util.Set;

public final class atvl implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final boolean f;

    public atvl(atxp atxp0, CastDevice castDevice0, Set set0, Set set1, Set set2, boolean z) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = set0;
        this.d = set1;
        this.e = set2;
        this.f = z;
    }

    @Override
    public final void run() {
        this.a.k.b(this.b, this.c, this.d, this.e, this.f);
    }
}

