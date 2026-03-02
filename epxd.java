import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.Feature;

public final class epxd {
    public static final baun a;
    public final Context b;
    public eqme c;
    public eray d;
    private final aimj e;

    static {
        epxd.a = new erqc(new String[]{"D2D", "BlockstoreController"});
    }

    public epxd(Context context0) {
        this(context0, null);
    }

    public epxd(Context context0, eqme eqme0) {
        this.b = context0;
        this.e = new aipl(context0);
        this.c = eqme0;
    }

    public epxd(Context context0, eray eray0) {
        this.b = context0;
        this.e = new aipl(context0);
        this.d = eray0;
    }

    public final evql a(epzc epzc0, epzc epzc1) {
        boolean z = epzc0.b(11);
        boolean z1 = hygh.a.c().b();
        epxd.a.h("Target has BlockStore support: " + z + ". Source has support: " + z1, new Object[0]);
        if(z1 && z) {
            epzc1.c(10, true);
            return this.b();
        }
        return null;
    }

    public final evql b() {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjw.b};
        azzc0.a = new aiph(((aipl)this.e));
        azzc0.b = false;
        azzc0.d = 0x624;
        azzd azzd0 = azzc0.a();
        return ((azts)this.e).iG(azzd0);
    }

    public final void c(byte[] arr_b, Handler handler0) {
        epxd.a.h("Store BlockStore data.", new Object[0]);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjw.b};
        azzc0.a = new aipi(((aipl)this.e), arr_b);
        azzc0.b = false;
        azzc0.d = 0x623;
        azzd azzd0 = azzc0.a();
        evql evql0 = ((azts)this.e).iG(azzd0);
        evql0.y(new bbre(handler0), new epxb(this));
        evql0.v(new bbre(handler0), new epxc(this));
    }
}

