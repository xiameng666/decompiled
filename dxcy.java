import com.google.android.gms.common.Feature;
import j..util.Objects;

final class dxcy implements Runnable {
    final String a;
    final dxcz b;

    public dxcy(dxcz dxcz0, String s) {
        this.a = s;
        Objects.requireNonNull(dxcz0);
        this.b = dxcz0;
        super();
    }

    @Override
    public final void run() {
        azzc azzc0 = new azzc();
        azzc0.a = new dorc(this.b.e, this.b.c, this.a, dxcz.b);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7220;
        azzd azzd0 = azzc0.a();
        this.b.e.iG(azzd0);
        this.b.d.postDelayed(this, dxcz.a);
    }
}

