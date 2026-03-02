import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import java.util.ArrayList;
import java.util.List;

public final class rzl implements scz, sec {
    public static final rzk a;
    private final List b;

    static {
        rzl.a = new rzk();
    }

    public rzl(List list0) {
        ibuq.f(list0, "results");
        super();
        this.b = list0;
    }

    public rzl(rzp rzp0) {
        ibuq.f(rzp0, "source");
        rzm[] arr_rzm = rzp0.a();
        ArrayList arrayList0 = new ArrayList(arr_rzm.length);
        for(int v = 0; v < arr_rzm.length; ++v) {
            rzm rzm0 = arr_rzm[v];
            ibuq.f(rzm0, "source");
            arrayList0.add(new rzc(sed.d(new ibuk(rzm0.a()), new ibwv[]{new ibuk(OnboardingNode.class), new ibuk(rzn.class)}, ibpz.i(new ibns[]{new ibns(new ibuk(OnboardingNode.class), new rza()), new ibns(new ibuk(rzn.class), new rzb())}), ibpz.i(new ibns[]{new ibns(new ibuk(OnboardingNode.class), "com.android.onboarding.contracts.annotations.OnboardingNode"), new ibns(new ibuk(rzn.class), "com.android.onboarding.tasks.precalculation.annotations.Precalculation")})), rzm0.b()));
        }
        this(arrayList0);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdq sdq0 = sdq.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object0: this.b) {
            arrayList0.add(new rzi(((rzc)object0)));
        }
        persistableBundle0.putPersistableBundle("results", sdq0.a(arrayList0));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof rzl) ? ibuq.m(this.b, ((rzl)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "PUsesPrecalculatedResult(results=" + this.b + ")";
    }
}

