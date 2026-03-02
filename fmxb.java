import android.os.AsyncTask;
import j..util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

final class fmxb extends AsyncTask {
    public final Map a;
    final fmxw b;
    public static final int c;
    private final List d;
    private final Map e;
    private final boolean f;

    public fmxb(List list0, Map map0, boolean z, Map map1, fmxw fmxw0) {
        this.d = list0;
        this.e = map0;
        this.f = z;
        this.b = fmxw0;
        this.a = map1;
    }

    public static boolean a(fmga fmga0, fmga fmga1) {
        return TimeUnit.MICROSECONDS.toMillis(fmga1.d - fmga0.d) > 3600000L && fmga1.g != fmft.f;
    }

    public static boolean b(fmga fmga0) {
        return fmga0.f.a() == 3 && fmga0.f.b().a.equals("rich_card");
    }

    private static int c(int v, fmga fmga0, fmga fmga1, fmga fmga2, fmxa fmxa0) {
        boolean z = fmga2 != null && fmxa0.a(fmga2, fmga0);
        boolean z1 = fmga1 != null && fmxa0.a(fmga0, fmga1);
        if(v != 1) {
            switch(v) {
                case 2: {
                    if(z1) {
                        return z ? 2 : 1;
                    }
                    return z ? 3 : 0;
                }
                case 3: {
                    return z ? 3 : 0;
                }
                default: {
                    return 0;
                }
            }
        }
        return z1 ? 1 : 0;
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        flbo.b();
        gged_interceptors gged0 = ggch.j(this.d).l(new fmwy(this)).n();
        ggdy ggdy0 = new ggdy();
        int v = 0;
        int v1 = 0;
        while(v < gged0.size()) {
            fmga fmga0 = v <= 0 ? null : ((fmga)gged0.get(v - 1));
            fmga fmga1 = (fmga)gged0.get(v);
            ++v;
            fmga fmga2 = v >= gged0.size() ? null : ((fmga)gged0.get(v));
            int v2 = fmga2 == null || !fmxb.a(fmga2, fmga1) ? 0 : 1;
            int v3 = fmga1.g.equals(fmft.k) || fmga1.g.equals(fmft.g) ? 0 : fmxb.c(2, fmga1, fmga0, fmga2, new fmwx());
            int v4 = fmxb.c(v3, fmga1, fmga0, fmga2, new fmwz());
            boolean z = !fmga1.g.equals(fmft.f) && (v3 == 0 || v3 == 3) && v1 == 0 || fmga1.g.equals(fmft.g) || fmga1.g.equals(fmft.k);
            v1 |= v2;
            fmwc fmwc0 = new fmwc(null);
            fmwc0.a = gfsx.m(fmga1);
            fmeo fmeo0 = (fmeo)this.e.get(fmga1.b);
            if(fmeo0 == null) {
                throw new NullPointerException("Null senderProfile");
            }
            fmwc0.b = fmeo0;
            fmwc0.c = v4;
            fmwc0.d = v2;
            fmwc0.e = (byte)(fmwc0.e | 3);
            fmwc0.b(z);
            fmwd fmwd0 = fmwc0.a();
            if(fmga1.k.a() == fmfz.b) {
                Objects.requireNonNull(fmwd0);
                ggdy0.i(new fmwp(fmwd0));
            }
            else if(fmxb.b(fmga1)) {
                fmwc fmwc1 = new fmwc(fmwd0);
                fmwc1.b(true);
                fmwd fmwd1 = fmwc1.a();
                Objects.requireNonNull(fmwd1);
                ggdy0.i(new fmwn(fmwd1));
            }
            else {
                Objects.requireNonNull(fmwd0);
                ggdy0.i(new fmwm(fmwd0));
            }
            continue;
        }
        return ggdy0.h();
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        fmya fmya0 = this.b.a;
        gged_interceptors gged0 = fmya0.i;
        boolean z = this.f;
        if(gged0.isEmpty()) {
            gged_interceptors gged1 = fmya0.a(((gged_interceptors)object0));
            fmya0.c.b(z, gged1);
            return;
        }
        gmcd gmcd0 = gmbt.h(gmbu.i(((gged_interceptors)object0)));
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmwv fmwv0 = (fmwv)gged0.get(v1);
            Objects.requireNonNull(fmwv0);
            gmcd0 = glzd.g(gmcd0, new fmxq(fmwv0), gmap.a);
        }
        gmbu.t(gmcd0, new fmxz(fmya0, z, ((gged_interceptors)object0)), gmap.a);
        fmyi fmyi0 = fmya0.h;
        if(!fmyi0.i) {
            fmyi0.i = true;
            fmyi0.A(fmyi0.l);
        }
    }
}

