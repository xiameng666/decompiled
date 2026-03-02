import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import java.util.ArrayList;

public final class dmay implements dmba {
    private static final bboh a;
    private final dmcy b;

    static {
        dmay.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmay(dmcy dmcy0) {
        this.b = dmcy0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gfsx gfsx0;
        boolean z = true;
        gftb.b(hjwe0.b == 73, "cannot evaluate: does not have valuables info filter");
        dmcy dmcy0 = this.b;
        if(hwmp.r()) {
            try {
                if(dmcy0.e == null) {
                    dmcy0.e = (gged_interceptors)dmcy0.d.a(dmcy.b).first;
                }
                gged_interceptors gged0 = ValuableGroup.g(dmcy0.e);
                ibuq.e(gged0, "groupValuables(...)");
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                while(ggqk0.hasNext()) {
                    gged_interceptors gged1 = ((ValuableGroup)ggqk0.next()).a;
                    ibuq.e(gged1, "valuables(...)");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: gged1) {
                        if(new dmcw().test(((Valuable)object0))) {
                            arrayList0.add(object0);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object1: arrayList0) {
                        if(new dmcx().test(((Valuable)object1))) {
                            arrayList1.add(object1);
                        }
                    }
                    if(arrayList1.isEmpty()) {
                        continue;
                    }
                    goto label_32;
                }
                z = false;
            label_32:
                gfsx0 = gfsx.l(Boolean.valueOf(z));
            }
            catch(eaqz eaqz0) {
                a.ae(dmcy.a.j(), "Failed to check ID growth campaign eligibility because of missing storage key", eaqz0);
                gfsx0 = gfqx.a;
            }
            catch(earn earn0) {
                a.ae(dmcy.a.j(), "Failed to check ID growth campaign eligibility because of missing storage key", earn0);
                gfsx0 = gfqx.a;
            }
            catch(dmhl dmhl0) {
                a.ae(dmcy.a.j(), "Failed to check ID growth campaign eligibility because of a database exception", dmhl0);
                gfsx0 = gfqx.a;
            }
        }
        else {
            gfsx0 = gfqx.a;
        }
        if(!gfsx0.i()) {
            ((ggtj)dmay.a.h()).x("Unable to evaluate valuables info, not showing the bulletin");
            return false;
        }
        return ((Boolean)gfsx0.d()).booleanValue();
    }
}

