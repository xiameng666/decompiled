import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;

public final class zms implements zml {
    public static final zmo a;
    public static final baun b;
    public final fhrt c;
    public final aatb d;
    public final zjw e;
    public final zkl f;
    public final zjp g;
    public final icck h;
    public final lqi i;
    public final lqi j;
    public final aauo k;
    public final icnl l;
    private final icck m;

    static {
        zms.a = new zmo("", ibps.a);
        zms.b = new baun("AccountSettings", new String[]{"SearchManager"});
    }

    @AssistedInject
    public zms(@Assisted fhrt fhrt0, aatb aatb0, aauo aauo0, zjw zjw0, zkl zkl0, zjp zjp0, icck icck0, icck icck1) {
        ibuq.f(fhrt0, "callingAndroidApp");
        ibuq.f(aatb0, "activeUser");
        ibuq.f(aauo0, "capabilityProvider");
        ibuq.f(zjw0, "repositoryData");
        ibuq.f(zkl0, "resourceInfoDao");
        super();
        this.c = fhrt0;
        this.d = aatb0;
        this.k = aauo0;
        this.e = zjw0;
        this.f = zkl0;
        this.g = zjp0;
        this.h = icck0;
        this.m = icck1;
        this.i = new lqi();
        this.j = new lqi(zmx.a);
        this.l = icnm.a(zms.a);
        icbb.b(icck1, null, null, new zmn(this, null), 3);
    }

    @Override  // zml
    public final lqd a() {
        return this.i;
    }

    @Override  // zml
    public final lqd b() {
        return this.j;
    }

    @Override  // zml
    public final aatb c() {
        return this.d;
    }

    @Override  // zml
    public final void d(String s, List list0) {
        if(s.length() != 0) {
            zmo zmo0 = new zmo(s, list0);
            icnl icnl0 = this.l;
            if(!ibuq.m(zmo0, icnl0.b()) || (this.j.ij() instanceof zmv)) {
                icnl0.g(zmo0);
                this.j.l(zmw.a);
            }
        }
    }

    public final void e(String s, Throwable throwable0) {
        zmp zmp0 = new zmp(this, s, throwable0, null);
        icbb.b(this.h, null, null, zmp0, 3);
    }
}

