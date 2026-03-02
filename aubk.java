import com.google.android.gms.cast.CastDevice;

public final class aubk {
    public final auca a;
    public final aucr b;
    public final auhn c;

    public aubk(auca auca0, aucr aucr0, auhn auhn0) {
        this.a = auca0;
        this.b = aucr0;
        this.c = auhn0;
    }

    public static boolean a(CastDevice castDevice0, aubj aubj0, auhn auhn0) {
        return aubj0.a.equals("com.google.android.apps.chromecast.app") && auhn0.d(castDevice0.f()) != null;
    }
}

