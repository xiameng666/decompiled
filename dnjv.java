import com.google.android.gms.pay.fops.details.FopDetailsFragment;
import java.util.Iterator;

public final class dnjv implements ibts {
    public final FopDetailsFragment a;

    public dnjv(FopDetailsFragment fopDetailsFragment0) {
        this.a = fopDetailsFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dnjs dnjs0 = this.a.z();
        if(!ibuq.m(dnjs0.s, ((String)object0))) {
            dnjs0.s = (String)object0;
            if(hwev.c()) {
                int v = 0;
                Iterator iterator0 = dnjs0.w.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v = -1;
                        break;
                    }
                    Object object1 = iterator0.next();
                    dnfp dnfp0 = (dnfp)object1;
                    if(dnfp0.m.i() && dnfp0.n.i()) {
                        break;
                    }
                    ++v;
                }
                if(v != -1) {
                    dnjs0.r(v + 1);
                    return ibom.a;
                }
                dnjs0.q();
                return ibom.a;
            }
            dnjs0.q();
        }
        return ibom.a;
    }
}

