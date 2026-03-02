import android.content.Context;
import android.location.Location;

@ibnh
public final class bpcn {
    public static final bboh a;
    public final Context b;
    public final boph c;
    public final fqxe d;
    public final fgvt e;
    public final gmcg f;
    public long g;

    static {
        bpcn.a = bboh.b("NotableLocations", bbcu.eD);
    }

    public bpcn(Context context0, boph boph0, fqxe fqxe0, fgvt fgvt0, gmcg gmcg0) {
        this.g = 0L;
        this.b = context0;
        this.c = boph0;
        this.d = fqxe0;
        this.e = fgvt0;
        this.f = gmcg0;
    }

    final gmcd a(Location location0) {
        if(location0 == null) {
            return gmbu.i(bpcm.c);
        }
        long v = hsxv.a.y().ae();
        return v <= 0L ? gmbu.i(bpcm.d) : gdta.g(glzd.f(((boul)this.d).j.a(), new botp(), gmap.a)).i(new bpch(this, location0, v), gmap.a);
    }

    public static boolean b(double f, double f1, double f2, double f3, long v) {
        float[] arr_f = new float[1];
        Location.distanceBetween(f, f1, f2, f3, arr_f);
        return arr_f[0] <= ((float)v);
    }
}

