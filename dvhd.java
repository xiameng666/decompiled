import com.google.android.gms.pay.PassFilter;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import java.util.ArrayList;
import java.util.Collections;

public final class dvhd {
    public static final bboh a;
    public static final PassFilter b;
    public final dvjf c;
    private static final dvhc d;
    private final dspp e;

    static {
        dvhd.a = bboh.b("Pay", bbcu.cZ);
        PassFilter passFilter0 = new PassFilter();
        passFilter0.h = 2;
        dvhd.b = passFilter0;
        dvhd.d = new dvhc();
    }

    public dvhd(dspp dspp0, dvjf dvjf0) {
        this.e = dspp0;
        this.c = dvjf0;
    }

    public final gged_interceptors a(gged_interceptors gged0, gfsx gfsx0) {
        return this.b(gged0, gfsx0, true);
    }

    public final gged_interceptors b(gged_interceptors gged0, gfsx gfsx0, boolean z) {
        ArrayList arrayList0 = new ArrayList(gged0.size());
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ValuableGroup valuableGroup0 = (ValuableGroup)gged0.get(v1);
            gfsx gfsx1 = valuableGroup0.d();
            if(gfsx1.i()) {
                gueo gueo0 = (gueo)gfsx1.d();
                if((gueo0.b & 2) != 0 && this.e.b((gueo0.d == null ? guce.b : gueo0.d), null, valuableGroup0, z)) {
                    arrayList0.add(valuableGroup0);
                }
            }
        }
        Collections.sort(arrayList0, dvhd.d);
        return !gfsx0.i() || ((int)(((Integer)gfsx0.d()))) >= arrayList0.size() ? gged_interceptors.i(arrayList0) : gged_interceptors.i(arrayList0.subList(0, ((Integer)gfsx0.d()).intValue()));
    }
}

