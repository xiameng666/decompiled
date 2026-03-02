import android.util.Range;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.List;

public final class bjo {
    public static final bjr a;
    public static final bjr b;
    public static final bjr c;
    final List d;
    public final bjt e;
    public final int f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final bms j;
    public final bhv k;

    static {
        bjo.a = new bjr("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        bjo.b = new bjr("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        bjo.c = new bjr("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public bjo(List list0, bjt bjt0, int v, boolean z, List list1, boolean z1, bms bms0, bhv bhv0) {
        this.d = list0;
        this.e = bjt0;
        this.f = v;
        this.h = DesugarCollections.unmodifiableList(list1);
        this.i = z1;
        this.j = bms0;
        this.k = bhv0;
        this.g = z;
    }

    public final int a() {
        Object object0 = this.j.a("CAPTURE_CONFIG_ID_KEY");
        return object0 == null ? -1 : ((int)(((Integer)object0)));
    }

    public final int b() {
        return (int)(((Integer)Objects.requireNonNull(((Integer)this.e.m(bnc.z, Integer.valueOf(0))))));
    }

    public final int c() {
        return (int)(((Integer)Objects.requireNonNull(((Integer)this.e.m(bnc.A, Integer.valueOf(0))))));
    }

    public final Range d() {
        return (Range)Objects.requireNonNull(((Range)this.e.m(bjo.c, bmi.a)));
    }

    public final List e() {
        return DesugarCollections.unmodifiableList(this.d);
    }
}

