import android.util.Log;
import j..util.Objects;

final class fdql extends fdrc {
    final String a;
    final feye b;
    final fdri c;

    public fdql(fdri fdri0, String s, feye feye0) {
        this.a = s;
        this.b = feye0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelClose(%s, request)", this.a));
        }
        feye feye0 = this.b;
        fdpl fdpl0 = fdpl.a(feye0.f, feye0.g);
        fdpl fdpl1 = this.c.e.a(this.a, fdpl0);
        fdrq fdrq0 = new fdrq(this.a, fdpl1, feye0.d, ((boolean)(feye0.e ^ 1)));
        fdro fdro0 = (fdro)this.c.d.c(fdrq0);
        if(fdro0 == null) {
            fdny.a(fdnn.c);
            Log.w("ChannelManager", "Incoming request for inactive channel: channel close for " + fdrq0.toString());
            return;
        }
        this.g = fdro0;
        ffhh ffhh0 = fdro0.v;
        if(ffhh0 == null) {
            fdro0.f(2, feye0.i);
            fdro0.e(2, feye0.i);
            fdro0.s.b(fdro0.a.b, fdro0.a, fdro0.h, fdro0.a.a, 2, feye0.i);
        }
        else {
            ffhh0.a(16, null, fdro0.h);
            fdro0.v = null;
        }
        fdro0.d();
    }
}

