import android.content.Context;
import android.content.IntentFilter;

public final class fced extends azts {
    private final fdfm a;

    public fced(Context context0, aztr_settings aztr0) {
        super(context0, fcfo.a, fcfn.a, aztr0);
        this.a = new fdfm();
    }

    public final evql e(fcec fcec0, String s) {
        baqc.c(fcec0, "listener must not be null");
        IntentFilter intentFilter0 = fdlk.a("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if(!s.startsWith("/")) {
            s = "/" + s;
        }
        intentFilter0.addDataPath(s, 0);
        azyf azyf0 = azyg.b(fcec0, this.B, "CapabilityListener:" + s);
        fdfq fdfq0 = new fdfq(fcec0, s);
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new fdfo(fdfq0, azyf0, new IntentFilter[]{intentFilter0});
        azyq0.b = new fdfp(fdfq0);
        azyq0.e = 24013;
        return this.iH(azyq0.a());
    }

    public final evql f(String s) {
        fdfh fdfh0 = new fdfh(this.a, this.D, s);
        this.D.c(fdfh0);
        return batf.c(fdfh0);
    }

    public final evql g(String s, int v) {
        if(v != 0) {
            v = 1;
        }
        fdfg fdfg0 = new fdfg(this.a, this.D, s, v);
        this.D.c(fdfg0);
        return batf.b(fdfg0, new fdfn());
    }

    public final evql h(fcec fcec0, String s) {
        baqc.c(fcec0, "listener must not be null");
        if(!s.startsWith("/")) {
            s = "/" + s;
        }
        azyd_linstner azyd0 = azyg.b(fcec0, this.B, "CapabilityListener:" + s).listener_;
        batl.t(azyd0, "Key must not be null");
        return this.jm(azyd0, 24003);
    }

    public final evql i(String s) {
        fdfi fdfi0 = new fdfi(this.a, this.D, s);
        this.D.c(fdfi0);
        return batf.c(fdfi0);
    }
}

