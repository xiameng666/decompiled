import android.os.Build.VERSION;
import android.os.SystemProperties;

public final class rng {
    public static final hfst a() {
        hfsv hfsv0 = hfsu.a(((ProtoLiteMessage)hfst.a).v_newBuilder());
        hfsv0.c(300L);
        return hfsv0.a();
    }

    public static final boolean b() {
        return SystemProperties.getBoolean("aoj.feature.debug", false);
    }

    public static final boolean c() {
        return Build.VERSION.SDK_INT < 35 ? SystemProperties.getBoolean("aoj.feature.node_logging", false) : SystemProperties.getBoolean("aoj.feature.node_logging", true);
    }
}

