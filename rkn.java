import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import java.util.ArrayList;
import java.util.List;

public final class rkn implements scz, sec {
    public static final rkm a;
    public final String b;
    public final String c;
    private final rkj d;
    private final rki e;
    private final rkf f;
    private final List g;
    private final boolean h;
    private final long i;
    private final List j;

    static {
        rkn.a = new rkm();
    }

    public rkn(OnboardingNode onboardingNode0) {
        ibuq.f(onboardingNode0, "source");
        String s = onboardingNode0.e();
        String s1 = onboardingNode0.f();
        rka rka0 = onboardingNode0.c();
        ibuq.f(rka0, "source");
        rkj rkj0 = new rkj(rka0.b(), rka0.a(), rka0.c());
        rjv rjv0 = onboardingNode0.b();
        ibuq.f(rjv0, "source");
        rkc[] arr_rkc = rjv0.b();
        ArrayList arrayList0 = new ArrayList(arr_rkc.length);
        for(int v = 0; v < arr_rkc.length; ++v) {
            arrayList0.add(arr_rkc[v]);
        }
        rki rki0 = new rki(arrayList0, rjv0.a());
        rkf rkf0 = onboardingNode0.d();
        List list0 = ibpg.N(onboardingNode0.i());
        boolean z = onboardingNode0.g();
        long v1 = onboardingNode0.a();
        ibwv[] arr_ibwv = ibve.a(onboardingNode0.h());
        ArrayList arrayList1 = new ArrayList(arr_ibwv.length);
        for(int v2 = 0; v2 < arr_ibwv.length; ++v2) {
            arrayList1.add(sed.d(arr_ibwv[v2], new ibwv[0], ibpt.a, ibpt.a));
        }
        this(s, s1, rkj0, rki0, rkf0, list0, z, v1, arrayList1);
    }

    public rkn(String s, String s1, rkj rkj0, rki rki0, rkf rkf0, List list0, boolean z, long v, List list1) {
        ibuq.f(s, "component");
        ibuq.f(s1, "name");
        ibuq.f(rkf0, "specificationType");
        ibuq.f(list0, "offGraphCallers");
        ibuq.f(list1, "metadata");
        super();
        this.b = s;
        this.c = s1;
        this.d = rkj0;
        this.e = rki0;
        this.f = rkf0;
        this.g = list0;
        this.h = z;
        this.i = v;
        this.j = list1;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("component", this.b);
        persistableBundle0.putString("name", this.c);
        persistableBundle0.putPersistableBundle("foreground", scy.a(this.d));
        persistableBundle0.putPersistableBundle("background", scy.a(this.e));
        persistableBundle0.putPersistableBundle("specificationType", scy.a(this.f));
        persistableBundle0.putStringArray("offGraphCallers", ((String[])this.g.toArray(new String[0])));
        persistableBundle0.putString("isTerminalNode", String.valueOf(this.h));
        persistableBundle0.putLong("timeoutInSeconds", this.i);
        sdq sdq0 = sdq.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.j, 10));
        for(Object object0: this.j) {
            arrayList0.add(new rkk(((see)object0)));
        }
        persistableBundle0.putPersistableBundle("metadata", sdq0.a(arrayList0));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rkn)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rkn)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((rkn)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((rkn)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rkn)object0).e)) {
            return false;
        }
        if(this.f != ((rkn)object0).f) {
            return false;
        }
        if(!ibuq.m(this.g, ((rkn)object0).g)) {
            return false;
        }
        if(this.h != ((rkn)object0).h) {
            return false;
        }
        return this.i == ((rkn)object0).i ? ibuq.m(this.j, ((rkn)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.b.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode();
        int v1 = this.j.hashCode();
        return this.h ? ((v * 0x1F + 0x4CF) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F + v1 : ((v * 0x1F + 0x4D5) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "POnboardingNode(component=" + this.b + ", name=" + this.c + ", foreground=" + this.d + ", background=" + this.e + ", specificationType=" + this.f + ", offGraphCallers=" + this.g + ", isTerminalNode=" + this.h + ", timeoutInSeconds=" + this.i + ", metadata=" + this.j + ")";
    }
}

